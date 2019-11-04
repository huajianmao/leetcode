package com.leetcode.snippets.a168excelsheetcolumntitle;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testConvertToTitle1() {
    int n = 1;
    String expect = "A";
    String actual = solution.convertToTitle(n);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testConvertToTitle2() {
    int n = 28;
    String expect = "AB";
    String actual = solution.convertToTitle(n);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testConvertToTitle3() {
    int n = 701;
    String expect = "ZY";
    String actual = solution.convertToTitle(n);
    assertEquals(actual, expect);
  }
}
