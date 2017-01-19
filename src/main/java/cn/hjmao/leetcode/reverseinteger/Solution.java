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
    Long reverse = 0L;

    boolean hasSign = x < 0 ? true : false;
    int abs = Math.abs(x);
    while (abs / 10 > 0) {
      reverse = reverse * 10 + abs % 10;
      abs = abs / 10;
    }
    reverse = reverse * 10 + abs;
    reverse = reverse * (hasSign ? -1 : 1);

    if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
      return 0;
    }

    return reverse.intValue();
  }
}
