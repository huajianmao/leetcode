package cn.hjmao.leetcode.a005longestpalindromicsubstring;

/**
 * Created by hjmao on 17/01/2017.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/longest-palindromic-substring/
 *
 * Desc:
 * =====
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 *
 * Example:
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 *
 * Example:
 * Input: "cbbd"
 * Output: "bb"
 */

public class Solution {
  private int start;
  private int length;

  private void findLongestStringWithReverseOrder(String s, int i, int left, int right) {
    for (int j = 0; j <= i; j++) {
        if (left - j < 0 || right + j > s.length() - 1) {
          break;
        }
        char prev = s.charAt(left - j);
        char next = s.charAt(right + j);

        if (prev != next) {
          break;
        }

        if (this.length < right - left + 2 * j) {
          this.start = left - j;
          this.length = right - left + 2 * j;
        }
      }
  }

  public String longestPalindrome(String s) {
    String palindrome = "";

    for (int i = 0; i < s.length(); i++) {
      findLongestStringWithReverseOrder(s, i, i, i + 1);
      findLongestStringWithReverseOrder(s, i, i, i);
    }

    return s.substring(this.start, this.start + this.length + 1);
  }
}
