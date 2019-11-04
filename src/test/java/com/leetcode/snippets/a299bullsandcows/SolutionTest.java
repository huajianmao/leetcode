package com.leetcode.snippets.a299bullsandcows;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testGetHint1() {
    String secret = "1807";
    String guess = "7810";
    String expect = "1A3B";
    String actual = solution.getHint(secret, guess);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testGetHint2() {
    String secret = "1123";
    String guess = "0111";
    String expect = "1A1B";
    String actual = solution.getHint(secret, guess);
    assertEquals(actual, expect);
  }
}
