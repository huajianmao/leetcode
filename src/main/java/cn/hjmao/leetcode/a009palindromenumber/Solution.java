package cn.hjmao.leetcode.a009palindromenumber;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/palindrome-number/
 *
 * Desc:
 * =====
 * Determine whether an integer is a palindrome. Do this without extra space.
 */

public class Solution {
  public boolean isPalindrome(int x) {
    if (x < 0) {
      return false;
    }

    int left = x;
    int reverse = 0;
    while (left / 10 > 0) {
      reverse = reverse * 10 + left % 10;
      left = left / 10;
    }
    reverse = reverse * 10 + left % 10;

    return x == reverse;
  }
}
