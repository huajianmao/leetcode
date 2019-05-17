package cn.hjmao.leetcode.a557reversewordsinastringiii;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
 *
 * Desc:
 * =====
 * Given a string, you need to reverse the order of characters in each word within a sentence
 * while still preserving whitespace and initial word order.
 *
 * Example 1:
 * Input: "Let's take LeetCode contest"
 * Output: "s'teL ekat edoCteeL tsetnoc"
 *
 * Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */

class Solution {
  public String reverseWords(String s) {
    StringBuilder sb = new StringBuilder();
    for (String word: s.split(" ")) {
      StringBuilder temp = new StringBuilder(word);
      sb.append(temp.reverse()).append(" ");
    }
    return sb.substring(0, sb.length() - 1);
  }
}
