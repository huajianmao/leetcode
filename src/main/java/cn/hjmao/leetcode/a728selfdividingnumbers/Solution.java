package cn.hjmao.leetcode.a728selfdividingnumbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/self-dividing-numbers/
 *
 * Desc:
 * =====
 * A self-dividing number is a number that is divisible by every digit it contains.
 *
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 *
 * Also, a self-dividing number is not allowed to contain the digit zero.
 *
 * Given a lower and upper number bound, output a list of every possible self dividing number,
 * including the bounds if possible.
 *
 * Example 1:
 * Input:
 * left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * Note:
 *
 * The boundaries of each input argument are 1 <= left <= right <= 10000.
 */

class Solution {
  public List<Integer> selfDividingNumbers(int left, int right) {
    List<Integer> numbers = new ArrayList<>();
    for (int i = left; i <= right; i++) {
      boolean[] digitals = new boolean[9];
      int n = i;
      while (n != 0) {
        int digital = n % 10;
        if (digital == 0) {
          break;
        } else {
          digitals[digital - 1] = true;
        }
        n = n / 10;
      }
      if (n == 0) {
        int j = 0;
        for (; j < 9; j++) {
          if (digitals[j] && i % (j + 1) != 0) {
            break;
          }
        }
        if (j == 9) {
          numbers.add(i);
        }
      }
    }
    return numbers;
  }
}
