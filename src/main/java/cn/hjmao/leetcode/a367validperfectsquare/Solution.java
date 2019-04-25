package cn.hjmao.leetcode.a367validperfectsquare;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/valid-perfect-square/
 *
 * Desc:
 * =====
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 *
 * Note: Do not use any built-in library function such as sqrt.
 *
 * Example 1:
 *
 * Input: 16
 * Output: true
 * Example 2:
 *
 * Input: 14
 * Output: false
 */

public class Solution {
  public boolean isPerfectSquare(int num) {
    int start = 1;
    int end = num;
    while (start <= end) {
      int half = (start + end) / 2;
      int left = num / half;
      if (left > half) {
        start = half + 1;
      } else if (left < half) {
        end = half - 1;
      } else {
        return left * half == num;
      }
    }
    return false;
  }
}
