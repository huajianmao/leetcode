package cn.hjmao.leetcode.a748shortestcompletingword;

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
 * https://leetcode.com/problems/shortest-completing-word/
 *
 * Desc:
 * =====
 * Find the minimum length word from a given dictionary words, which has all the letters from the string licensePlate.
 * Such a word is said to complete the given string licensePlate
 *
 * Here, for letters we ignore case. For example, "P" on the licensePlate still matches "p" on the word.
 *
 * It is guaranteed an answer exists. If there are multiple answers, return the one that occurs first in the array.
 *
 * The license plate might have the same letter occurring multiple times.
 * For example,
 * given a licensePlate of "PP", the word "pair" does not complete the licensePlate, but the word "supper" does.
 *
 * Example 1:
 * Input: licensePlate = "1s3 PSt", words = ["step", "steps", "stripe", "stepple"]
 * Output: "steps"
 * Explanation: The smallest length word that contains the letters "S", "P", "S", and "T".
 * Note that the answer is not "step", because the letter "s" must occur in the word twice.
 * Also note that we ignored case for the purposes of comparing whether a letter exists in the word.
 *
 * Example 2:
 * Input: licensePlate = "1s3 456", words = ["looks", "pest", "stew", "show"]
 * Output: "pest"
 * Explanation: There are 3 smallest length words that contains the letters "s".
 * We return the one that occurred first.
 *
 * Note:
 * licensePlate will be a string with length in range [1, 7].
 * licensePlate will contain digits, spaces, or letters (uppercase or lowercase).
 * words will have a length in the range [10, 1000].
 * Every words[i] will consist of lowercase letters, and have length in range [1, 15].
 */

class Solution {
  public String shortestCompletingWord(String licensePlate, String[] words) {
    Map<Character, Integer> letters = new HashMap<>();
    for (char c: licensePlate.toLowerCase().toCharArray()) {
      if (c >= 'a' && c <= 'z') {
        letters.put(c, letters.getOrDefault(c, 0) + 1);
      }
    }

    String shortest = null;
    for (String word: words) {
      if (shortest == null || shortest.length() > word.length()) {
        if (wordContainsAllChars(word, letters)) {
          shortest = word;
        }
      }
    }

    return shortest;
  }

  private boolean wordContainsAllChars(String word, Map<Character, Integer> letterMap) {
    Map<Character, Integer> letters = new HashMap<>(letterMap);
    for (char c: word.toLowerCase().toCharArray()) {
      if (letters.isEmpty()) {
        return true;
      } else if (letters.containsKey(c)) {
        int remain = letters.get(c) - 1;
        if (remain == 0) {
          letters.remove(c);
        } else {
          letters.put(c, remain);
        }
      }
    }
    return letters.isEmpty();
  }
}
