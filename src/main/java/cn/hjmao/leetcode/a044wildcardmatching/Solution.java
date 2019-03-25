package cn.hjmao.leetcode.a044wildcardmatching;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/wildcard-matching
 *
 * Desc:
 * =====
 * Implement wildcard pattern matching with support for '?' and '*'.
 *
 * '?' Matches any single character.
 * '*' Matches any sequence of characters (including the empty sequence).
 *
 * The matching should cover the entire input string (not partial).
 *
 * The function prototype should be:
 * bool isMatch(const char *s, const char *p)
 *
 * Some examples:
 * isMatch("aa","a") → false
 * isMatch("aa","aa") → true
 * isMatch("aaa","aa") → false
 * isMatch("aa", "*") → true
 * isMatch("aa", "a*") → true
 * isMatch("ab", "?*") → true
 * isMatch("aab", "c*a*b") → false
 */

public class Solution {
  public boolean isMatch(String s, String p) {
    if (s.length() == 0) {
      for (int i = 0; i < p.length(); i++) {
        if (p.charAt(i) != '*') {
          return false;
        }
      }
      return true;
    } else {
      char first = s.charAt(0);
      if (p.length() == 0) {
        return false;
      } else {
        if (p.charAt(0) != '?' && p.charAt(0) != '*' && p.charAt(0) != first) {
          return false;
        } else if (p.charAt(0) == first) {
          return isMatch(s.substring(1, s.length()), p.substring(1, p.length()));
        } else if (p.charAt(0) == '?') {
          return isMatch(s.substring(1, s.length()), p.substring(1, p.length()));
        } else if (p.charAt(0) == '*') {
          return isMatch(s.substring(1, s.length()), p.substring(1, p.length()))
                  || isMatch(s.substring(1, s.length()), p)
                  || isMatch(s, p.substring(1, p.length()));
        } else {
          return false;
        }
      }
    }
  }
}
