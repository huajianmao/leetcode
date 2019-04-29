package cn.hjmao.leetcode.a415addstrings;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/add-strings/
 *
 * Desc:
 * =====
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
 *
 *
 *
 * Note:
 *
 * The length of both num1 and num2 is < 5100.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */

class Solution {
  public String addStrings(String num1, String num2) {
    StringBuilder sb = new StringBuilder();
    int carry = 0;
    String extra = "";
    for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry == 1; i--, j--) {
      if ((i < 0 || j < 0) && carry == 0) {
        extra += i >= 0 ? num1.substring(0, i + 1) : "";
        extra += j >= 0 ? num2.substring(0, j + 1) : "";
        break;
      }
      int x = i < 0 ? 0 : num1.charAt(i) - '0';
      int y = j < 0 ? 0 : num2.charAt(j) - '0';
      sb.append((x + y + carry) % 10);
      carry = (x + y + carry) / 10;
    }
    return extra + sb.reverse().toString();
  }

  public String addStrings1(String num1, String num2) {
    return helper(num1, num2, 0);
  }

  private String helper(String num1, String num2, int carry) {
    if (carry == 0 && ("".equals(num1) || "".equals(num2))) {
      return num1 + num2;
    } else if (carry == 1 && ("".equals(num1) || "".equals(num2))) {
      return helper(num1 + num2, "1", 0);
    } else {
      int lastDigit1 = num1.charAt(num1.length() - 1) - '0';
      int lastDigit2 = num2.charAt(num2.length() - 1) - '0';
      int thisSum = lastDigit1 + lastDigit2 + carry;
      if (thisSum >= 10) {
        thisSum %= 10;
        carry = 1;
      } else {
        carry = 0;
      }
      return helper(num1.substring(0, num1.length() - 1), num2.substring(0, num2.length() - 1), carry) + thisSum;
    }
  }
}
