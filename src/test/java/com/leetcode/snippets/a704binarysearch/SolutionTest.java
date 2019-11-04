package com.leetcode.snippets.a704binarysearch;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSearch1() {
    int[] nums = {-1, 0, 3, 5, 9, 12};
    int target = 9;
    int expect = 4;
    int actual = solution.search(nums, target);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSearch2() {
    int[] nums = {-1, 0, 3, 5, 9, 12};
    int target = 2;
    int expect = -1;
    int actual = solution.search(nums, target);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSearch3() {
    int[] nums = {-1};
    int target = -1;
    int expect = 0;
    int actual = solution.search(nums, target);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSearch4() {
    int[] nums = {-1};
    int target = -2;
    int expect = -1;
    int actual = solution.search(nums, target);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSearch5() {
    int[] nums = {-1, 0, 3, 5, 9, 12};
    int target = 13;
    int expect = -1;
    int actual = solution.search(nums, target);
    assertEquals(actual, expect);
  }
}
