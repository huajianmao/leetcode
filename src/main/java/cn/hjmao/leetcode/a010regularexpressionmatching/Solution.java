package cn.hjmao.leetcode.a010regularexpressionmatching;

/**
 * Created by hjmao.
 * <p>
 * URL:
 * =====
 * https://leetcode.com/problems/regular-expression-matching/
 * <p>
 * Desc:
 * =====
 * Implement regular expression matching with support for '.' and '*'.
 * <p>
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * <p>
 * The matching should cover the entire input string (not partial).
 * <p>
 * The function prototype should be:
 * bool isMatch(const char *s, const char *p)
 * <p>
 * Some examples:
 * isMatch("aa","a") → false
 * isMatch("aa","aa") → true
 * isMatch("aaa","aa") → false
 * isMatch("aa", "a*") → true
 * isMatch("aa", ".*") → true
 * isMatch("ab", ".*") → true
 * isMatch("aab", "c*a*b") → true
 */

public class Solution {

  /**
   * Solution by monkeyGoCrazy@Leetcode
   * https://discuss.leetcode.com/topic/40371/easy-dp-java-solution-with-detailed-explanation
   *
   * 1, If p.charAt(j) == s.charAt(i) :  dp[i][j] = dp[i-1][j-1];
   * 2, If p.charAt(j) == '.' : dp[i][j] = dp[i-1][j-1];
   * 3, If p.charAt(j) == '*':
   *     here are two sub conditions:
   *     1   if p.charAt(j-1) != s.charAt(i) : dp[i][j] = dp[i][j-2]  // a* only counts as empty
   *     2   if p.charAt(i-1) == s.charAt(i) or p.charAt(i-1) == '.':
   *             dp[i][j] = dp[i-1][j]    //in this case, a* counts as multiple a
   *          or dp[i][j] = dp[i][j-1]   // in this case, a* counts as single a
   *          or dp[i][j] = dp[i][j-2]   // in this case, a* counts as empty
   */
  public boolean solutionByMonkeyGoCrazy(String s, String p) {
    if (s == null || p == null || p.startsWith("*")) {
      return false;
    }
    boolean[][] state = new boolean[s.length() + 1][p.length() + 1];
    state[0][0] = true;
    for (int i = 0; i < p.length(); i++) {
      if (p.charAt(i) == '*' && state[0][i - 1]) {
        state[0][i + 1] = true;
      }
    }
    for (int i = 0; i < s.length(); i++) {
      for (int j = 0; j < p.length(); j++) {
        char currentPChar = p.charAt(j);
        if (currentPChar == '*') {
          char prevPChar = p.charAt(j - 1);
          if (prevPChar != s.charAt(i) && prevPChar != '.') {
            state[i + 1][j + 1] = state[i + 1][j - 1];
          } else {
            state[i + 1][j + 1] = state[i + 1][j] || state[i][j + 1] || state[i + 1][j - 1];
          }
        } else {
          state[i + 1][j + 1] = state[i][j] && (currentPChar == '.' || currentPChar == s.charAt(i));
        }
      }
    }
    return state[s.length()][p.length()];
  }

  public boolean isMatch(String s, String p) {
    return solutionByMonkeyGoCrazy(s, p);
  }
}
