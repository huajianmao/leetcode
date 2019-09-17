package cn.hjmao.leetcode.a1047removealladjacentduplicatesinstring;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
 *
 * Desc:
 * =====
 * Given a string S of lowercase letters,
 * a duplicate removal consists of choosing two adjacent and equal letters, and removing them.
 *
 * We repeatedly make duplicate removals on S until we no longer can.
 *
 * Return the final string after all such duplicate removals have been made.
 * It is guaranteed the answer is unique.
 *
 *
 *
 * Example 1:
 *
 * Input: "abbaca"
 * Output: "ca"
 * Explanation:
 * For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal,
 * and this is the only possible move.
 * The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
 *
 *
 * Note:
 *
 * 1 <= S.length <= 20000
 * S consists only of English lowercase letters.
 */

class Solution {
  public String removeDuplicates(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      int lastIndex = sb.length() - 1;
      if (sb.length() > 0 && s.charAt(i) == sb.charAt(lastIndex)) {
        sb.deleteCharAt(lastIndex);
      } else {
        sb.append(s.charAt(i));
      }
    }
    return sb.toString();
  }
}
