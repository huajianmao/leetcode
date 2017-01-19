package cn.hjmao.leetcode.reverseinteger;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/reverse-integer
 *
 * Desc:
 * =====
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 */

public class Solution {
  public int reverse(int x) {
    long reverse = 0;

    do {
      reverse = reverse * 10 + x % 10;
      x = x / 10;
    } while (x != 0);

    return (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) ? 0 : (int) reverse;
  }
}
