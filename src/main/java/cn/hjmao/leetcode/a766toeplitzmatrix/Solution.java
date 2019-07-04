package cn.hjmao.leetcode.a766toeplitzmatrix;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/toeplitz-matrix/
 *
 * Desc:
 * =====
 * A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.
 *
 * Now given an M x N matrix, return True if and only if the matrix is Toeplitz.
 *
 *
 * Example 1:
 * Input:
 * matrix = [
 *   [1,2,3,4],
 *   [5,1,2,3],
 *   [9,5,1,2]
 * ]
 * Output: True
 * Explanation:
 * In the above grid, the diagonals are:
 * "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
 * In each diagonal all elements are the same, so the answer is True.
 *
 *
 * Example 2:
 * Input:
 * matrix = [
 *   [1,2],
 *   [2,2]
 * ]
 * Output: False
 * Explanation:
 * The diagonal "[1, 2]" has different elements.
 *
 * Note:
 * matrix will be a 2D array of integers.
 * matrix will have a number of rows and columns in range [1, 20].
 * matrix[i][j] will be integers in range [0, 99].?
 */

class Solution {
  public boolean isToeplitzMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      if (!isDiagonalEqual(i, 0, matrix)) {
        return false;
      }
    }
    for (int i = 0; i < matrix[0].length; i++) {
      if (!isDiagonalEqual(0, i, matrix)) {
        return false;
      }
    }

    return true;
  }

  private boolean isDiagonalEqual(int x, int y, int[][] matrix) {
    int value = matrix[x][y];
    while (++x < matrix.length && ++y < matrix[0].length) {
      if (matrix[x][y] != value) {
        return false;
      }
    }
    return true;
  }
}
