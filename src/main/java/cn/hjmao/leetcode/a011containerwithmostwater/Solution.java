package cn.hjmao.leetcode.a011containerwithmostwater;

/**
 * Created by hjmao.
 * <p>
 * URL:
 * =====
 * https://leetcode.com/problems/container-with-most-water/
 * <p>
 * Desc:
 * =====
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * <p>
 * Note: You may not slant the container and n is at least 2.
 */

public class Solution {
  public int maxArea(int[] height) {
    int maxArea = 0;

    for (int i = 0; i < height.length - 1; i++) {
      for (int j = i + 1; j < height.length; j++) {
        int thisHeight = height[i] < height[j] ? height[i] : height[j];
        int thisArea = (j - i) * thisHeight;
        if (maxArea < thisArea) {
          maxArea = thisArea;
        }
      }
    }

    return maxArea;
  }
}
