package cn.hjmao.leetcode.a840magicsquaresingrid;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/magic-squares-in-grid/
 *
 * Desc:
 * =====
 * A 3 x 3 magic square is a 3 x 3 grid filled with distinct numbers from 1 to 9
 * such that each row, column, and both diagonals all have the same sum.
 *
 * Given an grid of integers, how many 3 x 3 "magic square" subgrids are there?  (Each subgrid is contiguous).
 *
 *
 *
 * Example 1:
 *
 * Input: [[4,3,8,4],
 *         [9,5,1,9],
 *         [2,7,6,2]]
 * Output: 1
 * Explanation:
 * The following subgrid is a 3 x 3 magic square:
 * 438
 * 951
 * 276
 *
 * while this one is not:
 * 384
 * 519
 * 762
 *
 * In total, there is only one magic square inside the given grid.
 *
 *
 *
 * Note:
 * 1 <= grid.length <= 10
 * 1 <= grid[0].length <= 10
 * 0 <= grid[i][j] <= 155
 */

class Solution {
  public int numMagicSquaresInside(int[][] grid) {
    int sum = 0;
    for (int x = 0; x < grid.length - 2; x++) {
      for (int y = 0; y < grid[0].length - 2; y++) {
        if (isMagicSquares(grid, x, y)) {
          sum++;
        }
      }
    }
    return sum;
  }

  private boolean isMagicSquares(int[][] grid, int x, int y) {
    if (grid[x][y] + grid[x + 1][y + 1] + grid[x + 2][y + 2] != 15
        || grid[x + 2][y] + grid[x + 1][y + 1] + grid[x][y + 2] != 15) {
      return false;
    }

    Set<Integer> numbers = new HashSet<>();
    for (int i = 0; i < 3; i++) {
      int rowSum = 0;
      int colSum = 0;
      for (int j = 0; j < 3; j++) {
        int number = grid[x + i][y + j];
        if (number > 9 || number < 1 || numbers.contains(number)) {
          return false;
        } else {
          numbers.add(number);
        }
        rowSum += number;
        colSum += grid[x + j][y + i];
      }
      if (rowSum != 15 || colSum != 15) {
        return false;
      }
    }

    return true;
  }
}
