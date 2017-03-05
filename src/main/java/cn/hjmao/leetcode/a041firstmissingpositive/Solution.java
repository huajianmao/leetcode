package cn.hjmao.leetcode.a041firstmissingpositive;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/first-missing-positive
 *
 * Desc:
 * =====
 * Given an unsorted integer array, find the first missing positive integer.
 *
 * For example,
 * Given [1,2,0] return 3,
 * and [3,4,-1,1] return 2.
 *
 * Your algorithm should run in O(n) time and uses constant space.
 */

public class Solution {
  private void swap(int[] nums, int i, int j) {
    nums[i] ^= nums[j];
    nums[j] ^= nums[i];
    nums[i] ^= nums[j];
  }

  public int firstMissingPositive(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      while (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[nums[i] - 1]) {
        swap(nums, i, nums[i] - 1);
      }
    }

    int first = 0;
    while (first < nums.length && nums[first] == first + 1) {
      first++;
    }

    return first + 1;
  }
}
