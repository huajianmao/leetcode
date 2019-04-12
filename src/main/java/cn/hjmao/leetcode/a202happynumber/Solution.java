package cn.hjmao.leetcode.a202happynumber;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/happy-number/
 *
 * Desc:
 * =====
 * Write an algorithm to determine if a number is "happy".
 *
 * A happy number is a number defined by the following process:
 * Starting with any positive integer, replace the number by the sum of the squares of its digits,
 * and repeat the process until the number equals 1 (where it will stay),
 * or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy numbers.
 *
 * Example:
 *
 * Input: 19
 * Output: true
 * Explanation:
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 */

public class Solution {
  public boolean isHappy(int n) {
    Set<Integer> calced = new HashSet<>();
    while (n > 1) {
      if (calced.contains(n)) {
        return false;
      } else {
        calced.add(n);
        n = squareSum(n);
        if (n == 1) {
          return true;
        }
      }
    }

    return true;
  }

  private int squareSum(int n) {
    int sum = 0;
    while (n > 0) {
      int digit = n % 10;
      sum += digit * digit;
      n = n / 10;
    }
    return sum;
  }
}
