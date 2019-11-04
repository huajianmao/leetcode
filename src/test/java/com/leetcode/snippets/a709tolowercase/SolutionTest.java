package com.leetcode.snippets.a709tolowercase;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testToLowerCase1() {
    String str = "Hello";
    String expect = "hello";
    String actual = solution.toLowerCase(str);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testToLowerCase2() {
    String str = "here";
    String expect = "here";
    String actual = solution.toLowerCase(str);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testToLowerCase3() {
    String str = "LOVELY";
    String expect = "lovely";
    String actual = solution.toLowerCase(str);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testToLowerCase4() {
    String str = null;
    String expect = null;
    String actual = solution.toLowerCase(str);
    assertEquals(actual, expect);
  }
}
