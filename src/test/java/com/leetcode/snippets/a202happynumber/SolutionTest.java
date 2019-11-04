package com.leetcode.snippets.a202happynumber;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsHappy1() {
    int n = 19;
    boolean actual = solution.isHappy(n);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsHappy2() {
    int n = 2;
    boolean actual = solution.isHappy(n);
    assertFalse(actual);
  }
}
