package com.leetcode.snippets.a191numberof1bits;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testHammingWeight1() {
    int n = -3;
    int expect = 31;
    int actual = solution.hammingWeight(n);
    assertEquals(actual, expect);
  }
}
