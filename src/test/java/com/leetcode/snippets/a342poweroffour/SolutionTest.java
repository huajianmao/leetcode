package com.leetcode.snippets.a342poweroffour;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsPowerOfFour1() {
    int n = 1;
    boolean actual = solution.isPowerOfFour(n);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsPowerOfFour2() {
    int n = 2;
    boolean actual = solution.isPowerOfFour(n);
    assertFalse(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsPowerOfFour3() {
    int n = 4;
    boolean actual = solution.isPowerOfFour(n);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsPowerOfFour4() {
    int n = 8;
    boolean actual = solution.isPowerOfFour(n);
    assertFalse(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsPowerOfFour5() {
    int n = 16;
    boolean actual = solution.isPowerOfFour(n);
    assertTrue(actual);
  }
}
