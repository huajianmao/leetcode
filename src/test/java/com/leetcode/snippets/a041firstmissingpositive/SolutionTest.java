package com.leetcode.snippets.a041firstmissingpositive;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by hjmao on 17-3-5.
 */
public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFirstMissingPositive1() throws Exception {
    int[] nums = {1, 2, 0};
    int expected = 3;
    int actual = this.solution.firstMissingPositive(nums);
    assertEquals(actual, expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFirstMissingPositive2() throws Exception {
    int[] nums = {3, 4, -1, 1};
    int expected = 2;
    int actual = this.solution.firstMissingPositive(nums);
    assertEquals(actual, expected);
  }
}
