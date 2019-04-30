package cn.hjmao.leetcode.a066plusone;

import java.util.Arrays;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/plus-one
 *
 * Desc:
 * =====
 * Given a non-empty array of digits representing a non-negative integer,
 * plus one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list,
 * and each element in the array contain a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 */

public class Solution {
  public int[] plusOne(int[] digits) {
    int[] plused = new int[digits.length + 1];
    plused[0] = 0;

    int i = digits.length - 1;
    for (; i >= 0; i--) {
      int digit = digits[i];
      if (digit == 9) {
        plused[i + 1] = 0;
        plused[i] = 1;
      } else {
        plused[i + 1] = digit + 1;
        break;
      }
    }
    i--;
    for (; i >= 0; i--) {
      plused[i + 1] = digits[i];
    }

    return plused[0] == 1 ? plused : Arrays.copyOfRange(plused, 1, plused.length);
  }
}
