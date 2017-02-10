package cn.hjmao.leetcode.a015threesum;

import java.util.*;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/3sum/
 *
 * Desc:
 * =====
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 *
 * Note: The solution set must not contain duplicate triplets.
 *
 * For example, given array S = [-1, 0, 1, 2, -1, -4],
 *
 * A solution set is:
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 */

public class Solution {
  private int[] sort(int[] nums) {
    int[] sorted = {};

    return nums;
  }

  private List<List<Integer>> brutalForceSolution(int[] nums) {
    nums = sort(nums);

    Map<String, List<Integer>> tripletMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          if (nums[i] + nums[j] + nums[k] == 0) {
            List<Integer> triplet =  new ArrayList<>();
            triplet.add(nums[i]);
            triplet.add(nums[j]);
            triplet.add(nums[k]);

            int max = nums[i] > nums[j] ? nums[i] : nums[j];
            int min = nums[i] > nums[j] ? nums[j] : nums[i];
            max = max > nums[k] ? max : nums[k];
            min = min > nums[k] ? nums[k] : min;

            String key = max + "," + (-max - min) + "," + min;
            tripletMap.put(key, triplet);
          }
        }
      }
    }

    return new ArrayList<>(tripletMap.values());
  }

  private List<List<Integer>> recursive(int[] sorted, int left, int right) {
    List<List<Integer>> triplets = new ArrayList<>();

    if ((sorted != null && (sorted.length < 3 || sorted.length <= left || sorted.length <= right))
        || 2 * sorted[left] + sorted[right] > 0 || sorted[left] + 2 * sorted[right] < 0) {
      return triplets;
    }

    if (left < right - 1) {
      int expect = 0 - sorted[left] - sorted[right];
      if (expect >= sorted[left + 1] && expect <= sorted[right - 1]) {
        int expectedIndex = Arrays.binarySearch(sorted, expect);
        if (expectedIndex >= 0) {
          List<Integer> triplet = new ArrayList<>();
          triplet.add(sorted[left]);
          triplet.add(expect);
          triplet.add(sorted[right]);
          triplets.add(triplet);
        }

        for (int i = left + 1; i <= right && sorted[i] == sorted[left]; i++) {
          left++;
        }
        triplets.addAll(recursive(sorted, left + 1, right));

        for (int i = right - 1; i >= left && sorted[i] == sorted[right]; i--) {
          right--;
        }
        triplets.addAll(recursive(sorted, left , right - 1));
      } else if (expect < sorted[left + 1]) {
        for (int i = right - 1; i >= left && sorted[i] == sorted[right]; i--) {
          right--;
        }
        triplets.addAll(recursive(sorted, left , right - 1));
      } else if (expect > sorted[right - 1]) {
        for (int i = left + 1; i <= right && sorted[i] == sorted[left]; i++) {
          left++;
        }
        triplets.addAll(recursive(sorted, left + 1, right));
      }
    }

    return triplets;
  }

  private List<List<Integer>> solution(int[] nums) {
    Arrays.sort(nums);
    return recursive(nums, 0, nums.length-1);
  }

  public List<List<Integer>> threeSum(int[] nums) {
//    return brutalForceSolution(nums);
    return solution(nums);
  }
}
