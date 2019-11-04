package com.leetcode.snippets.a219containsduplicateii;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testContainsNearbyDuplicate1() {
    int[] nums = {99, 99};
    int k = 2;
    boolean actual = solution.containsNearbyDuplicate(nums, k);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testContainsNearbyDuplicate2() {
    int[] nums = {1, 2, 3, 1};
    int k = 3;
    boolean actual = solution.containsNearbyDuplicate(nums, k);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testContainsNearbyDuplicate3() {
    int[] nums = {1, 0, 1, 1};
    int k = 1;
    boolean actual = solution.containsNearbyDuplicate(nums, k);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testContainsNearbyDuplicate4() {
    int[] nums = {1, 2, 3, 1, 2, 3};
    int k = 2;
    boolean actual = solution.containsNearbyDuplicate(nums, k);
    assertFalse(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testContainsNearbyDuplicate5() {
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
    int k = 3;
    boolean actual = solution.containsNearbyDuplicate(nums, k);
    assertTrue(actual);
  }
}
