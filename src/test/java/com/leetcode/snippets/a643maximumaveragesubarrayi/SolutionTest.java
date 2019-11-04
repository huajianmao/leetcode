package com.leetcode.snippets.a643maximumaveragesubarrayi;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFindMaxAverage1() {
    int[] nums = {1, 12, -5, -6, 50, 3};
    int k = 4;
    double expect = 12.75;
    double actual = solution.findMaxAverage(nums, k);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFindMaxAverage2() {
    int[] nums = {5};
    int k = 1;
    double expect = 5.0;
    double actual = solution.findMaxAverage(nums, k);
    assertEquals(actual, expect);
  }
}
