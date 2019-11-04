package com.leetcode.snippets.a453minimummovestoequalarrayelements;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testMinMoves1() {
    int[] nums = {1, 2, 3};
    int expect = 3;
    int actual = solution.minMoves(nums);
    assertEquals(actual, expect);
  }
}
