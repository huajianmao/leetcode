package cn.hjmao.leetcode.a500keyboardrow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/keyboard-row/
 *
 * Desc:
 * =====
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American
 * keyboard like the image below.
 *
 *
 *
 *
 *
 *
 * Example:
 *
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 * Output: ["Alaska", "Dad"]
 *
 *
 * Note:
 *
 * You may use one character in the keyboard more than once.
 * You may assume the input string will only contain letters of alphabet.
 */

class Solution {
  public String[] findWords(String[] words) {
    List<String> result = new ArrayList<>();
    int[] positions = {2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3};
    for (String word: words) {
      boolean success = true;
      for (int i = 1; i < word.length(); i++) {
        int row1 = positions[Character.toLowerCase(word.charAt(i)) - 'a'];
        int row2 = positions[Character.toLowerCase(word.charAt(i - 1)) - 'a'];
        if (row1 != row2) {
          success = false;
          break;
        }
      }
      if (success) {
        result.add(word);
      }
    }
    return result.toArray(new String[result.size()]);
  }
}
