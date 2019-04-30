package cn.hjmao.leetcode.a349intersectionoftwoarrays;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testIntersection1() {
    int[] nums1 = {1, 2, 2, 1};
    int[] nums2 = {2, 2};
    int[] expect = {2};
    int[] actual = solution.intersection(nums1, nums2);
    Arrays.sort(actual);
    Arrays.sort(expect);
    assertEquals(actual, expect);
  }

  @Test
  public void testIntersection2() {
    int[] nums1 = {4, 9, 5};
    int[] nums2 = {9, 4, 9, 8, 4};
    int[] expect = {9, 4};
    int[] actual = solution.intersection(nums1, nums2);
    Arrays.sort(actual);
    Arrays.sort(expect);
    assertEquals(actual, expect);
  }
}
