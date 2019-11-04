package com.leetcode.snippets.a217containsduplicate;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testContainsDuplicate1() {
    int[] nums = {1, 2, 3, 1};
    boolean actual = solution.containsDuplicate(nums);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testContainsDuplicate2() {
    int[] nums = {1, 2, 3, 4};
    boolean actual = solution.containsDuplicate(nums);
    assertFalse(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testContainsDuplicate3() {
    int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
    boolean actual = solution.containsDuplicate(nums);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testContainsDuplicate4() {
    int[] nums = {3, 3};
    boolean actual = solution.containsDuplicate(nums);
    assertTrue(actual);
  }
}
