package com.leetcode.snippets.a492constructtherectangle;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testConstructRectangle1() {
    int area = 4;
    int[] expect = {2, 2};
    int[] actual = solution.constructRectangle(area);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testConstructRectangle2() {
    int area = 6;
    int[] expect = {3, 2};
    int[] actual = solution.constructRectangle(area);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testConstructRectangle3() {
    int area = 5;
    int[] expect = {5, 1};
    int[] actual = solution.constructRectangle(area);
    assertEquals(actual, expect);
  }
}
