package com.leetcode.snippets.a674longestcontinuousincreasingsubsequence;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFindLengthOfLCIS1() {
    int[] nums = {1, 3, 5, 4, 7};
    int expect = 3;
    int actual = solution.findLengthOfLCIS(nums);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFindLengthOfLCIS2() {
    int[] nums = {2, 2, 2, 2, 2};
    int expect = 1;
    int actual = solution.findLengthOfLCIS(nums);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFindLengthOfLCIS3() {
    int[] nums = {2};
    int expect = 1;
    int actual = solution.findLengthOfLCIS(nums);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFindLengthOfLCIS4() {
    int[] nums = {2, 1};
    int expect = 1;
    int actual = solution.findLengthOfLCIS(nums);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFindLengthOfLCIS5() {
    int[] nums = {};
    int expect = 0;
    int actual = solution.findLengthOfLCIS(nums);
    assertEquals(actual, expect);
  }
}
