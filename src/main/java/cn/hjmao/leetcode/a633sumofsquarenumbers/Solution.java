package cn.hjmao.leetcode.a633sumofsquarenumbers;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/sum-of-square-numbers/
 *
 * Desc:
 * =====
 * Given a non-negative integer c, your task is to decide whether there're two integers a and b such that a^2 + b^2 = c.
 *
 * Example 1:
 *
 * Input: 5
 * Output: True
 * Explanation: 1 * 1 + 2 * 2 = 5
 *
 *
 * Example 2:
 *
 * Input: 3
 * Output: False*
 */

class Solution {
  public boolean judgeSquareSum(int c) {
    int  max = (int) Math.sqrt(c / 2);
    for (int a = 0; a <= max; a++) {
      int left = c - a * a;
      int b = (int) Math.sqrt(left);
      if (b * b == left) {
        return true;
      }
    }
    return false;
  }
}
