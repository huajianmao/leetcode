package cn.hjmao.leetcode.a917reverseonlyletters;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/reverse-only-letters/
 *
 * Desc:
 * =====
 * Given a string S, return the "reversed" string
 * where all characters that are not a letter stay in the same place, and all letters reverse their positions.
 *
 *
 *
 * Example 1:
 * Input: "ab-cd"
 * Output: "dc-ba"
 *
 * Example 2:
 * Input: "a-bC-dEf-ghIj"
 * Output: "j-Ih-gfE-dCba"
 *
 * Example 3:
 * Input: "Test1ng-Leet=code-Q!"
 * Output: "Qedo1ct-eeLg=ntse-T!"
 *
 *
 * Note:
 * S.length <= 100
 * 33 <= S[i].ASCIIcode <= 122
 * S doesn't contain \ or ""
 */

class Solution {
  public String reverseOnlyLetters(String s) {
    char[] chars = s.toCharArray();

    int i = 0;
    int j = s.length() - 1;
    while (i < j) {
      while (i < j && !isLetter(chars[i])) {
        i++;
      }

      while (i < j && !isLetter(chars[j])) {
        j--;
      }

      if (i < j) {
        swap(chars, i, j);
        i++;
        j--;
      }
    }
    return new String(chars);
  }

  private boolean isLetter(char c) {
    return ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z');
  }

  private void swap(char[] chars, int i, int j) {
    char tmp = chars[i];
    chars[i] = chars[j];
    chars[j] = tmp;
  }
}
