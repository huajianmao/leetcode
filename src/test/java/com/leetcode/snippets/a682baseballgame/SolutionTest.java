package com.leetcode.snippets.a682baseballgame;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCalPoints1() {
    String[] ops = {"5", "2", "C", "D", "+"};
    int expect = 30;
    int actual = solution.calPoints(ops);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCalPoints2() {
    String[] ops = {"5", "-2", "4", "C", "D", "9", "+", "+"};
    int expect = 27;
    int actual = solution.calPoints(ops);
    assertEquals(actual, expect);
  }
}
