package com.leetcode.snippets.a665nondecreasingarray;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCheckPossibility1() {
    int[] nums = {4, 2, 3};
    boolean actual = solution.checkPossibility(nums);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCheckPossibility2() {
    int[] nums = {4, 2, 1};
    boolean actual = solution.checkPossibility(nums);
    assertFalse(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCheckPossibility3() {
    int[] nums = {4};
    boolean actual = solution.checkPossibility(nums);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCheckPossibility4() {
    int[] nums = {4, 3};
    boolean actual = solution.checkPossibility(nums);
    assertTrue(actual);
  }
}
