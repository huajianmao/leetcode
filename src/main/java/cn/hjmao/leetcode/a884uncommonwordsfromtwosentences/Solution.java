package cn.hjmao.leetcode.a884uncommonwordsfromtwosentences;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/uncommon-words-from-two-sentences/
 *
 * Desc:
 * =====
 * We are given two sentences A and B.
 * (A sentence is a string of space separated words.  Each word consists only of lowercase letters.)
 *
 * A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
 *
 * Return a list of all uncommon words.
 *
 * You may return the list in any order.
 *
 *
 *
 * Example 1:
 * Input: A = "this apple is sweet", B = "this apple is sour"
 * Output: ["sweet","sour"]
 *
 * Example 2:
 * Input: A = "apple apple", B = "banana"
 * Output: ["banana"]
 *
 *
 * Note:
 * 0 <= A.length <= 200
 * 0 <= B.length <= 200
 * A and B both contain only spaces and lowercase letters..
 */

class Solution {
  public String[] uncommonFromSentences(String a, String b) {
    Map<String, Integer> wordCount = new HashMap<>();
    countArray(wordCount, a.split(" "));
    countArray(wordCount, b.split(" "));
    List<String> uncommon = new ArrayList<>();
    for (String word: wordCount.keySet()) {
      if (wordCount.get(word) == 1) {
        uncommon.add(word);
      }
    }
    String[] result = new String[uncommon.size()];
    return uncommon.toArray(result);
  }

  private void countArray(Map<String, Integer> wordCount, String[] words) {
    for (String word: words) {
      wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
    }
  }
}
