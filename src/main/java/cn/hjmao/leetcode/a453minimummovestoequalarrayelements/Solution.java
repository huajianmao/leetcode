package cn.hjmao.leetcode.a453minimummovestoequalarrayelements;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/minimum-moves-to-equal-array-elements/
 *
 * Desc:
 * =====
 * Given a non-empty integer array of size n,
 * find the minimum number of moves required to make all array elements equal,
 * where a move is incrementing n - 1 elements by 1.
 *
 * Example:
 *
 * Input:
 * [1,2,3]
 *
 * Output:
 * 3
 *
 * Explanation:
 * Only three moves are needed (remember each move increments two elements):
 *
 * [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 */

class Solution {
  public int minMoves(int[] nums) {
    int min = nums[0];
    int sum = 0;
    for (int num: nums) {
      min = Math.min(min, num);
      sum += num;
    }

    return sum - nums.length * min;
  }
}