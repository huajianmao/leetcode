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
    int sIndex = 0;
    int pIndex = 0;
    int match = 0;
    int pStarIdx = -1;

    while (sIndex < s.length()) {
      if (pIndex < p.length() && (p.charAt(pIndex) == '?' || s.charAt(sIndex) == p.charAt(pIndex))) {
        // advancing both pointers
        sIndex++;
        pIndex++;
      } else if (pIndex < p.length() && p.charAt(pIndex) == '*') {
        // * found, only advancing pattern pointer
        pStarIdx = pIndex;
        match = sIndex;
        pIndex++;
      } else if (pStarIdx != -1) {
        // last pattern pointer was *, advancing string pointer
        pIndex = pStarIdx + 1;
        match++;
        sIndex = match;
      } else {
        // current pattern pointer is not star,
        // last patter pointer was not *
        // characters do not match
        return false;
      }
    }

    //check for remaining characters in pattern
    while (pIndex < p.length() && p.charAt(pIndex) == '*') {
      pIndex++;
    }

    return pIndex == p.length();
  }

  public boolean isMatch1(String s, String p) {
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
