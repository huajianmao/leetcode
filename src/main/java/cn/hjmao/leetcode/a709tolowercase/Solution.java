package cn.hjmao.leetcode.a709tolowercase;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/to-lower-case/
 *
 * Desc:
 * =====
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 *
 *
 *
 * Example 1:
 *
 * Input: "Hello"
 * Output: "hello"
 * Example 2:
 *
 * Input: "here"
 * Output: "here"
 * Example 3:
 *
 * Input: "LOVELY"
 * Output: "lovely"
 */

class Solution {
  public String toLowerCase(String str) {
    if (str == null) {
      return null;
    } else {
      StringBuilder sb = new StringBuilder();
      int delta = 'A' - 'a';
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
          sb.append((char)(str.charAt(i) - delta));
        } else {
          sb.append(str.charAt(i));
        }
      }
      return sb.toString();
    }
  }
}
