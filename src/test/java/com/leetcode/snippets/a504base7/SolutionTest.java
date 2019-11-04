package com.leetcode.snippets.a504base7;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testConvertToBase71() {
    int num = 100;
    String expect = "202";
    String actual = solution.convertToBase7(num);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testConvertToBase72() {
    int num = -7;
    String expect = "-10";
    String actual = solution.convertToBase7(num);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testConvertToBase73() {
    int num = 0;
    String expect = "0";
    String actual = solution.convertToBase7(num);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testConvertToBase74() {
    int num = -10000000;
    String expect = "-150666343";
    String actual = solution.convertToBase7(num);
    assertEquals(actual, expect);
  }
}
