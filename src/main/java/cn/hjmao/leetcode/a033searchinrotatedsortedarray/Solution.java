package cn.hjmao.leetcode.a033searchinrotatedsortedarray;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/search-in-rotated-sorted-array
 *
 * Desc:
 * =====
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 *
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * You may assume no duplicate exists in the array.
 */

public class Solution {
  public int search(int[] nums, int target) {
    if (nums == null || nums.length == 0) {
      return -1;
    }

    int index = -1;

    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int middle = (left + right) / 2;
      if (target == nums[middle]) {
        return middle;
      }

      if (nums[middle] >= nums[left] && nums[middle] >= nums[right]
          && !(target >= nums[left] && target < nums[middle])) {
        left = middle + 1;
      } else if (nums[middle] <= nums[left] && nums[middle] <= nums[right]
          && !(target <= nums[right] && target > nums[middle])) {
        right = middle - 1;
      } else {
        if (nums[middle] > target) {
          right = middle - 1;
        } else {
          left = middle + 1;
        }
        break;
      }
    }

    while (left <= right) {
      int middle = (left + right) / 2;
      if (nums[middle] == target) {
        return middle;
      } else if (nums[middle] > target) {
        right = middle - 1;
      } else {
        left = middle + 1;
        index = left;
      }
    }

    if (index == -1 || index > nums.length - 1 || nums[index] != target) {
      index = -1;
    }

    return index;
  }
}
