package cn.hjmao.leetcode.a949largesttimeforgivendigits;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/largest-time-for-given-digits/
 *
 * Desc:
 * =====
 * Given an array of 4 digits, return the largest 24 hour time that can be made.
 *
 * The smallest 24 hour time is 00:00, and the largest is 23:59.
 * Starting from 00:00, a time is larger if more time has elapsed since midnight.
 *
 * Return the answer as a string of length 5.  If no valid time can be made, return an empty string.
 *
 *
 *
 * Example 1:
 * Input: [1,2,3,4]
 * Output: "23:41"
 *
 * Example 2:
 * Input: [5,5,5,5]
 * Output: ""
 *
 *
 * Note:
 * A.length == 4
 * 0 <= A[i] <= 99
 */
import java.util.Arrays;

class Solution {
  public String largestTimeFromDigits(int[] a) {
    Arrays.sort(a);
    for (int i = a.length - 1; i >= 0; i--) {
      if (a[i] > 2) {
        continue;
      }
      for (int j = a.length - 1; j >= 0; j--) {
        if (j == i || (a[i] == 2 && a[j] > 3)) {
          continue;
        }
        for (int k = a.length - 1; k >= 0; k--) {
          if (k == i || k == j || a[k] > 5) {
            continue;
          }
          for (int l = a.length - 1; l >= 0; l--) {
            if (l == i || l == j || l == k) {
              continue;
            } else {
              return "" + a[i] + a[j] + ":" + a[k] + a[l];
            }
          }
        }
      }
    }
    return "";
  }
}
