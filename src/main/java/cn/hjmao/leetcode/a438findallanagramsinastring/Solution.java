package cn.hjmao.leetcode.a438findallanagramsinastring;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/
 *
 * Desc:
 * =====
 * Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
 *
 * Strings consists of lowercase English letters only
 * and the length of both strings s and p will not be larger than 20,100.
 *
 * The order of output does not matter.
 *
 * Example 1:
 *
 * Input:
 * s: "cbaebabacd" p: "abc"
 *
 * Output:
 * [0, 6]
 *
 * Explanation:
 * The substring with start index = 0 is "cba", which is an anagram of "abc".
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 * Example 2:
 *
 * Input:
 * s: "abab" p: "ab"
 *
 * Output:
 * [0, 1, 2]
 *
 * Explanation:
 * The substring with start index = 0 is "ab", which is an anagram of "ab".
 * The substring with start index = 1 is "ba", which is an anagram of "ab".
 * The substring with start index = 2 is "ab", which is an anagram of "ab".
 */

class Solution {
  public List<Integer> findAnagrams(String s, String p) {
    List<Integer> indices = new ArrayList<>();
    if (s.length() >= p.length()) {
      int[] letters = new int[26];
      for (int i = 0; i < p.length(); i++) {
        letters[p.charAt(i) - 'a']++;
      }

      int[] windowLetters = new int[26];
      for (int i = 0; i < p.length(); i++) {
        windowLetters[s.charAt(i) - 'a']++;
        if (arrayEquals(letters, windowLetters)) {
          indices.add(0);
        }
      }
      for (int i = 1; i <= s.length() - p.length(); i++) {
        windowLetters[s.charAt(i - 1) - 'a']--;
        windowLetters[s.charAt(i + p.length() - 1) - 'a']++;
        if (arrayEquals(letters, windowLetters)) {
          indices.add(i);
        }
      }
    }

    return indices;
  }

  private boolean arrayEquals(int[] array1, int[] array2) {
    if (array1.length != array2.length) {
      return false;
    }
    for (int i = 0; i < array1.length; i++) {
      if (array1[i] != array2[i]) {
        return false;
      }
    }
    return true;
  }
}
