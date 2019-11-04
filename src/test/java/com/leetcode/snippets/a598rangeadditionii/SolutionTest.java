package com.leetcode.snippets.a598rangeadditionii;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testMaxCount1() {
    int m = 3;
    int n = 3;
    int[][] ops = {{2, 2}, {3, 3}};

    int expect = 4;
    int actual = solution.maxCount(m, n, ops);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testMaxCount2() {
    int m = 3;
    int n = 3;
    int[][] ops = {{2, 2}, {3, 3}, {3, 3}, {3, 3}, {2, 2}, {3, 3}, {3, 3}, {3, 3}, {2, 2}, {3, 3}, {3, 3}, {3, 3}};

    int expect = 4;
    int actual = solution.maxCount(m, n, ops);
    assertEquals(actual, expect);
  }
}
