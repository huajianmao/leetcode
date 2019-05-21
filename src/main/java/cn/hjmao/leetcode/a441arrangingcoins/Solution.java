package cn.hjmao.leetcode.a441arrangingcoins;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/arranging-coins/
 *
 * Desc:
 * =====
 * You have a total of n coins that you want to form in a staircase shape,
 * where every k-th row must have exactly k coins.
 *
 * Given n, find the total number of full staircase rows that can be formed.
 *
 * n is a non-negative integer and fits within the range of a 32-bit signed integer.
 *
 * Example 1:
 *
 * n = 5
 *
 * The coins can form the following rows:
 * ¤
 * ¤ ¤
 * ¤ ¤
 *
 * Because the 3rd row is incomplete, we return 2.
 * Example 2:
 *
 * n = 8
 *
 * The coins can form the following rows:
 * ¤
 * ¤ ¤
 * ¤ ¤ ¤
 * ¤ ¤
 *
 * Because the 4th row is incomplete, we return 3.
 */

class Solution {
  public int arrangeCoins(int n) {
    long nl = (long) n;
    long k = (int) Math.sqrt((double) nl * 2);
    int supply = k * (k + 1) / 2 <= nl ? 0 : -1;
    return n > 0 ? (int) k + supply : 0;
  }
}