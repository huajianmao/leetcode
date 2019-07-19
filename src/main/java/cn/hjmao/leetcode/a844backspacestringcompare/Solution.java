package cn.hjmao.leetcode.a844backspacestringcompare;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/backspace-string-compare/
 *
 * Desc:
 * =====
 * Given two strings S and T, return if they are equal when both are typed into empty text editors.
 * # means a backspace character.
 *
 * Example 1:
 *
 * Input: S = "ab#c", T = "ad#c"
 * Output: true
 * Explanation: Both S and T become "ac".
 *
 * Example 2:
 * Input: S = "ab##", T = "c#d#"
 * Output: true
 * Explanation: Both S and T become "".
 *
 * Example 3:
 * Input: S = "a##c", T = "#a#c"
 * Output: true
 * Explanation: Both S and T become "c".
 *
 * Example 4:
 * Input: S = "a#c", T = "b"
 * Output: false
 * Explanation: S becomes "c" while T becomes "b".
 *
 * Note:
 * 1 <= S.length <= 200
 * 1 <= T.length <= 200
 * S and T only contain lowercase letters and '#' characters.
 *
 * Follow up:
 * Can you solve it in O(N) time and O(1) space??
 */

class Solution {
  public boolean backspaceCompare(String s, String t) {
    int[] sIndexAndBack = {s.length() - 1, 0};
    int[] tIndexAndBack = {t.length() - 1, 0};
    while (sIndexAndBack[0] >= 0 || tIndexAndBack[0] >= 0) {
      doBack(sIndexAndBack, s);
      char left = sIndexAndBack[0] < 0 ? '@' : s.charAt(sIndexAndBack[0]);

      doBack(tIndexAndBack, t);
      char right = tIndexAndBack[0] < 0 ? '@' : t.charAt(tIndexAndBack[0]);

      if (left != right) {
        return false;
      }
      sIndexAndBack[0]--;
      tIndexAndBack[0]--;
    }

    return true;
  }

  private void doBack(int[] indexAndBack, String str) {
    while (indexAndBack[0] >= 0 && (indexAndBack[1] > 0 || str.charAt(indexAndBack[0]) == '#')) {
      if (str.charAt(indexAndBack[0]) == '#') {
        indexAndBack[1]++;
      } else {
        indexAndBack[1]--;
      }
      indexAndBack[0]--;
    }
  }
}
