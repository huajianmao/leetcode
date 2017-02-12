package cn.hjmao.leetcode.a017lettercombinationsofaphonenumber;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 *
 * Desc:
 * =====
 * Given a digit string, return all possible letter combinations that the number could represent.
 * A mapping of digit to letters (just like on the telephone buttons) is given on
 * [Wiki](http://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Telephone-keypad2.svg/200px-Telephone-keypad2.svg.png).
 *
 * Input:Digit string "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 *
 * Note:
 * Although the above answer is in lexicographical order, your answer could be in any order you want.
 */

public class Solution {
  private static final char[][] DIGIT_CHAR_MAP_ARRAY = {{' '}, // 0
      {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, // 1, 2, 3
      {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'}, // 4, 5, 6
      {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}}; // 7, 8, 9

  public List<String> letterCombinations(String digits) {
    if (digits == null || digits.length() == 0) {
      return null;
    }

    List<String> combinations = new ArrayList<>();
    for (int i = 0; i < digits.length(); i++) {
      char thisChar = digits.charAt(i);
    }

    return combinations;
  }
}
