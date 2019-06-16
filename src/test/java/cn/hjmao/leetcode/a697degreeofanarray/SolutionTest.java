package cn.hjmao.leetcode.a697degreeofanarray;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testFindShortestSubArray1() {
    int[] nums = {1, 2, 2, 3, 1};
    int expect = 2;
    int actual = solution.findShortestSubArray(nums);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindShortestSubArray2() {
    int[] nums = {1, 2, 2, 3, 1, 4, 2};
    int expect = 6;
    int actual = solution.findShortestSubArray(nums);
    assertEquals(actual, expect);
  }
}