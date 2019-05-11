package cn.hjmao.leetcode.a506relativeranks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/relative-ranks/
 *
 * Desc:
 * =====
 * Given scores of N athletes, find their relative ranks and the people with the top three highest scores,
 * who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".
 *
 * Example 1:
 * Input: [5, 4, 3, 2, 1]
 * Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
 * Explanation: The first three athletes got the top three highest scores,
 * so they got "Gold Medal", "Silver Medal" and "Bronze Medal".
 * For the left two athletes, you just need to output their relative ranks according to their scores.
 *
 * Note:
 * N is a positive integer and won't exceed 10,000.
 * All the scores of athletes are guaranteed to be unique.
 */

class Solution {
  public String[] findRelativeRanks(int[] nums) {
    Map<Integer, Integer> posMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      posMap.put(nums[i], i);
    }
    Arrays.sort(nums);
    String[] result = new String[nums.length];
    for (int i = 0; i < nums.length; i++) {
      int rankPos = nums.length - i;
      String rank;
      switch (rankPos) {
        case 1:
          rank = "Gold Medal";
          break;
        case 2:
          rank = "Silver Medal";
          break;
        case 3:
          rank = "Bronze Medal";
          break;
        default:
          rank = String.valueOf(rankPos);
          break;
      }
      result[posMap.get(nums[i])] = rank;
    }
    return result;
  }
}
