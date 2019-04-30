package cn.hjmao.leetcode.a400nthdigit;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/nth-digit/
 *
 * Desc:
 * =====
 * Find the nth digit of the infinite integer sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...
 *
 * Note:
 * n is positive and will fit within the range of a 32-bit signed integer (n < 231).
 *
 * Example 1:
 *
 * Input:
 * 3
 *
 * Output:
 * 3
 * Example 2:
 *
 * Input:
 * 11
 *
 * Output:
 * 0
 *
 * Explanation:
 * The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, which is part of the number 10.
 */

public class Solution {
  public int findNthDigit(int n) {
    int len = 1;
    long base = 1;
    while (true) {
      long thisLevelDigitCount = 9 * base * len;
      if (n > thisLevelDigitCount) {
        n = (int) (n - thisLevelDigitCount);
        len++;
        base *= 10;
      } else {
        break;
      }
    }
    return getDigit(base, n, len);
  }

  private int getDigit(long base, int n, int len) {
    int numberIndex = (n - 1) / len;
    long number = base + numberIndex;
    n -= numberIndex * len;
    int pow = (int) Math.pow(10, len - n);
    int digit = (int) (number % (pow * 10) / pow);
    return digit;
  }
}
