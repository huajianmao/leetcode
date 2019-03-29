package cn.hjmao.leetcode.a136singlenumber;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/single-number/
 *
 * Desc:
 * =====
 * Given a non-empty array of integers, every element appears twice except for one.
 * Find that single one.
 *
 * Note:
 * Your algorithm should have a linear runtime complexity.
 * Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 */

/**
 * Hint: location is useless; you only need to find the value;
 *       A xor A = 0; xor is commutative;
 */

public class Solution {
  public int singleNumber(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
      nums[0] ^= nums[i];
    }
    return nums[0];
  }
}
