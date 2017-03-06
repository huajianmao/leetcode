package cn.hjmao.leetcode.a042trappingrainwater;

import java.util.Stack;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/trapping-rain-water/
 *
 * Desc:
 * =====
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it is able to trap after raining.
 *
 * For example,
 * Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 */

public class Solution {
  public int trapStack(int[] height) {
    int water = 0;
    if (height == null || height.length < 2) {
      return water;
    }

    int i = 0;
    Stack<Integer> stack = new Stack<>();

    while (i < height.length) {
      if (stack.isEmpty() || height[i] <= height[stack.peek()]) {
        stack.push(i);
        i++;
      } else {
        int bottom = stack.pop();
        int localWater = 0;
        if (!stack.isEmpty()) {
          int depth = Math.min(height[stack.peek()], height[i]) - height[bottom];
          localWater = depth * (i - stack.peek() - 1);
        }
        water += localWater;
      }
    }

    return water;
  }

  public int trap(int[] height) {
    int water = 0;

    int maxLeft = 0;
    int maxRight = 0;
    int left = 0;
    int right = height.length - 1;
    while (left <= right) {
      if (height[left] <= height[right]) {
         if (height[left] >= maxLeft) {
          maxLeft = height[left];
        } else {
          water += maxLeft - height[left];
        }
        left++;
      } else {
        if (height[right] >= maxRight) {
          maxRight = height[right];
        } else {
          water += maxRight - height[right];
        }
        right--;
      }
    }

    return water;
  }
}
