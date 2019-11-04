package com.leetcode.snippets.a292nimgame;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCanWinNim1() {
    int n = 4;
    boolean actual = solution.canWinNim(n);
    assertFalse(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCanWinNim2() {
    int n = 5;
    boolean actual = solution.canWinNim(n);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCanWinNim3() {
    int n = 6;
    boolean actual = solution.canWinNim(n);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCanWinNim4() {
    int n = 7;
    boolean actual = solution.canWinNim(n);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCanWinNim5() {
    int n = 8;
    boolean actual = solution.canWinNim(n);
    assertFalse(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCanWinNim6() {
    int n = 1348820612;
    boolean actual = solution.canWinNim(n);
    assertFalse(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCanWinNim7() {
    int n = 1199886170;
    boolean actual = solution.canWinNim(n);
    assertTrue(actual);
  }
}
