package cn.hjmao;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Whitelist;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * This class fetch the leetcode problem with the GraphQL api.
 *
 * @author  Huajian Mao
 */
public class ProblemFetcher {
  private static final Logger LOGGER = LoggerFactory.getLogger(ProblemFetcher.class);
  private static String SRC_BASE = String.join(File.separator, "src", "main", "java");
  private static String TEST_BASE = String.join(File.separator, "src", "test", "java");
  private static String PACKAGE_BASE = "com.leetcode.snippets";

  private String url;
  private String path;

  public ProblemFetcher(String url, String path) {
    this.url = url;
    this.path = path;
  }

  /**
   * Fetch runner.
   *
   * For each time you want fetch a problem, set the questionUrl please!
   */
  public static void main(String[] args) throws IOException {
    String questionUrl = "https://leetcode.com/problems/path-sum-iii/";
    String pwd = System.getProperty("user.dir");
    ProblemFetcher fetcher = new ProblemFetcher(questionUrl, pwd);
    fetcher.fetch();
  }

  public boolean fetch() throws IOException {
    if (this.url == null || this.path == null) {
      return false;
    }

    Map<String, String> map = getProblem();

    String packageName = PACKAGE_BASE + "." + map.get("packageName");
    String packageDir = packageName.replaceAll("\\.", File.separator);
    String srcDir = String.join(File.separator, this.path, SRC_BASE, packageDir);
    String testDir = String.join(File.separator, this.path, TEST_BASE, packageDir);
    new File(srcDir).mkdirs();
    new File(testDir).mkdirs();

    String blankSolutionFile = String.join(File.separator,
        this.path,
        SRC_BASE,
        PACKAGE_BASE.replaceAll("\\.", File.separator),
        "blank",
        "Solution.java");
    String dstSolutionFile = String.join(File.separator,
        srcDir,
        "Solution.java");
    Files.copy(Paths.get(blankSolutionFile), Paths.get(dstSolutionFile));
    modifyContent(new File(dstSolutionFile), PACKAGE_BASE + ".blank", packageName);
    modifyContent(new File(dstSolutionFile), "https://leetcode.com/problems/PROBLEM_TITLE/", this.url);
    modifyContent(new File(dstSolutionFile), "PROBLEM DESCRIPTION.", map.get("content"));
    modifyContent(new File(dstSolutionFile), "public class Solution \\{ \\}", map.get("code"));

    return true;
  }

  private Map<String, String> getProblem() throws IOException {
    Map<String, String> result = new HashMap<>();

    String graphqlUrl = "https://leetcode.com/graphql";
    Connection.Response response = Jsoup.connect(this.url)
        .method(Connection.Method.GET)
        .execute();
    String csrftoken = response.cookie("csrftoken");
    String cfduid = response.cookie("__cfduid");

    OkHttpClient client = new OkHttpClient.Builder()
        .followRedirects(false)
        .followSslRedirects(false)
        .build();

    String pattern = "https://leetcode.com/problems/(.*)/";
    String titleSlug = this.url.replaceAll(pattern, "$1");
    String postBody = "query{\n"
        + "  question(titleSlug:\"" + titleSlug + "\") {\n"
        + "    questionId,\n"
        + "    questionFrontendId,\n"
        + "    content,\n"
        + "    codeSnippets {\n"
        + "      langSlug, \n"
        + "      code, \n"
        + "    },\n"
        + "  }\n"
        + "}\n";

    Request request = new Request.Builder()
        .addHeader("Content-Type", "application/graphql")
        .addHeader("Referer", this.url)
        .addHeader("Cookie", "__cfduid=" + cfduid + ";" + "csrftoken=" + csrftoken)
        .addHeader("x-csrftoken", csrftoken)
        .url(graphqlUrl)
        .post(RequestBody.create(MediaType.parse("application/graphql; charset=utf-8"), postBody))
        .build();

    Response response1 = client.newCall(request).execute();
    String json = response1.body().string().toString();
    JSONObject jsonObject = new JSONObject(json);
    try {
      JSONObject data = (JSONObject) jsonObject.get("data");
      JSONObject question = (JSONObject) data.get("question");

      String id = (String) question.get("questionFrontendId");
      id = String.format("%03d", Integer.parseInt(id));
      String content = (String) question.get("content");
      Document document = Jsoup.parse(content);
      document.outputSettings(new Document.OutputSettings().prettyPrint(false));
      document.select("br").append("\n");
      document.select("p").prepend("\n\n");
      content = Jsoup.clean(
          document.html(),
          "",
          Whitelist.none(),
          new Document.OutputSettings().prettyPrint(false)
      );
      content = content.replaceAll("\r\n", "\n").trim();
      content = content.replaceAll("\n", "HJMAO_LINE_BREAK * ");
      content = Jsoup.parse(content).text();
      content = content.replaceAll("HJMAO_LINE_BREAK \\* ", "\n \\* ");

      String packageName = "a" + id + titleSlug.replaceAll("-", "");

      JSONArray codeSnippets = (JSONArray) question.get("codeSnippets");
      String code = null;
      for (Object object: codeSnippets) {
        JSONObject codeSnippet = (JSONObject) object;
        if ("java".equals(codeSnippet.get("langSlug"))) {
          code = (String) codeSnippet.get("code");
          break;
        }
      }

      result.put("packageName", packageName);
      result.put("content", content);
      if (code != null) {
        result.put("code", code);
      }
      return result;
    } catch (Exception e) {
      System.out.println("Parse error! Create it manually please!");
      return new HashMap<>();
    }
  }

  private void modifyContent(File file, String from, String to) throws FileNotFoundException {
    BufferedReader reader = null;
    FileWriter writer = null;
    try {
      reader = new BufferedReader(new FileReader(file));
      String line = reader.readLine();
      String newContent = "";
      while (line != null) {
        newContent += line.replaceAll(from, to) + System.lineSeparator();
        line = reader.readLine();
      }
      writer = new FileWriter(file);
      writer.write(newContent);
    } catch (FileNotFoundException fnfe) {
      LOGGER.error("file not found", fnfe);
      // fnfe.printStackTrace();
    } catch (IOException ioe) {
      LOGGER.error("io exception", ioe);
      // ioe.printStackTrace();
    } finally {
      if (reader != null) {
        try {
          reader.close();
        } catch (IOException e) {
          LOGGER.error("io exception", e);
          // e.printStackTrace();
        }
      }
      if (writer != null) {
        try {
          writer.close();
        } catch (IOException e) {
          LOGGER.error("context", e);
          // e.printStackTrace();
        }
      }
    }
  }
}
