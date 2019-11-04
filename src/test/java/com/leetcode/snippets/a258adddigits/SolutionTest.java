package com.leetcode.snippets.a258adddigits;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testAddDigits1() {
    int num = 38;
    int expect = 2;
    int actual = solution.addDigits(num);
    assertEquals(actual, expect);
  }
}
