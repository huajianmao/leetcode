package cn.hjmao.leetcode.a006zigzagconversion;

/**
 * Created by hjmao on 17/01/2017.
 * <p>
 * URL:
 * =====
 * https://leetcode.com/problems/zigzag-conversion/
 * <p>
 * Desc:
 * =====
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * <p>
 * And then read line by line: "PAHNAPLSIIGYIR"
 * <p>
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string text, int nRows);
 * <p>
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */

public class Solution {
  public String convert(String s, int numRows) {
    if (numRows == 1) {
      return s;
    }

    int col = s.length() / numRows + 1;
    String result = "";

    for (int i = 0; i < col; i++) {
      int index = i * (2 * numRows - 2);
      if (index < s.length()) {
        result += s.charAt(index);
      }
    }

    for (int i = 1; i < numRows - 1; i++) {
      for (int j = 0; j < col; j++) {
        int first = i + j * (2 * numRows - 2);
        int second = 2 * (numRows - 1) - i + j * (2 * numRows - 2);
        if (first >= s.length()) {
          break;
        } else {
          result += s.charAt(first);
          if (second >= s.length()) {
            break;
          } else {
            result += s.charAt(second);
          }
        }
      }
    }

    for (int i = 0; i < col; i++) {
      int index = i * (2 * numRows - 2) + (numRows - 1);
      if (index < s.length()) {
        result += s.charAt(index);
      }
    }
    return result;
  }
}
