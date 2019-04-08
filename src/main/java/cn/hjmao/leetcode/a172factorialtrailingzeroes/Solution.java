package cn.hjmao.leetcode.a172factorialtrailingzeroes;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/factorial-trailing-zeroes/
 *
 * Desc:
 * =====
 * Given an integer n, return the number of trailing zeroes in n!.
 *
 * Example 1:
 *
 * Input: 3
 * Output: 0
 * Explanation: 3! = 6, no trailing zero.
 * Example 2:
 *
 * Input: 5
 * Output: 1
 * Explanation: 5! = 120, one trailing zero.
 * Note: Your solution should be in logarithmic time complexity.
 */

public class Solution {
  public int trailingZeroes(int n) {
    int zeros = 0;
    while (n / 5 > 0) {
      zeros += n / 5;
      n = n / 5;
    }
    return zeros;
  }
}
