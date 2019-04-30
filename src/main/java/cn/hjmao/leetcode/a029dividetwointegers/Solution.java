package cn.hjmao.leetcode.a029dividetwointegers;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/divide-two-integers/
 *
 * Desc:
 * =====
 * Divide two integers without using multiplication, division and mod operator.
 *
 * If it is overflow, return MAX_INT.
 */

public class Solution {

  /**
   * FROM: https://discuss.leetcode.com/topic/17600/32-times-bit-shift-operation-in-c-with-o-1-solution
   *
   * ret = a0 + a1*2 + a2*2^2 + ...... + a29*2^29 + a30*2^30 + a31*2^31; ai = 0 or 1, i = 0......31
   *
   * the dividend B and divisor A is non-negative, then
   * A(a0 + a1*2 + a2*2^2 + ...... + a29*2^29 + a30*2^30 + a31*2^31) = B;    ... ... Eq1
   *
   * (1) when Eq1 divided by 2^31, we can get A*a31 = B>>31;
   *     then a31 = (B>>31)/A;
   *
   *     if (B>>31) > A, then a31 = 1; else a31 = 0;
   *
   * (2) when Eq1 divided by 2^30, we can get A*a30 + A*a31*2 = B>>30;
   *     then a30 = ((B>>30) - a31*A*2)/A;
   *     and (B>>30) - a31*A*2 can be rewritten by (B-a31*A<<31)>>30,
   *     so we make B' = B-a31*A<<31,
   *     the formula simplified to a30 = (B'>>30)/A
   *
   *     if (B'>>30) > A, then a30 = 1; else a30 = 0;
   *
   * (3) in the same reason, we can get a29 = ((B-a31*A<<31-a30*A<<30)>>29)/A,
   *     we make B'' = (B' - a30*A)<<30,
   *     the formula simplified to a29 = (B''>>29)/A;
   *
   * do the same bit operation 32 times,
   * we can get a31 ..... a0, so we get the ret finally.
   */
  public int divide(int dividend, int divisor) {
    if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)) {
      return Integer.MAX_VALUE;
    }

    int sign = (dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0) ? 1 : -1;
    long b = dividend > 0 ? dividend : 0L - dividend;
    long a = divisor > 0 ? divisor : 0L - divisor;
    int result = 0;

    for (int i = 31; i >= 0; i--) {
      if ((b >> i) >= a) {
        result = (result << 1) + 1;
        b = b - (a << i);
      } else {
        result = result << 1;
      }
    }

    return sign == 1 ? result : -result;
  }
}
