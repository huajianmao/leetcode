package com.leetcode.snippets.a696countbinarysubstrings;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCountBinarySubstrings1() {
    String s = "00110011";
    int expect = 6;
    int actual = solution.countBinarySubstrings(s);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCountBinarySubstrings2() {
    String s = "10101";
    int expect = 4;
    int actual = solution.countBinarySubstrings(s);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCountBinarySubstrings3() {
    String s = "1";
    int expect = 0;
    int actual = solution.countBinarySubstrings(s);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCountBinarySubstrings4() {
    String s = "11";
    int expect = 0;
    int actual = solution.countBinarySubstrings(s);
    assertEquals(actual, expect);
  }
}
