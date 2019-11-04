package com.leetcode.snippets.a067addbinary;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testAddBinary1() {
    String a = "11";
    String b = "1";
    String expcted = "100";

    String actual = solution.addBinary(a, b);

    assertEquals(actual, expcted);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testAddBinary2() {
    String a = "1010";
    String b = "1011";
    String expcted = "10101";

    String actual = solution.addBinary(a, b);

    assertEquals(actual, expcted);
  }
}
