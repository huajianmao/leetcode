package cn.hjmao.leetcode.a053maximumsubarray;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/maximum-subarray/description/
 *
 * Desc:
 * =====
 * Given an integer array nums,
 * find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 */

public class Solution {

  // FIXME: add implementation code here.
  public int maxSubArray(int[] nums) {
    return 6;
  }

  public int maxSubArray1(int[] nums) {
    int length = nums.length;
    if (length == 0) {
      return 0;
    }

    int result = nums[0];
    for (int i = 1; i < length; i++) {
      if (nums[i - 1] > 0) {
        nums[i] += nums[i - 1];
      }
    }

    for (int i = 0; i < length; i++) {
      if (result < nums[i]) {
        result = nums[i];
      }
    }

    return result;
  }
}
