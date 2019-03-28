package cn.hjmao.leetcode.a125validpalindrome;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/valid-palindrome/
 *
 * Desc:
 * =====
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Example 1:
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 *
 * Input: "race a car"
 * Output: false
 */

public class Solution {

  public boolean isPalindrome(String s) {
    s = s.toLowerCase();
    int startIndex = 0;
    int endIndex = s.length() - 1;

    while (startIndex < endIndex) {
      if (!Character.isLetterOrDigit(s.charAt(startIndex))) {
        startIndex++;
        continue;
      }
      if (!Character.isLetterOrDigit(s.charAt(endIndex))) {
        endIndex--;
        continue;
      }
      if (s.charAt(startIndex) != s.charAt(endIndex)) {
        return false;
      } else {
        startIndex++;
        endIndex--;
      }
    }

    return true;
  }
}
