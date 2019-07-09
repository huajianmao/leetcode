package cn.hjmao.leetcode.a788rotateddigits;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/rotated-digits/
 *
 * Desc:
 * =====
 * X is a good number if after rotating each digit individually by 180 degrees,
 * we get a valid number that is different from X.
 * Each digit must be rotated - we cannot choose to leave it alone.
 *
 * A number is valid if each digit remains a digit after rotation.
 * 0, 1, and 8 rotate to themselves; 2 and 5 rotate to each other; 6 and 9 rotate to each other,
 * and the rest of the numbers do not rotate to any other number and become invalid.
 *
 * Now given a positive number N, how many numbers X from 1 to N are good?
 *
 * Example:
 * Input: 10
 * Output: 4
 * Explanation:
 * There are four good numbers in the range [1, 10] : 2, 5, 6, 9.
 * Note that 1 and 10 are not good numbers, since they remain unchanged after rotating.
 *
 *
 * Note:
 * N  will be in range [1, 10000].
 */

class Solution {
  Set<Integer> in = new HashSet<>(Arrays.asList(2, 5, 6, 9));
  Set<Integer> notIn = new HashSet<>(Arrays.asList(3, 4, 7));

  public int rotatedDigits(int n) {
    int count = 0;
    for (int i = 1; i <= n; i ++) {
      if (isValid(i)) {
        count ++;
      }
    }
    return count;
  }

  public boolean isValid(int n) {
    boolean valid = false;
    while (n > 0) {
      if (notIn.contains(n % 10)) {
        return false;
      } else if (in.contains(n % 10)) {
        valid = true;
      }
      n = n / 10;
    }
    return valid;
  }
}
