package cn.hjmao.leetcode.hammingdistance;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/hamming-distance/
 *
 * Desc:
 * =====
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 *
 * Given two integers x and y, calculate the Hamming distance.
 *
 * Note: 0 ≤ x, y < 231.
 *
 * Example:
 * Input: x = 1, y = 4
 * Output: 2
 *
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 *        ↑   ↑
 * The above arrows point to positions where the corresponding bits are different.
 */

public class Solution {
  public int hammingDistance(int x, int y) {
    int distance = 0;

    long xor = x ^ y;

    for (int i=0; i<32; i++) {
      if ((xor & 1) == 1) {
        distance = distance + 1;
      }
      xor = xor >> 1;
    }

    return distance;
  }
}
