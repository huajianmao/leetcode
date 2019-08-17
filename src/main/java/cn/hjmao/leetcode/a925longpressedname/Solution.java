package cn.hjmao.leetcode.a925longpressedname;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/long-pressed-name/
 *
 * Desc:
 * =====
 * Your friend is typing his name into a keyboard.
 * Sometimes, when typing a character c,
 * the key might get long pressed, and the character will be typed 1 or more times.
 *
 * You examine the typed characters of the keyboard.
 * Return True if it is possible that it was your friends name,
 * with some characters (possibly none) being long pressed.
 *
 *
 *
 * Example 1:
 * Input: name = "alex", typed = "aaleex"
 * Output: true
 * Explanation: 'a' and 'e' in 'alex' were long pressed.
 *
 * Example 2:
 * Input: name = "saeed", typed = "ssaaedd"
 * Output: false
 * Explanation: 'e' must have been pressed twice, but it wasn't in the typed output.
 *
 * Example 3:
 * Input: name = "leelee", typed = "lleeelee"
 * Output: true
 *
 * Example 4:
 * Input: name = "laiden", typed = "laiden"
 * Output: true
 * Explanation: It's not necessary to long press any character.
 *
 *
 * Note:
 * name.length <= 1000
 * typed.length <= 1000
 * The characters of name and typed are lowercase letters.
 */

class Solution {
  public boolean isLongPressedName(String name, String typed) {
    char c = '\0';
    int j = 0;
    for (int i = 0; i < name.length(); i++) {
      if (name.charAt(i) != c) {
        while (j < typed.length() && typed.charAt(j) == c) {
          j++;
        }
        c = name.charAt(i);
        if (j >= typed.length() || typed.charAt(j) != c) {
          return false;
        } else {
          j++;
        }
      } else {
        if (typed.charAt(j) != c) {
          return false;
        } else {
          j++;
        }
      }
    }
    while (j < typed.length() && typed.charAt(j) == c) {
      j++;
    }
    return j == typed.length();
  }
}
