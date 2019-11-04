package com.leetcode.snippets.a004medianoftwosortedarrays;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by hjmao on 17/01/2017.
 */
public class SolutionTest {
  private Solution solution;

  @BeforeMethod
  public void setUp() throws Exception {
    this.solution = new Solution();
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFindMedianSortedArrays1() throws Exception {
    int[] nums1 = {1, 3};
    int[] nums2 = {2};
    double expected = 2;

    assertEquals(this.solution.findMedianSortedArrays(nums1, nums2), expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFindMedianSortedArrays2() throws Exception {
    int[] nums1 = {1, 2};
    int[] nums2 = {3, 4};
    double expected = 2.5;

    assertEquals(this.solution.findMedianSortedArrays(nums1, nums2), expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFindMedianSortedArrays3() throws Exception {
    int[] nums1 = {};
    int[] nums2 = {3, 4};
    double expected = 3.5;

    assertEquals(this.solution.findMedianSortedArrays(nums1, nums2), expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFindMedianSortedArrays4() throws Exception {
    int[] nums1 = {};
    int[] nums2 = {3, 4, 5};
    double expected = 4;

    assertEquals(this.solution.findMedianSortedArrays(nums1, nums2), expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFindMedianSortedArrays5() throws Exception {
    int[] nums1 = {};
    int[] nums2 = {3};
    double expected = 3;

    assertEquals(this.solution.findMedianSortedArrays(nums1, nums2), expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFindMedianSortedArrays6() throws Exception {
    int[] nums1 = {1, 1};
    int[] nums2 = {1, 2};
    double expected = 1.0;

    assertEquals(this.solution.findMedianSortedArrays(nums1, nums2), expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFindMedianSortedArrays7() throws Exception {
    int[] nums1 = {1, 2};
    int[] nums2 = {1, 1};
    double expected = 1.0;

    assertEquals(this.solution.findMedianSortedArrays(nums1, nums2), expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFindMedianSortedArrays8() throws Exception {
    int[] nums1 = {2, 2};
    int[] nums2 = {1, 2};
    double expected = 2.0;

    assertEquals(this.solution.findMedianSortedArrays(nums1, nums2), expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFindMedianSortedArrays9() throws Exception {
    int[] nums1 = {1, 2};
    int[] nums2 = {2, 2};
    double expected = 2.0;

    assertEquals(this.solution.findMedianSortedArrays(nums1, nums2), expected);
  }
}
