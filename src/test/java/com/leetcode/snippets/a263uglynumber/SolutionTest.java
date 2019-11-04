package com.leetcode.snippets.a263uglynumber;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsUgly1() {
    int num = 1;
    boolean actual = solution.isUgly(num);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsUgly2() {
    int num = 2;
    boolean actual = solution.isUgly(num);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsUgly3() {
    int num = 6;
    boolean actual = solution.isUgly(num);
    assertTrue(actual);
  }


  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsUgly4() {
    int num = 8;
    boolean actual = solution.isUgly(num);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsUgly5() {
    int num = 14;
    boolean actual = solution.isUgly(num);
    assertFalse(actual);
  }
}
