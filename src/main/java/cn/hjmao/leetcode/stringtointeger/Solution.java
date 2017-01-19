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
    int result = 0;
    if (str.length() == 0) {
      // FIXME:
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
    }

    return result * sign;
  }
}
