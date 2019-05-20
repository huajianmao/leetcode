package cn.hjmao.leetcode.a581shortestunsortedcontinuoussubarray;

import java.util.Arrays;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
 *
 * Desc:
 * =====
 * Given an integer array, you need to find one continuous subarray
 * that if you only sort this subarray in ascending order,
 * then the whole array will be sorted in ascending order, too.
 *
 * You need to find the shortest such subarray and output its length.
 *
 * Example 1:
 * Input: [2, 6, 4, 8, 10, 9, 15]
 * Output: 5
 * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order
 * to make the whole array sorted in ascending order.
 * Note:
 * Then length of the input array is in range [1, 10,000].
 * The input array may contain duplicates, so ascending order here means <=.
 */

class Solution {
  public int findUnsortedSubarray(int[] nums) {
    int[] copied = Arrays.copyOf(nums, nums.length);
    Arrays.sort(copied);
    int start;
    int end;
    for (start = 0; start < nums.length; start++) {
      if (copied[start] != nums[start]) {
        break;
      }
    }
    for (end = nums.length - 1; end >= start; end--) {
      if (copied[end] != nums[end]) {
        break;
      }
    }
    return end - start + 1;
  }
}
