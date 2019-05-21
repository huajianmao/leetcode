package cn.hjmao.leetcode.a496nextgreaterelementi;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testNextGreaterElement1() {
    int[] nums1 = {4, 1, 2};
    int[] nums2 = {1, 3, 4, 2};
    int[] expect = {-1, 3, -1};
    int[] actual = solution.nextGreaterElement(nums1, nums2);
    assertEquals(actual, expect);
  }

  @Test
  public void testNextGreaterElement2() {
    int[] nums1 = {2, 4};
    int[] nums2 = {1, 2, 3, 4};
    int[] expect = {3, -1};
    int[] actual = solution.nextGreaterElement(nums1, nums2);
    assertEquals(actual, expect);
  }
}
