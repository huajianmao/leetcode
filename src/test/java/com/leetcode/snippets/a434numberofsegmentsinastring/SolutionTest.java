package com.leetcode.snippets.a434numberofsegmentsinastring;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCountSegments1() {
    String s = "Hello, my name is John";
    int expect = 5;
    int actual = solution.countSegments(s);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCountSegments2() {
    String s = "   Hello, my name is John   ";
    int expect = 5;
    int actual = solution.countSegments(s);
    assertEquals(actual, expect);
  }
}
