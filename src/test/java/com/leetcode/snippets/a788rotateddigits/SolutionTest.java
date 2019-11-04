package com.leetcode.snippets.a788rotateddigits;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testRotatedDigits1() {
    int n = 10;
    int expect = 4;
    int actual = solution.rotatedDigits(n);
    assertEquals(actual, expect);
  }
}
