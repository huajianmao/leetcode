package cn.hjmao.leetcode.a812largesttrianglearea;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/largest-triangle-area/
 *
 * Desc:
 * =====
 * You have a list of points in the plane.
 * Return the area of the largest triangle that can be formed by any 3 of the points.
 *
 * Example:
 * Input: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
 * Output: 2
 * Explanation:
 * The five points are show in the figure below. The red triangle is the largest.
 *
 *
 * Notes:
 *
 * 3 <= points.length <= 50.
 * No points will be duplicated.
 *  -50 <= points[i][j] <= 50.
 * Answers within 10^-6 of the true value will be accepted as correct.
 */

class Solution {
  public double largestTriangleArea(int[][] points) {
    double max = 0;
    for (int[] a: points) {
      for (int[] b : points) {
        for (int[] c : points) {
          double area = 0.5 * Math.abs(
              a[0] * b[1] + b[0] * c[1] + c[0] * a[1] - b[0] * a[1] - c[0] * b[1] - a[0] * c[1]
          );
          max = Math.max(max, area);
        }
      }
    }
    return max;
  }
}
