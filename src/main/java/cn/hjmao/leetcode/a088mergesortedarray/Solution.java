package cn.hjmao.leetcode.a088mergesortedarray;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/merge-sorted-array/
 *
 * Desc:
 * =====
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note:
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n)
 * to hold additional elements from nums2.
 */

public class Solution {

  // FIXME: add implementation code herßße.
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int indexM = m - 1;
    int indexN = n - 1;
    int pos = m + n - 1;

    while (indexN >= 0) {
      if (indexM >= 0) {
        if (nums1[indexM] <= nums2[indexN]) {
          nums1[pos] = nums2[indexN];
          indexN--;
        } else {
          nums1[pos] = nums1[indexM];
          indexM--;
        }
      } else {
        nums1[pos] = nums2[indexN];
        indexN--;
      }
      pos--;
    }
  }
}
