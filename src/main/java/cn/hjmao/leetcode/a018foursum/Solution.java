package cn.hjmao.leetcode.a018foursum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/PROBLEM_TITLE/
 *
 * Desc:
 * =====
 * Given an array S of n integers,
 * are there elements a, b, c, and d in S such that a + b + c + d = target?
 * Find all unique quadruplets in the array which gives the sum of target.
 *
 * Note: The solution set must not contain duplicate quadruplets.
 *
 * For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.
 *
 * A solution set is:
 * [
 *   [-1,  0, 0, 1],
 *   [-2, -1, 1, 2],
 *   [-2,  0, 0, 2]
 * ]
 */

public class Solution {
  protected List<List<Integer>> brutalforce(int[] nums, int target) {
    List<List<Integer>> quadruplets = new ArrayList<>();
    Set<String> resultSet = new HashSet<>();

    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 3; i++) {
      for (int j = i + 1; j < nums.length - 2; j++) {
        for (int k = j + 1; k < nums.length - 1; k++) {
          int expected = target - nums[i] - nums[j] - nums[k];
          for (int l = k + 1; l < nums.length; l++) {
            if (expected == nums[l]) {
              String quardrupletStr = nums[i] + "," + nums[j] + "," + nums[k] + "," + nums[l];
              if (!resultSet.contains(quardrupletStr)) {
                resultSet.add(quardrupletStr);
                quadruplets.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
              }
              break;
            }
          }
        }
      }
    }
    return quadruplets;
  }

  public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> quadruplets = new ArrayList<>();
    if (nums == null || nums.length < 4) {
      return quadruplets;
    }

    Arrays.sort(nums);
    if (4 * nums[0] > target || 4 * nums[nums.length - 1] < target) {
      return quadruplets;
    }

    for (int i = 0; i < nums.length - 3; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      if (3 * nums[i + 1] > target - nums[i] || 3 * nums[nums.length - 1] < target - nums[i]) {
        continue;
      }
      for (int j = i + 1; j < nums.length - 2; j++) {
        if (i < j - 1 && nums[j] == nums[j - 1]) {
          continue;
        }
        int expected = target - nums[i] - nums[j];
        int left = j + 1;
        int right = nums.length - 1;

        if (2 * nums[j + 1] > expected || 2 * nums[nums.length - 1] < expected) {
          continue;
        }
        while (left < right) {
          if (left > j + 1 && nums[left] == nums[left - 1]) {
            left++;
            continue;
          }
          int twoSum = nums[left] + nums[right];
          if (expected == twoSum) {
            List<Integer> quadruplet = Arrays.asList(nums[i], nums[j], nums[left], nums[right]);
            quadruplets.add(quadruplet);
            left++;
            right--;
          } else if (expected > twoSum) {
            while (left > j + 1 && left < right && nums[left - 1] == nums[left]) {
              left++;
            }
            left++;
          } else {
            while (right - 1 > left && nums[right - 1] == nums[right]) {
              right--;
            }
            right--;
          }
        }
      }
    }

    return quadruplets;
  }
}
