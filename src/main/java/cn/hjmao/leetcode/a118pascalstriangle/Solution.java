package cn.hjmao.leetcode.a118pascalstriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/pascals-triangle/
 *
 * Desc:
 * =====
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 * 
 * Example:
 * 
 * Input: 5
 * Output:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 */

public class Solution {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> triangle = new ArrayList<>();
    if (numRows > 0) {
      List<Integer> first = new ArrayList<>();
      first.add(1);
      triangle.add(first);

      for (int i = 1; i < numRows; i++) {
        List<Integer> thisRow = new ArrayList<>();
        thisRow.add(1);

        if (i > 1) {
          List<Integer> lastRow = triangle.get(i - 1);
          for (int j = 1; j < lastRow.size(); j++) {
            thisRow.add(lastRow.get(j - 1) + lastRow.get(j));
          }
        }

        thisRow.add(1);

        triangle.add(thisRow);
      }
    }
    return triangle;
  }
}
