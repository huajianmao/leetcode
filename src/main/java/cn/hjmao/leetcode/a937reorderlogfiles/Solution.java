package cn.hjmao.leetcode.a937reorderlogfiles;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/reorder-log-files/
 *
 * Desc:
 * =====
 * You have an array of logs.  Each log is a space delimited string of words.
 *
 * For each log, the first word in each log is an alphanumeric identifier.  Then, either:
 *
 * Each word after the identifier will consist only of lowercase letters, or;
 * Each word after the identifier will consist only of digits.
 * We will call these two varieties of logs letter-logs and digit-logs.
 * It is guaranteed that each log has at least one word after its identifier.
 *
 * Reorder the logs so that all of the letter-logs come before any digit-log.
 * The letter-logs are ordered lexicographically ignoring identifier, with the identifier used in case of ties.
 * The digit-logs should be put in their original order.
 *
 * Return the final order of the logs.
 *
 *
 *
 * Example 1:
 * Input: ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
 * Output: ["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
 *
 *
 * Note:
 * 0 <= logs.length <= 100
 * 3 <= logs[i].length <= 100
 * logs[i] is guaranteed to have an identifier, and a word after the identifier..
 */

class Solution {
  public String[] reorderLogFiles(String[] logs) {
    List<String> digitalLogs = new ArrayList<>();
    SortedSet<String> letterLogs = new TreeSet<>(new Comp());
    for (String log: logs) {
      String[] words = log.split(" ");
      char c = words[1].charAt(0);
      if ('0' <= c && c <= '9') {
        digitalLogs.add(log);
      } else {
        letterLogs.add(log);
      }
    }
    String[] result = new String[logs.length];
    letterLogs.toArray(result);
    int letterLogCount = letterLogs.size();
    for (int i = letterLogCount; i < result.length; i++) {
      result[i] = digitalLogs.get(i - letterLogCount);
    }

    return result;
  }

  class Comp implements Comparator<String> {
    @Override
    public int compare(String log1, String log2) {
      int start1 = log1.indexOf(' ');
      int start2 = log2.indexOf(' ');
      int result = log1.substring(start1).compareTo(log2.substring(start2));
      if (result == 0) {
        result = log1.substring(0, start1).compareTo(log2.substring(0, start2));
      }
      return result;
    }
  }
}
