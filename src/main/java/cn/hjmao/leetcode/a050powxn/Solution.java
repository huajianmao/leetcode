package cn.hjmao.leetcode.a050powxn;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/powx-n/
 *
 * Desc:
 * =====
 * Implement pow(x, n).
 */

public class Solution {
  // private double myPow1(double x, int n) {
  //   double sign = 1.0;
  //   if (x < 0 && n % 2 == 1) {
  //     sign = -1.0;
  //   }
  //   x = x < 0 ? -x : x;
  //
  //   double pow = 1;
  //   if (n < 0) {
  //     if (n <= Integer.MIN_VALUE) {
  //       return sign * 1.0 / myPow1(x, -(n + 1)) / x;
  //     } else {
  //       return sign * 1.0 / myPow1(x, -n);
  //     }
  //   } else {
  //     for (int i = 0; i < n; i++) {
  //       if (pow * x - pow <= Double.MIN_VALUE && pow - pow * x <= Double.MIN_VALUE) {
  //         return sign * pow;
  //       }
  //
  //       pow = pow * x;
  //       if (pow - 0 <= Double.MIN_VALUE && 0 - pow <= Double.MIN_VALUE) {
  //         return 0;
  //       }
  //       if (pow >= Double.MAX_VALUE || pow <= Double.NEGATIVE_INFINITY) {
  //         return sign < 0 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
  //       }
  //     }
  //     return sign * pow;
  //   }
  // }

  private double myPow2(double x, int n) {
    if (n == 0) {
      return 1;
    }
    double temp = myPow2(x, n / 2);
    if (n % 2 == 0) {
      return temp * temp;
    } else {
      if (n > 0) {
        return temp * temp * x;
      } else {
        return temp * temp / x;
      }
    }
  }

  public double myPow(double x, int n) {
    return myPow2(x, n);
  }
}
