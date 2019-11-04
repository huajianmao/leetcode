package com.leetcode.snippets.a136singlenumber;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSingleNumber1() {
    int[] nums = {2, 2, 1};
    int expect = 1;
    int actual = solution.singleNumber(nums);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSingleNumber2() {
    int[] nums = {4, 1, 2, 1, 2};
    int expect = 4;
    int actual = solution.singleNumber(nums);
    assertEquals(actual, expect);
  }
}
