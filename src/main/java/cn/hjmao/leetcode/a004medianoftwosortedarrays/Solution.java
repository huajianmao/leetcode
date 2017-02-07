package cn.hjmao.leetcode.a004medianoftwosortedarrays;

/**
 * Created by hjmao on 17/01/2017.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 *
 * Desc:
 * =====
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 */

public class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    double median = 0.0;

    int[] shortArray;
    int[] longArray;
    if (nums1.length > nums2.length) {
      shortArray = nums2;
      longArray = nums1;
    } else {
      shortArray = nums1;
      longArray = nums2;
    }
    int m = shortArray.length;
    int n = longArray.length;
    int totalSize = m + n;

    // TODO: the idea is to keep the two apart in the same length.
    //       i + j == nums1Len - i + nums2Len - j
    //    && max (i part + j part) <= min(nums1Len-i part + nums2Len-j part)
    //    i is processed as left part / 2, and j is calculated from the equal length equation,
    //    then check it with the min max condition.
    //    O(log(min(m, n)) ??
    int i;
    int j;

    int start = 0;
    int end = m;
    while (start <= end) {
      i = (start + end) / 2;
      j = (totalSize + 1) / 2 - i;

      if (i < m && longArray[j - 1] > shortArray[i]) {
        start = i + 1;
      } else if (i > 0 && shortArray[i - 1] > longArray[j]) {
        end = i - 1;
      } else {
        int leftMax;
        int rightMin;

        if (i == 0) {
          leftMax = longArray[j - 1];
        } else if (j == 0) {
          leftMax = shortArray[i - 1];
        } else {
          leftMax = shortArray[i - 1] > longArray[j - 1] ? shortArray[i - 1] : longArray[j - 1];
        }

        if (totalSize % 2 == 1) {
          return leftMax;
        }

        if (i == m) {
          rightMin = longArray[j];
        } else if (j == n) {
          rightMin = shortArray[i];
        } else {
          rightMin = shortArray[i] < longArray[j] ? shortArray[i] : longArray[j];
        }

        return (leftMax + rightMin) / 2.0;
      }
    }

    return median;
  }
}
