package cn.hjmao.leetcode.a686repeatedstringmatch;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/repeated-string-match/
 *
 * Desc:
 * =====
 * Given two strings A and B, find the minimum number of times A has to be repeated such that B is a substring of it.
 * If no such solution, return -1.
 *
 * For example, with A = "abcd" and B = "cdabcdab".
 *
 * Return 3, because by repeating A three times (“abcdabcdabcd”),
 * B is a substring of it; and B is not a substring of A repeated two times ("abcdabcd").
 *
 * Note:
 * The length of A and B will be between 1 and 10000.
 */

class Solution {
  public int repeatedStringMatch(String a, String b) {
    int n = 0;
    StringBuilder sb = new StringBuilder();
    while (sb.length() < b.length()) {
      sb.append(a);
      n++;
    }
    if (sb.toString().contains(b)) {
      return n;
    }
    if (sb.append(a).toString().contains(b)) {
      return n + 1;
    }
    return -1;
  }
}
