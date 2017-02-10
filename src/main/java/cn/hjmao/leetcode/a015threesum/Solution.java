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
  protected List<List<Integer>> brutalForceSolution(int[] nums) {
    Arrays.sort(nums);

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

  protected List<List<Integer>> threeSum1(int[] nums) {
    Arrays.sort(nums);

    List<List<Integer>> triplets = new ArrayList<>();
    for (int i = 0; i < nums.length - 2; i++) {
      if (i == 0 || (nums[i] != nums[i - 1])) {
        int expected = 0 - nums[i];

        int left = i + 1;
        int right = nums.length - 1;
        while (left < right) {
          if (nums[left] + nums[right] == expected) {
            triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));
            while (left < right && nums[left] == nums[left + 1]) left++;
            while (left < right && nums[right] == nums[right - 1]) right--;
            left++;
            right--;
          } else if (nums[left] + nums[right] < expected) {
            left++;
          } else {
            right--;
          }
        }
      }
    }

    return triplets;
  }

  public List<List<Integer>> threeSum(int[] nums) {
    return threeSum1(nums);
  }
}
