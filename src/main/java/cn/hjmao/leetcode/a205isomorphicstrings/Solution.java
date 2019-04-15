package cn.hjmao.leetcode.a205isomorphicstrings;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/isomorphic-strings/
 *
 * Desc:
 * =====
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character but a character may map to itself.
 *
 * Example 1:
 *
 * Input: s = "egg", t = "add"
 * Output: true
 * Example 2:
 *
 * Input: s = "foo", t = "bar"
 * Output: false
 * Example 3:
 *
 * Input: s = "paper", t = "title"
 * Output: true
 * Note:
 * You may assume both s and t have the same length.
 */

public class Solution {

  public boolean isIsomorphic(String s, String t) {
    Map<Character, Character> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char sChar = s.charAt(i);
      char tChar = t.charAt(i);
      if (!map.containsKey(sChar)) {
        if (map.containsValue(tChar)) {
          return false;
        } else {
          map.put(sChar, t.charAt(i));
        }
      } else if (map.get(sChar) != t.charAt(i)) {
        return false;
      }
    }
    return true;
  }
}
