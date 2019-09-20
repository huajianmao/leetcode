package cn.hjmao.leetcode.a1037validboomerang;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/valid-boomerang/
 *
 * Desc:
 * =====
 * A boomerang is a set of 3 points that are all distinct and not in a straight line.
 *
 * Given a list of three points in the plane, return whether these points are a boomerang.
 *
 *
 *
 * Example 1:
 * Input: [[1,1],[2,3],[3,2]]
 * Output: true
 *
 * Example 2:
 * Input: [[1,1],[2,2],[3,3]]
 * Output: false
 *
 *
 * Note:
 * points.length == 3
 * points[i].length == 2
 * 0 <= points[i][j] <= 100*
 */

class Solution {
  public boolean isBoomerang(int[][] points) {
    double dist12 = distance(points[0], points[1]);
    double dist23 = distance(points[1], points[2]);
    double dist13 = distance(points[0], points[2]);
    return dist12 + dist23 > dist13 && Math.abs(dist12 - dist23) < dist13;
  }

  double distance(int[] point1, int[] point2) {
    int deltaX = point1[0] - point2[0];
    int deltaY = point1[1] - point2[1];
    return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
  }
}
