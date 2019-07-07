package cn.hjmao.leetcode.a784lettercasepermutation;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/letter-case-permutation/
 *
 * Desc:
 * =====
 * Given a string S, we can transform every letter individually to be lowercase or uppercase to create another string.
 * Return a list of all possible strings we could create.
 *
 * Examples:
 * Input: S = "a1b2"
 * Output: ["a1b2", "a1B2", "A1b2", "A1B2"]
 *
 * Input: S = "3z4"
 * Output: ["3z4", "3Z4"]
 *
 * Input: S = "12345"
 * Output: ["12345"]
 *
 *
 * Note:
 * S will be a string with length between 1 and 12.
 * S will consist only of letters or digits.
 */

class Solution {
  public List<String> letterCasePermutation(String s) {
    List<String> permutation = new ArrayList<>();
    helper(s.toCharArray(), permutation, 0);
    return permutation;
  }

  public void helper(char[] chars, List<String> permutation, int index) {
    if (index == chars.length) {
      permutation.add(new String(chars));
      return;
    }

    if (chars[index] >= '0' && chars[index] <= '9') {
      helper(chars, permutation, index + 1);
      return;
    }

    chars[index] = Character.toLowerCase(chars[index]);
    helper(chars, permutation, index + 1);

    chars[index] = Character.toUpperCase(chars[index]);
    helper(chars, permutation, index + 1);
  }
}
