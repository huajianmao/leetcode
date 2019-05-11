package cn.hjmao.leetcode.a504base7;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/base-7/
 *
 * Desc:
 * =====
 * Given an integer, return its base 7 string representation.
 *
 * Example 1:
 * Input: 100
 * Output: "202"
 *
 * Example 2:
 * Input: -7
 * Output: "-10"
 *
 * Note: The input will be in range of [-1e7, 1e7].
 */

class Solution {
  public String convertToBase7(int num) {
    StringBuilder sb = new StringBuilder();
    String sign = num >= 0 ? "" : "-";

    do {
      sb.append(Math.abs(num % 7));
      num = num / 7;
    } while (num != 0);
    sb.append(sign);

    return sb.reverse().toString();
  }
}
