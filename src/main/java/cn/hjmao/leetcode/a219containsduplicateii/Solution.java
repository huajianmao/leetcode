package cn.hjmao.leetcode.a219containsduplicateii;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/contains-duplicate-ii/
 *
 * Desc:
 * =====
 * Given an array of integers and an integer k,
 * find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j]
 * and the absolute difference between i and j is at most k.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * Example 2:
 *
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * Example 3:
 *
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 */

public class Solution {

  public boolean containsNearbyDuplicate(int[] nums, int k) {
    int n = nums.length;
    for (int start = 0; start < n; start++) {
      for (int i = 1; i <= k; i++) {
        if (start + i >= n) {
          continue;
        }
        if (nums[start] == nums[start + i]) {
          return true;
        }
      }
    }
    return false;
  }
}
