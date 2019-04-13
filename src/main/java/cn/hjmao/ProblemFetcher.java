package cn.hjmao;

import okhttp3.*;
import org.json.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class ProblemFetcher {
  private static String SRC_BASE = String.join(File.separator, "src", "main", "java");
  private static String TEST_BASE = String.join(File.separator, "src", "test", "java");
  private static String PACKAGE_BASE = "cn.hjmao.leetcode";

  public static void main(String[] args) throws IOException {
    String questionUrl = "https://leetcode.com/problems/house-robber/";
    ProblemFetcher fetcher = new ProblemFetcher();
    fetcher.fetch(questionUrl);
  }

  private void fetch(String questionUrl) throws IOException {
    Map<String, String> map = getProblem(questionUrl);

    String packageName = PACKAGE_BASE + "." + map.get("packageName");
    String packageDir = packageName.replaceAll("\\.", File.separator);

    String pwd = System.getProperty("user.dir");
    String srcDir = String.join(File.separator, pwd, SRC_BASE, packageDir);
    String testDir = String.join(File.separator, pwd, TEST_BASE, packageDir);
    new File(srcDir).mkdirs();
    new File(testDir).mkdirs();

    String blankSolutionFile = String.join(File.separator,
        pwd,
        SRC_BASE,
        PACKAGE_BASE.replaceAll("\\.", File.separator),
        "blank",
        "Solution.java");
    String dstSolutionFile = String.join(File.separator,
        srcDir,
        "Solution.java");
    Files.copy(Paths.get(blankSolutionFile), Paths.get(dstSolutionFile));
    modifyContent(new File(dstSolutionFile), PACKAGE_BASE + ".blank", packageName);
  }

  private Map<String, String> getProblem(String questionUrl) throws IOException {
    Map<String, String> result = new HashMap<>();

    String graphqlUrl = "https://leetcode.com/graphql";
    Connection.Response response = Jsoup.connect(questionUrl)
        .method(Connection.Method.GET)
        .execute();
    String csrftoken = response.cookie("csrftoken");
    String cfduid = response.cookie("__cfduid");

    OkHttpClient client = new OkHttpClient.Builder()
        .followRedirects(false)
        .followSslRedirects(false)
        .build();

    String pattern = "https://leetcode.com/problems/(.*)/";
    String titleSlug = questionUrl.replaceAll(pattern, "$1");
    String postBody = "query{\n"
        + "  question(titleSlug:\"" + titleSlug + "\") {\n"
        + "    questionId,\n"
        + "    content,\n"
        + "  }\n"
        + "}\n";

    Request request = new Request.Builder()
        .addHeader("Content-Type", "application/graphql")
        .addHeader("Referer", questionUrl)
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

      String id = (String) question.get("questionId");
      id = String.format("%03d", Integer.parseInt(id));
      String content = (String) question.get("content");
      content = Jsoup.parse(content).text();
      String packageName = "a" + id + titleSlug.replaceAll("-", "");

      result.put("packageName", packageName);
      result.put("content", content);
      return result;
    } catch (Exception e) {
      System.out.println("Parse error! Create it manually please!");
      return null;
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
      fnfe.printStackTrace();
    } catch (IOException ioe) {
      ioe.printStackTrace();
    } finally {
      try {
        reader.close();
        writer.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}