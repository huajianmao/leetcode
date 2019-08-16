package cn.hjmao.leetcode.a922sortarraybyparityii;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/sort-array-by-parity-ii/
 *
 * Desc:
 * =====
 * Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
 *
 * Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
 *
 * You may return any answer array that satisfies this condition.
 *
 *
 *
 * Example 1:
 * Input: [4,2,5,7]
 * Output: [4,5,2,7]
 * Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
 *
 *
 * Note:
 * 2 <= A.length <= 20000
 * A.length % 2 == 0
 * 0 <= A[i] <= 1000
 */

class Solution {
  public int[] sortArrayByParityII(int[] a) {
    int even = 0;
    int odd = 1;
    while (even < a.length) {
      while (even < a.length && a[even] % 2 == 0) {
        even += 2;
      }
      while (odd < a.length && a[odd] % 2 == 1) {
        odd += 2;
      }
      if (even < a.length) {
        swap(a, even, odd);
        even += 2;
        odd += 2;
      }
    }
    return a;
  }

  void swap(int[] a, int i, int j) {
    int tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
  }
}
