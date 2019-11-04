package com.leetcode.snippets.a561arraypartitioni;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testArrayPairSum1() {
    int[] nums = {1, 4, 3, 2};
    int expect = 4;
    int actual = solution.arrayPairSum(nums);
    assertEquals(actual, expect);
  }
}
