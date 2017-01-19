package cn.hjmao.leetcode.stringtointeger;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/string-to-integer-atoi/
 *
 * Desc:
 * =====
 * Implement atoi to convert a string to an integer.
 *
 * Hint: Carefully consider all possible input cases.
 * If you want a challenge, please do not see below and ask yourself what are the possible input cases.
 * Notes: It is intended for this problem to be specified vaguely (ie, no given input specs).
 * You are responsible to gather all the input requirements up front.
 *
 * Update (2015-02-10):
 * The signature of the C++ function had been updated.
 * If you still see your function signature accepts a const char * argument,
 * please click the reload button  to reset your code definition.
 */

public class Solution {
  public int myAtoi(String str) {
    long result = 0;
    if (str == null) {
      return 0;
    }
    str = str.trim();
    if (str.length() == 0) {
      return 0;
    }

    int i = 0;
    int sign = 1;
    if (str.charAt(0) == '+') {
      i = 1;
    } else if (str.charAt(0) == '-') {
      i = 1;
      sign = -1;
    }

    // + -
    for (; i < str.length(); i++) {
      char digital = str.charAt(i);
      if (digital > '9' || digital < '0') {
        break;
      }
      result = result * 10 + (digital - '0');
      if (result * sign > Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
      } else if (result * sign < Integer.MIN_VALUE) {
        return Integer.MIN_VALUE;
      }
    }

    result = result * sign;
    return (int) result;
  }
}
