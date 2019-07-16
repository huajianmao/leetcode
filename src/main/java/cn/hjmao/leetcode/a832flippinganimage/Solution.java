package cn.hjmao.leetcode.a832flippinganimage;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/flipping-an-image/
 *
 * Desc:
 * =====
 * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
 *
 * To flip an image horizontally means that each row of the image is reversed.
 * For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
 *
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
 * For example, inverting [0, 1, 1] results in [1, 0, 0].
 *
 * Example 1:
 * Input: [[1,1,0],[1,0,1],[0,0,0]]
 * Output: [[1,0,0],[0,1,0],[1,1,1]]
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 *
 *
 * Example 2:
 * Input: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
 * Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 *
 * Notes:
 * 1 <= A.length = A[0].length <= 20
 * 0 <= A[i][j] <= 11
 */

class Solution {
  public int[][] flipAndInvertImage(int[][] a) {
    for (int i = 0; i < a.length; i++) {
      int start = 0;
      int end = a[0].length - 1;
      while (end >= start) {
        int tmp = a[i][start] ^ 1;
        a[i][start] = a[i][end] ^ 1;
        a[i][end] = tmp;

        start++;
        end--;
      }
    }
    return a;
  }
}
