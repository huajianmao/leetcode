package cn.hjmao.leetcode.a350intersectionoftwoarraysii;

import java.util.Arrays;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 *
 * Desc:
 * =====
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Note:
 *
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * Follow up:
 *
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk,
 * and the memory is limited such that you cannot load all elements into the memory at once?
 */

public class Solution {
  public int[] intersect(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);

    if (nums1.length < nums2.length) {
      return intersect(nums2, nums1);
    }

    int index1 = 0;
    int index2 = 0;
    int pos = 0;
    while (index1 < nums1.length && index2 < nums2.length) {
      if (nums1[index1] == nums2[index2]) {
        nums2[pos] = nums1[index1];
        index2++;
        pos++;
      } else if (nums1[index1] > nums2[index2]) {
        index2++;
        continue;
      }

      index1++;
    }

    return Arrays.copyOfRange(nums2, 0, pos);
  }
}
