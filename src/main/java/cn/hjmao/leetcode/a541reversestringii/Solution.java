package cn.hjmao.leetcode.a541reversestringii;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/reverse-string-ii/
 *
 * Desc:
 * =====
 * Given a string and an integer k,
 * you need to reverse the first k characters for every 2k characters counting from the start of the string.
 * If there are less than k characters left, reverse all of them.
 * If there are less than 2k but greater than or equal to k characters,
 * then reverse the first k characters and left the other as original.
 *
 * Example:
 * Input: s = "abcdefg", k = 2
 * Output: "bacdfeg"
 *
 * Restrictions:
 * The string consists of lower English letters only.
 * Length of the given string and k will in the range [1, 10000]
 */

class Solution {
  public String reverseStr(String s, int k) {
    if (s == null) {
      return null;
    }

    StringBuilder sb = new StringBuilder();
    for (int start = 0; start < s.length(); start += 2 * k) {
      StringBuilder reverser = new StringBuilder(s.substring(start, Math.min(s.length(), start + k)));
      sb.append(reverser.reverse().toString());
      if (start + k < s.length()) {
        sb.append(s.substring(start + k, Math.min(start + 2 * k, s.length())));
      }
    }

    return sb.toString();
  }
}
