package com.leetcode.snippets.a645setmismatch;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFindErrorNums1() {
    int[] nums = {1, 2, 2, 4};
    int[] expect = {2, 3};
    int[] actual = solution.findErrorNums(nums);
    assertEquals(actual, expect);
  }
}
