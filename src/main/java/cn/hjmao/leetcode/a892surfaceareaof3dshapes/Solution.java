package cn.hjmao.leetcode.a892surfaceareaof3dshapes;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/surface-area-of-3d-shapes/
 *
 * Desc:
 * =====
 * On a N * N grid, we place some 1 * 1 * 1 cubes.
 * Each value v = grid[i][j] represents a tower of v cubes placed on top of grid cell (i, j).
 * Return the total surface area of the resulting shapes.
 *
 *
 *
 * Example 1:
 * Input: [[2]]
 * Output: 10
 *
 * Example 2:
 * Input: [[1,2],[3,4]]
 * Output: 34
 *
 * Example 3:
 * Input: [[1,0],[0,2]]
 * Output: 16
 *
 * Example 4:
 * Input: [[1,1,1],[1,0,1],[1,1,1]]
 * Output: 32
 *
 * Example 5:
 * Input: [[2,2,2],[2,1,2],[2,2,2]]
 * Output: 46
 *
 *
 * Note:
 * 1 <= N <= 50
 * 0 <= grid[i][j] <= 500
 */

class Solution {
  public int surfaceArea(int[][] grid) {
    int area = 0;
    for (int i = 0; i < grid.length; i++) {
      area += grid[i][0] + grid[0][i];
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] != 0) {
          area += 2;
        }
        if (j == grid[0].length - 1 || grid[i][j + 1] == 0) {
          area += grid[i][j];
        } else {
          area += Math.abs(grid[i][j] - grid[i][j + 1]);
        }

        if (i == grid.length - 1 || grid[i + 1][j] == 0) {
          area += grid[i][j];
        } else {
          area += Math.abs(grid[i][j] - grid[i + 1][j]);
        }
      }
    }
    return area;
  }
}
