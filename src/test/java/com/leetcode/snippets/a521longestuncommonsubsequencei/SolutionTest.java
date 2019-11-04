package com.leetcode.snippets.a521longestuncommonsubsequencei;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFindLUSlength1() {
    String a = "aba";
    String b = "cdc";
    int expect = 3;
    int actual = solution.findLUSlength(a, b);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFindLUSlength2() {
    String a = "aaa";
    String b = "aaa";
    int expect = -1;
    int actual = solution.findLUSlength(a, b);
    assertEquals(actual, expect);
  }
}
