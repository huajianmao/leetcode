package cn.hjmao.leetcode.a1002findcommoncharacters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/find-common-characters/
 *
 * Desc:
 * =====
 * Given an array A of strings made only from lowercase letters,
 * return a list of all characters that show up in all strings within the list (including duplicates).
 * For example, if a character occurs 3 times in all strings but not 4 times,
 * you need to include that character three times in the final answer.
 *
 * You may return the answer in any order.
 *
 *
 *
 * Example 1:
 * Input: ["bella","label","roller"]
 * Output: ["e","l","l"]
 *
 * Example 2:
 * Input: ["cool","lock","cook"]
 * Output: ["c","o"]
 *
 *
 * Note:
 * 1 <= A.length <= 100
 * 1 <= A[i].length <= 100
 * A[i][j] is a lowercase letterr
 */

class Solution {
  public List<String> commonChars(String[] a) {
    int[] chars = string2chars(a[0]);
    for (int i = 1; i < a.length; i++) {
      int[] thisChars = string2chars(a[i]);
      for (int j = 0; j < 26; j++) {
        chars[j] = Math.min(chars[j], thisChars[j]);
      }
    }

    List<String> result = new ArrayList<>();
    for (int i = 0; i < chars.length; i++) {
      for (int j = 0; j < chars[i]; j++) {
        result.add((char)('a' + i) + "");
      }
    }

    return result;
  }

  private int[] string2chars(String s) {
    int[] chars = new int[26];
    for (int i = 0; i < s.length(); i++) {
      chars[s.charAt(i) - 'a']++;
    }
    return chars;
  }
}
