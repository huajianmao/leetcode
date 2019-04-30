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
 * Given n non-negative integers a1, a2, ..., an,
 * where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container,
 * such that the container contains the most water.
 * <p>
 * Note: You may not slant the container and n is at least 2.
 */

public class Solution {
  public int maxArea(int[] height) {
    int maxArea = 0;
    int left = 0;
    int right = height.length - 1;

    while (left < right) {
      int thisArea = (right - left) * (height[left] > height[right] ? height[right] : height[left]);
      if (thisArea > maxArea) {
        maxArea = thisArea;
      }

      if (height[left] > height[right]) {
        right = right - 1;
      } else {
        left = left + 1;
      }
    }

    return maxArea;
  }
}
