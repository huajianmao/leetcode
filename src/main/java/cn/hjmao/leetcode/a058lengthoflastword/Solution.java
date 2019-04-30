package cn.hjmao.leetcode.a058lengthoflastword;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/length-of-last-word/
 *
 * Desc:
 * =====
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
 * return the length of last word in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a character sequence consists of non-space characters only.
 */

public class Solution {
  public int lengthOfLastWord(String s) {
    int length = 0;
    int i = s.length() - 1;
    for (; i >= 0; i--) {
      if (s.charAt(i) != ' ') {
        break;
      }
    }
    for (; i >= 0; i--) {
      if (s.charAt(i) != ' ') {
        length++;
      } else {
        break;
      }
    }

    return length;
  }
}
