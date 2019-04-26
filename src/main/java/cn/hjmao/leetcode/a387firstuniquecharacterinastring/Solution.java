package cn.hjmao.leetcode.a387firstuniquecharacterinastring;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 *
 * Desc:
 * =====
 * Given a string, find the first non-repeating character in it and return it's index.
 * If it doesn't exist, return -1.
 *
 * Examples:
 *
 * s = "leetcode"
 * return 0.
 *
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 */

public class Solution {
  public int firstUniqChar(String s) {
    int[] letters = new int[26];

    for (int i = 0; i < 26; i++) {
      letters[i] = -1;
    }

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (letters[c - 'a'] == -1) {
        letters[c - 'a'] = i;
      } else if (letters[c - 'a'] >= 0) {
        letters[c - 'a'] = -2;
      }
    }

    int pos = s.length();
    for (int i = 0; i < 26; i++) {
      if (letters[i] >= 0) {
        pos = Math.min(letters[i], pos);
      }
    }

    return pos == s.length() ? -1 : pos;
  }
}
