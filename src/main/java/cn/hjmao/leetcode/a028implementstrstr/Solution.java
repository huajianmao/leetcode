package cn.hjmao.leetcode.a028implementstrstr;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/implement-strstr/?tab=Description
 *
 * Desc:
 * =====
 * Implement strStr().
 *
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */

public class Solution {
  public int strStr(String haystack, String needle) {
    for (int i = 0; ; i++) {
      for (int j = 0; ; j++) {
        if (j == needle.length()) return i;
        if (i + j == haystack.length()) return -1;
        if (needle.charAt(j) != haystack.charAt(i + j)) break;
      }
    }
  }
}
