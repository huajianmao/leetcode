package cn.hjmao.leetcode.a043multiplystrings;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/multiply-strings
 *
 * Desc:
 * =====
 * Given two non-negative integers num1 and num2 represented as strings,
 * return the product of num1 and num2.
 *
 * Note:
 * 1. The length of both num1 and num2 is < 110.
 * 2. Both num1 and num2 contains only digits 0-9.
 * 3. Both num1 and num2 does not contain any leading zero.
 * 4. You must not use any built-in BigInteger library
 *    or convert the inputs to integer directly.
 */

public class Solution {
  public String multiply(String num1, String num2) {
    if ((num1.length() == 1 && num1.charAt(0) == '0')
        || (num2.length() == 1 && num2.charAt(0) == '0')) {
      return "0";
    }
    StringBuilder multiply = new StringBuilder();
    int[] result = new int[num1.length() + num2.length()];
    for (int i = num1.length() - 1; i >= 0; i--) {
      int num1i = num1.charAt(i) - '0';
      int base = num1.length() - i - 1;
      for (int j = num2.length() - 1; j >= 0; j--) {
        int num2j = num2.charAt(j) - '0';
        int temp = num1i * num2j + result[base];
        result[base] = temp % 10;
        result[base + 1] += temp / 10;
        base++;
      }
    }
    if (result[result.length - 1] != 0) {
      multiply.append(result[result.length - 1]);
    }
    for (int i = result.length - 2; i >= 0; i--) {
      multiply.append(result[i]);
    }

    return multiply.toString();
  }
}
