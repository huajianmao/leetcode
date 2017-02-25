package cn.hjmao.leetcode.a031nextpermutation;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/next-permutation/
 *
 * Desc:
 * =====
 * Implement next permutation,
 * which rearranges numbers into the lexicographically next greater permutation of numbers.
 *
 * If such arrangement is not possible,
 * it must rearrange it as the lowest possible order (ie, sorted in ascending order).
 *
 * The replacement must be in-place, do not allocate extra memory.
 *
 * Here are some examples.
 * Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 *
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 */

public class Solution {
  public void nextPermutation(int[] nums) {
    if (nums == null || nums.length <= 1) {
      return;
    }

    int breakerIndex = nums.length - 2;
    for (; breakerIndex >= 0; breakerIndex--) {
      if (nums[breakerIndex] < nums[breakerIndex + 1]) {
        break;
      }
    }

    if (breakerIndex >= 0) {
      int i = nums.length - 1;
      for (; i >= breakerIndex; i--) {
        if (nums[i] > nums[breakerIndex]) {
          break;
        }
      }
      int temp = nums[breakerIndex];
      nums[breakerIndex] = nums[i];
      nums[i] = temp;
    }

    int left = breakerIndex + 1;
    int right = nums.length - 1;
    while (left < right) {
      int temp = nums[left];
      nums[left] = nums[right];
      nums[right] = temp;
      left++;
      right--;
    }
  }
}
