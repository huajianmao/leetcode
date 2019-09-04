package cn.hjmao.leetcode.a1005maximizesumofarrayafterknegations;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/
 *
 * Desc:
 * =====
 * Given an array A of integers, we must modify the array in the following way:
 * we choose an i and replace A[i] with -A[i], and we repeat this process K times in total.
 * (We may choose the same index i multiple times.)
 *
 * Return the largest possible sum of the array after modifying it in this way.
 *
 *
 *
 * Example 1:
 * Input: A = [4,2,3], K = 1
 * Output: 5
 * Explanation: Choose indices (1,) and A becomes [4,-2,3].
 *
 * Example 2:
 * Input: A = [3,-1,0,2], K = 3
 * Output: 6
 * Explanation: Choose indices (1, 2, 2) and A becomes [3,1,0,2].
 *
 * Example 3:
 * Input: A = [2,-3,-1,5,-4], K = 2
 * Output: 13
 * Explanation: Choose indices (1, 4) and A becomes [2,3,-1,5,4].
 *
 *
 * Note:
 * 1 <= A.length <= 10000
 * 1 <= K <= 10000
 * -100 <= A[i] <= 1000
 */

class Solution {
  public int largestSumAfterKNegations(int[] a, int k) {
    Arrays.sort(a);

    int i = 0;
    for (; i < a.length && k > 0 && a[i] < 0; i++, k--) {
      a[i] = -a[i];
    }

    if (k > 0 && k % 2 == 1) {
      if (i == 0 || (i < a.length && a[i] < a[i - 1])) {
        a[i] = -a[i];
      } else {
        a[i - 1] = -a[i - 1];
      }
    }

    int sum = 0;
    for (int num: a) {
      sum += num;
    }
    return sum;
  }
}
