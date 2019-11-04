package com.leetcode.snippets.a137singlenumberii;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSingleNumber1() {
    int[] nums = {2, 2, 3, 2};
    int expect = 3;
    int actual = solution.singleNumber(nums);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSingleNumber2() {
    int[] nums = {0, 1, 0, 1, 0, 1, 99};
    int expect = 99;
    int actual = solution.singleNumber(nums);
    assertEquals(actual, expect);
  }
}
