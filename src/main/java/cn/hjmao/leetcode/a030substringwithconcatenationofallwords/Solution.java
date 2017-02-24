package cn.hjmao.leetcode.a030substringwithconcatenationofallwords;

import java.util.*;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/substring-with-concatenation-of-all-words
 *
 * Desc:
 * =====
 * You are given a string, s, and a list of words, *words*,
 * that are all of the same length.
 *
 * Find all starting indices of substring(s) in s
 * that is a concatenation of each word in *words* exactly once and without any intervening characters.
 *
 * For example, given:
 * s: "barfoothefoobarman"
 * words: ["foo", "bar"]
 *
 * You should return the indices: [0,9].
 *
 * (order does not matter).
 */

public class Solution {
  public List<Integer> findSubstring(String s, String[] words) {
    List<Integer> indices = new ArrayList<>();
    if (s == null || words == null || words.length == 0 || words.length < words.length * words[0].length()) {
      return indices;
    }

    Map<String, Integer> wordCountMap = new HashMap<>();
    for (String word: words) {
      int count;
      if (wordCountMap.containsKey(word)) {
        count = wordCountMap.get(word) + 1;
      } else {
        count = 1;
      }
      wordCountMap.put(word, count);
    }

    int wordLength = words[0].length();
    for (int i = 0; i <= s.length() - wordLength; i++) {

    }

    return indices;
  }
}
