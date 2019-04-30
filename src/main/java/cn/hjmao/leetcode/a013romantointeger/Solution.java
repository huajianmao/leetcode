package cn.hjmao.leetcode.a013romantointeger;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/roman-to-integer/
 *
 * Desc:
 * =====
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 */

public class Solution {

  private static final Map<Character, Integer> DIGIT_VALUE_MAP = new HashMap<>();

  static {
    DIGIT_VALUE_MAP.put('I', 1);
    DIGIT_VALUE_MAP.put('V', 5);
    DIGIT_VALUE_MAP.put('X', 10);
    DIGIT_VALUE_MAP.put('L', 50);
    DIGIT_VALUE_MAP.put('C', 100);
    DIGIT_VALUE_MAP.put('D', 500);
    DIGIT_VALUE_MAP.put('M', 1000);
  }

  private int solution1(String s) {
    int value = 0;
    for (int i = 0; i < s.length(); i++) {
      Character character = s.charAt(i);
      int sign = 1;
      switch (character) {
        case 'C':
          if (i + 1 < s.length() && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
            sign = -1;
          }
          break;
        case 'X':
          if (i + 1 < s.length() && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
            sign = -1;
          }
          break;
        case 'I':
          if (i + 1 < s.length() && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
            sign = -1;
          }
          break;
        default:
          break;
      }
      value = value + sign * DIGIT_VALUE_MAP.get(character);
    }

    return value;
  }


  private int solution2(String s) {
    int value = 0;
    for (int i = 0; i < s.length(); i++) {
      Character character = s.charAt(i);
      switch (character) {
        case 'C':
          if (i + 1 < s.length() && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
            value = value - 100;
          } else {
            value = value + 100;
          }
          break;
        case 'X':
          if (i + 1 < s.length() && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
            value = value - 10;
          } else {
            value = value + 10;
          }
          break;
        case 'I':
          if (i + 1 < s.length() && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
            value = value - 1;
          } else {
            value = value + 1;
          }
          break;
        case 'V':
          value = value + 5;
          break;
        case 'L':
          value = value + 50;
          break;
        case 'D':
          value = value + 500;
          break;
        case 'M':
          value = value + 1000;
          break;
        default:
          break;
      }
    }

    return value;
  }

  public int romanToInt(String s) {
    return solution2(s);
  }
}
