package cn.hjmao.leetcode.a459repeatedsubstringpattern;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/repeated-substring-pattern/
 *
 * Desc:
 * =====
 * Given a non-empty string check if it can be constructed
 * by taking a substring of it and appending multiple copies of the substring together.
 * You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.
 *
 *
 *
 * Example 1:
 *
 * Input: "abab"
 * Output: True
 * Explanation: It's the substring "ab" twice.
 * Example 2:
 *
 * Input: "aba"
 * Output: False
 * Example 3:
 *
 * Input: "abcabcabcabc"
 * Output: True
 * Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
 */

class Solution {
  public boolean repeatedSubstringPattern(String s) {
    for (int i = 1; i <= s.length() / 2; i++) {
      if (isRepeatWithLength(s, i)) {
        return true;
      }
    }

    return false;
  }

  private boolean isRepeatWithLength(String s, int length) {
    if (s.length() % length == 0 && s.length() > length) {
      for (int j = 0; j < length; j++) {
        for (int k = 1; k < s.length() / length; k++) {
          if (s.charAt(j) != s.charAt(k * length + j)) {
            return false;
          }
        }
      }
      return true;
    } else {
      return false;
    }
  }
}
