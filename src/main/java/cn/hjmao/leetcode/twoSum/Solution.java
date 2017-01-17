package cn.hjmao.leetcode.twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hjmao on 17/01/2017.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/two-sum/
 *
 * Desc:
 * =====
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution.
 */

public class Solution {
  public int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];

    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i])) {
        result[0] = map.get(target - nums[i]);
        result[1] = i;
        break;
      }
      map.put(nums[i], i);
    }

    return result;
  }
}
