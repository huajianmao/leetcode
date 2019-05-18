package cn.hjmao.leetcode.a012integertoroman;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hjmao.
 * <p>
 * URL:
 * =====
 * https://leetcode.com/problems/integer-to-roman/
 * <p>
 * Desc:
 * =====
 * Given an integer, convert it to a roman numeral.
 * Input is guaranteed to be within the range from 1 to 3999.
 */

public class Solution {
  private static final Map<String, Character> INT_TO_CHAR = new HashMap<>();

  static {
    INT_TO_CHAR.put("1one", 'I');
    INT_TO_CHAR.put("1five", 'V');
    INT_TO_CHAR.put("1ten", 'X');
    INT_TO_CHAR.put("10one", 'X');
    INT_TO_CHAR.put("10five", 'L');
    INT_TO_CHAR.put("10ten", 'C');
    INT_TO_CHAR.put("100one", 'C');
    INT_TO_CHAR.put("100five", 'D');
    INT_TO_CHAR.put("100ten", 'M');
    INT_TO_CHAR.put("1000one", 'M');
  }

  private String digitToRoman(int digit, int level) {
    StringBuilder roman = new StringBuilder();

    char one = INT_TO_CHAR.get(level + "one");
    if (digit > 0) {
      if (digit <= 3) {
        for (int i = 0; i < digit; i++) {
          roman.append(one);
        }
      } else if (digit == 4) {
        char five = INT_TO_CHAR.get(level + "five");
        roman.append(one).append(five);
      } else if (digit <= 8) {
        char five = INT_TO_CHAR.get(level + "five");
        roman.append(five);
        for (int i = 0; i < digit - 5; i++) {
          roman.append(one);
        }
      } else if (digit == 9) {
        char ten = INT_TO_CHAR.get(level + "ten");
        roman.append(one).append(ten);
      }
    }

    return roman.toString();
  }

  public String intToRoman1(int num) {
    StringBuilder roman = new StringBuilder();

    roman.append(digitToRoman(num / 1000, 1000));
    roman.append(digitToRoman(num % 1000 / 100, 100));
    roman.append(digitToRoman(num % 100 / 10, 10));
    roman.append(digitToRoman(num % 10, 1));

    return roman.toString();
  }


  private static final String[] M = {"", "M", "MM", "MMM"};
  private static final String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
  private static final String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
  private static final String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

  // public String intToRoman2(int num) {
  //   return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[num % 10];
  // }

  public String intToRoman(int num) {
    return intToRoman1(num);
  }
}
