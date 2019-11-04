package com.leetcode.snippets.a908smallestrangei;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSmallestRangeI1() {
    int[] a = {1};
    int k = 0;
    int expect = 0;
    int actual = solution.smallestRangeI(a, k);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSmallestRangeI2() {
    int[] a = {0, 10};
    int k = 2;
    int expect = 6;
    int actual = solution.smallestRangeI(a, k);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSmallestRangeI3() {
    int[] a = {1, 3, 6};
    int k = 3;
    int expect = 0;
    int actual = solution.smallestRangeI(a, k);
    assertEquals(actual, expect);
  }
}
