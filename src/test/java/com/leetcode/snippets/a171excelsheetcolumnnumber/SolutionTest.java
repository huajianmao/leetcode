package com.leetcode.snippets.a171excelsheetcolumnnumber;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testTitleToNumber1() {
    String s = "A";
    int expect = 1;

    int actual = solution.titleToNumber(s);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testTitleToNumber2() {
    String s = "AB";
    int expect = 28;

    int actual = solution.titleToNumber(s);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testTitleToNumber3() {
    String s = "ZY";
    int expect = 701;

    int actual = solution.titleToNumber(s);
    assertEquals(actual, expect);
  }
}
