package cn.hjmao.leetcode.a905sortarraybyparity;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/sort-array-by-parity/
 *
 * Desc:
 * =====
 * Given an array A of non-negative integers,
 * return an array consisting of all the even elements of A, followed by all the odd elements of A.
 *
 * You may return any answer array that satisfies this condition.
 *
 *
 *
 * Example 1:
 *
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 *
 *
 * Note:
 *
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 */

class Solution {
  public int[] sortArrayByParity(int[] a) {
    int i = 0;
    int j = a.length - 1;
    while (i < j) {
      while (i < j && a[i] % 2 == 0) {
        i++;
      }
      while (i < j && a[j] % 2 == 1) {
        j--;
      }
      if (i < j) {
        a[i] = a[i] ^ a[j];
        a[j] = a[i] ^ a[j];
        a[i] = a[i] ^ a[j];
      }
    }
    return a;
  }
}
