package cn.hjmao.leetcode.a168excelsheetcolumntitle;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/excel-sheet-column-title/
 *
 * Desc:
 * =====
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 *
 * For example:
 *
 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB
 *     ...
 * Example 1:
 *
 * Input: 1
 * Output: "A"
 * Example 2:
 *
 * Input: 28
 * Output: "AB"
 * Example 3:
 *
 * Input: 701
 * Output: "ZY"
 */

public class Solution {
  public String convertToTitle(int n) {
    StringBuilder builder = new StringBuilder();

    while (n > 0) {
      char thisChar;
      if (n % 26 == 0) {
        thisChar = 'Z';
        n = n / 26 - 1;
      } else {
        thisChar = (char) ((int) 'A' - 1 + (n % 26));
        n = n / 26;
      }

      builder.append(thisChar);
    }

    return builder.reverse().toString();
  }
}
