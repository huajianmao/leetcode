package cn.hjmao.leetcode.a290wordpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/word-pattern/
 *
 * Desc:
 * =====
 * Given a pattern and a string str, find if str follows the same pattern.
 *
 * Here follow means a full match,
 * such that there is a bijection between a letter in pattern and a non-empty word in str.
 *
 * Example 1:
 *
 * Input: pattern = "abba", str = "dog cat cat dog"
 * Output: true
 * Example 2:
 *
 * Input:pattern = "abba", str = "dog cat cat fish"
 * Output: false
 * Example 3:
 *
 * Input: pattern = "aaaa", str = "dog cat cat dog"
 * Output: false
 * Example 4:
 *
 * Input: pattern = "abba", str = "dog dog dog dog"
 * Output: false
 * Notes:
 * You may assume pattern contains only lowercase letters,
 * and str contains lowercase letters that may be separated by a single space.
 */

public class Solution {
  public boolean wordPattern(String pattern, String str) {
    String[] words = str.split(" ");
    int n = words.length;
    if (pattern.length() != n) {
      return false;
    }

    Map<Character, String> map = new HashMap<>();
    for (int i = 0; i < n; i++) {
      char patternChar = pattern.charAt(i);
      if (map.containsKey(patternChar)) {
        if (!map.get(patternChar).equals(words[i])) {
          return false;
        }
      } else {
        if (map.containsValue(words[i])) {
          return false;
        }
        map.put(patternChar, words[i]);
      }
    }

    return true;
  }
}
