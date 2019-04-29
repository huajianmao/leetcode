package cn.hjmao.leetcode.a414thirdmaximumnumber;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/third-maximum-number/
 *
 * Desc:
 * =====
 * Given a non-empty array of integers, return the third maximum number in this array.
 * If it does not exist, return the maximum number. The time complexity must be in O(n).
 *
 * Example 1:
 * Input: [3, 2, 1]
 *
 * Output: 1
 *
 * Explanation: The third maximum is 1.
 * Example 2:
 * Input: [1, 2]
 *
 * Output: 2
 *
 * Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
 * Example 3:
 * Input: [2, 2, 3, 1]
 *
 * Output: 1
 *
 * Explanation: Note that the third maximum here means the third maximum distinct number.
 * Both numbers with value 2 are both considered as second maximum.
 */

public class Solution {
  public int thirdMax(int[] nums) {
    int k = 3;
    List<Integer> tops = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      int j = 0;
      boolean added = false;
      for (; j < tops.size(); j++) {
        if (nums[i] == tops.get(j)) {
          break;
        } else if (nums[i] > tops.get(j)) {
          tops.add(j, nums[i]);
          added = true;
          if (tops.size() > k) {
            tops.remove(k);
          }
          break;
        }
      }
      if ( tops.size() < k && j >= tops.size() && !added) {
        tops.add(nums[i]);
      }
    }
    return tops.size() == k ? tops.get(k - 1) : tops.get(0);
  }
}
