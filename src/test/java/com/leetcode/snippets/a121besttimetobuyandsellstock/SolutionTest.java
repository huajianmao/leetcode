package com.leetcode.snippets.a121besttimetobuyandsellstock;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testMaxProfit1() {
    int[] prices = {7, 1, 5, 3, 6, 4};
    int expect = 5;
    int actual = solution.maxProfit(prices);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testMaxProfit2() {
    int[] prices = {7, 6, 4, 3, 1};
    int expect = 0;
    int actual = solution.maxProfit(prices);
    assertEquals(actual, expect);
  }
}
