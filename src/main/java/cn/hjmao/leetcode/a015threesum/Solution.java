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
    for (int left = 0; left < nums.length - 2; left++) {
      if (nums[left] > 0) {
        break;
      }
      if (left > 0 && nums[left] == nums[left - 1]) {
        continue;
      }

      if (left == 0 || (nums[left] != nums[left - 1])) {
        int expected = 0 - nums[left];

        int middle = left + 1;
        int right = nums.length - 1;
        while (middle < right) {
          if (nums[middle] + nums[right] == expected) {
            triplets.add(Arrays.asList(nums[left], nums[middle], nums[right]));
            while (middle < right && nums[middle] == nums[middle + 1]) {
              middle++;
            }
            while (middle < right && nums[right] == nums[right - 1]) {
              right--;
            }
            middle++;
            right--;
          } else if (nums[middle] + nums[right] < expected) {
            while (middle < right && nums[middle] == nums[middle + 1]) {
              middle++;
            }
            middle++;
          } else {
            while (middle < right && nums[right] == nums[right - 1]) {
              right--;
            }
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
