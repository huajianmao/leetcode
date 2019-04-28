package cn.hjmao.leetcode.a409longestpalindrome;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/longest-palindrome/
 *
 * Desc:
 * =====
 * Given a string which consists of lowercase or uppercase letters,
 * find the length of the longest palindromes that can be built with those letters.
 *
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 *
 * Note:
 * Assume the length of given string will not exceed 1,010.
 *
 * Example:
 *
 * Input:
 * "abccccdd"
 *
 * Output:
 * 7
 *
 * Explanation:
 * One longest palindrome that can be built is "dccaccd", whose length is 7.
 */

public class Solution {
  public int longestPalindrome(String s) {
    int[] count = new int[58];
    for (int i = 0; i < s.length(); i++) {
      count[s.charAt(i) - 'A']++;
    }
    int longest = 0;
    boolean hasSingle = false;
    for (int i = 0; i < count.length; i++) {
      if (count[i] % 2 == 0) {
        longest += count[i];
      } else {
        hasSingle = true;
        longest += count[i] - 1;
      }
    }
    return hasSingle ? longest + 1 : longest;
  }
}
