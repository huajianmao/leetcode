package cn.hjmao.leetcode.a1046laststoneweight;

import java.util.PriorityQueue;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/last-stone-weight/
 *
 * Desc:
 * =====
 * We have a collection of rocks, each rock has a positive integer weight.
 *
 * Each turn, we choose the two heaviest rocks and smash them together.
 * Suppose the stones have weights x and y with x <= y.  The result of this smash is:
 *
 * If x == y, both stones are totally destroyed;
 * If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
 * At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)
 *
 *
 *
 * Example 1:
 * Input: [2,7,4,1,8,1]
 * Output: 1
 * Explanation:
 * We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
 * we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
 * we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
 * we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of last stone.
 *
 *
 * Note:
 * 1 <= stones.length <= 30
 * 1 <= stones[i] <= 10000
 */

class Solution {
  public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
    for (int stone: stones) {
      queue.add(stone);
    }
    while (queue.size() > 1) {
      int max = queue.poll();
      int second = queue.poll();
      queue.add(max - second);
    }
    return queue.peek();
  }
}
