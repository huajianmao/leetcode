package com.leetcode.snippets.a507perfectnumber;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCheckPerfectNumber1() {
    int num = 28;
    boolean actual = solution.checkPerfectNumber(num);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCheckPerfectNumber2() {
    int num = 100000000;
    boolean actual = solution.checkPerfectNumber(num);
    assertFalse(actual);
  }
}
