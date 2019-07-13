package cn.hjmao.leetcode.a821shortestdistancetoacharacter;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/shortest-distance-to-a-character/
 *
 * Desc:
 * =====
 * Given a string S and a character C,
 * return an array of integers representing the shortest distance from the character C in the string.
 *
 * Example 1:
 *
 * Input: S = "loveleetcode", C = 'e'
 * Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 *
 *
 * Note:
 *
 * S string length is in [1, 10000].
 * C is a single character, and guaranteed to be in string S.
 * All letters in S and C are lowercase.
 */

class Solution {
  public int[] shortestToChar(String s, char c) {
    int[] distances = new int[s.length()];
    int pos = -s.length();
    for (int i = 0; i < s.length(); ++i) {
      if (s.charAt(i) == c) {
        pos = i;
      }
      distances[i] = i - pos;
    }
    for (int i = s.length() - 1; i >= 0; --i) {
      if (s.charAt(i) == c)  {
        pos = i;
      }
      distances[i] = Math.min(distances[i], Math.abs(i - pos));
    }
    return distances;
  }
}
