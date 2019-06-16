package cn.hjmao.leetcode.a697degreeofanarray;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/degree-of-an-array/
 *
 * Desc:
 * =====
 * Given a non-empty array of non-negative integers nums,
 * the degree of this array is defined as the maximum frequency of any one of its elements.
 *
 * Your task is to find the smallest possible length of a (contiguous) subarray of nums,
 * that has the same degree as nums.
 *
 * Example 1:
 * Input: [1, 2, 2, 3, 1]
 * Output: 2
 * Explanation:
 * The input array has a degree of 2 because both elements 1 and 2 appear twice.
 * Of the subarrays that have the same degree:
 * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
 * The shortest length is 2. So return 2.
 *
 * Example 2:
 * Input: [1,2,2,3,1,4,2]
 * Output: 6
 * Note:
 *
 * nums.length will be between 1 and 50,000.
 * nums[i] will be an integer between 0 and 49,999.
 */

class Solution {
  public int findShortestSubArray(int[] nums) {
    Set<Integer> maxDegreeNums = new HashSet<>();
    Map<Integer, int[]> countMap = new HashMap<>();
    int degree = 0;
    for (int i = 0; i < nums.length; i++) {
      int num = nums[i];
      int[] values;
      if (countMap.containsKey(num)) {
        values = countMap.get(num);
        values[0]++;
        values[2] = i;
      } else {
        int[] temp = {1, i, i};
        values = temp;
      }
      countMap.put(num, values);
      if (values[0] == degree) {
        maxDegreeNums.add(num);
      } else if (values[0] > degree) {
        degree = values[0];
        maxDegreeNums.clear();
        maxDegreeNums.add(num);
      }
    }
    int min = Integer.MAX_VALUE;
    for (int num: maxDegreeNums) {
      int[] temp = countMap.get(num);
      min = Math.min(min, temp[2] - temp[1]);
    }
    return min + 1;
  }
}
