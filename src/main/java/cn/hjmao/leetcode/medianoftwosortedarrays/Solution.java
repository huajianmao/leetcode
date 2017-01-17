package cn.hjmao.leetcode.medianoftwosortedarrays;

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
    int nums1Len = nums1.length;
    int nums2Len = nums2.length;

    // TODO: the idea is to keep the two apart in the same length.
    //       i + j == nums1Len - i + nums2Len - j
    //    && max (i part + j part) <= min(nums1Len-i part + nums2Len-j part)
    //    i is processed as left part / 2, and j is calculated from the equal length equation,
    //    then check it with the min max condition.
    //    O(log(min(m, n)) ??
    int i;
    int j;

    return median;
  }
}
