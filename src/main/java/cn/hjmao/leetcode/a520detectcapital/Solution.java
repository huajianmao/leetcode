package cn.hjmao.leetcode.a520detectcapital;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/detect-capital/
 *
 * Desc:
 * =====
 * Given a word, you need to judge whether the usage of capitals in it is right or not.
 *
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 *
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital if it has more than one letter, like "Google".
 * Otherwise, we define that this word doesn't use capitals in a right way.
 *
 * Example 1:
 * Input: "USA"
 * Output: True
 *
 * Example 2:
 * Input: "FlaG"
 * Output: False
 *
 * Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
 */

class Solution {
  public boolean detectCapitalUse(String word) {
    Set<Boolean> cases = new HashSet<>();
    for (int i = 1; i < word.length(); i++) {
      cases.add(Character.isUpperCase(word.charAt(i)));
    }
    return cases.size() <= 1
        && (cases.isEmpty()
        || cases.contains(false)
        || (cases.contains(true) && Character.isUpperCase(word.charAt(0))));
  }
}
