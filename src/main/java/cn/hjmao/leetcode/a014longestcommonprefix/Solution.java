package cn.hjmao.leetcode.a014longestcommonprefix;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/longest-common-prefix/
 *
 * Desc:
 * =====
 * Write a function to find the longest common prefix string amongst an array of strings.
 */

public class Solution {
  public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) {
      return "";
    }

    String first = strs[0];
    for (int i = 0; i < first.length(); i++) {
      char thisChar = first.charAt(i);
      for (int j = 1; j < strs.length; j++) {
        if (i >= strs[j].length() || thisChar != strs[j].charAt(i)) {
          return first.substring(0, i);
        }
      }
    }

    return first;
  }
}
