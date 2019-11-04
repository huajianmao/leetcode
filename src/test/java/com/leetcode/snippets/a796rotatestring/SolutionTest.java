package com.leetcode.snippets.a796rotatestring;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testRotateString1() {
    String a = "abcde";
    String b = "cdeab";
    boolean actual = solution.rotateString(a, b);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testRotateString2() {
    String a = "abcde";
    String b = "abced";
    boolean actual = solution.rotateString(a, b);
    assertFalse(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testRotateString3() {
    String a = "aa";
    String b = "a";
    boolean actual = solution.rotateString(a, b);
    assertFalse(actual);
  }
}
