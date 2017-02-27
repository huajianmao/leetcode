package cn.hjmao.leetcode.a034searchforarange;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/search-for-a-range
 *
 * Desc:
 * =====
 * Given an array of integers sorted in ascending order,
 * find the starting and ending position of a given target value.
 *
 * Your algorithm's runtime complexity must be in the order of O(log n).
 *
 * If the target is not found in the array, return [-1, -1].
 *
 * For example,
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4].
 */

public class Solution {
  private int[] search(int[] nums, int left, int right, int target) {
    int[] range = {-1, -1};
    if (nums[left] == target && nums[right] == target) {
      range[0] = left;
      range[1] = right;
      return range;
    }

    if (nums[left] <= target && nums[right] >= target) {
      int middle = (left + right) >> 1;
      int[] leftRange = search(nums, left, middle, target);
      int[] rightRange = search(nums, middle + 1, right, target);
      if (leftRange[0] == -1) {
        return rightRange;
      }
      if (rightRange[0] == -1) {
        return leftRange;
      }
      range[0] = leftRange[0];
      range[1] = rightRange[1];
      return range;
    }

    return range;
  }

  public int[] searchRange(int[] nums, int target) {
    int[] range = {-1, -1};

    if (nums != null && nums.length > 0) {
      range = search(nums, 0, nums.length - 1, target);
    }
    return range;
  }
}
