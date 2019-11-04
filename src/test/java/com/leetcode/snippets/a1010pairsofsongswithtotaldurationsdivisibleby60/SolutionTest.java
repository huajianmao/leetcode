package com.leetcode.snippets.a1010pairsofsongswithtotaldurationsdivisibleby60;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testNumPairsDivisibleBy60T1() {
    int[] time = {30, 20, 150, 100, 40};
    int expect = 3;
    int actual = solution.numPairsDivisibleBy60(time);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testNumPairsDivisibleBy60T2() {
    int[] time = {60, 60, 60};
    int expect = 3;
    int actual = solution.numPairsDivisibleBy60(time);
    assertEquals(actual, expect);
  }
}
