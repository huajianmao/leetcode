package cn.hjmao.leetcode.a326powerofthree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/power-of-three/
 *
 * Desc:
 * =====
 * Given an integer, write a function to determine if it is a power of three.
 *
 * Example 1:
 *
 * Input: 27
 * Output: true
 * Example 2:
 *
 * Input: 0
 * Output: false
 * Example 3:
 *
 * Input: 9
 * Output: true
 * Example 4:
 *
 * Input: 45
 * Output: false
 * Follow up:
 * Could you do it without using any loop / recursion?
 */

public class Solution {
  public boolean isPowerOfThree(int n) {
    return n > 0 && 1162261467 % n == 0;
  }

  public boolean isPowerOfThree1(int n) {
    Integer[] powsNums = {
        1, 3, 9, 27, 81,
        243, 729, 2187, 6561, 19683,
        59049, 177147, 531441, 1594323, 4782969,
        14348907, 43046721, 129140163, 387420489, 1162261467};
    Set<Integer> pows = new HashSet<>(Arrays.asList(powsNums));
    return pows.contains(n);
  }
}
