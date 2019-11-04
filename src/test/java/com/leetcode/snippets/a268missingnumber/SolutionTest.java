package com.leetcode.snippets.a268missingnumber;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testMissingNumber1() {
    int[] nums = {3, 0, 1};
    int expect = 2;
    int actual = solution.missingNumber(nums);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testMissingNumber2() {
    int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
    int expect = 8;
    int actual = solution.missingNumber(nums);
    assertEquals(actual, expect);
  }
}
