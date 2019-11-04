package com.leetcode.snippets.a1025divisorgame;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testDivisorGame1() {
    int n = 2;
    boolean actual = solution.divisorGame(n);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testDivisorGame2() {
    int n = 3;
    boolean actual = solution.divisorGame(n);
    assertFalse(actual);
  }
}
