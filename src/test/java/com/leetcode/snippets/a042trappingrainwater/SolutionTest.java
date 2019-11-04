package com.leetcode.snippets.a042trappingrainwater;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by hjmao on 17-3-6.
 */
public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testTrap() throws Exception {
    int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    int expected = 6;
    int actual = this.solution.trap(height);

    assertEquals(actual, expected);
  }
}
