package com.leetcode.snippets.a724findpivotindex;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testPivotIndex1() {
    int[] nums = {1, 7, 3, 6, 5, 6};
    int expect = 3;
    int actual = solution.pivotIndex(nums);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testPivotIndex2() {
    int[] nums = {1, 2, 3};
    int expect = -1;
    int actual = solution.pivotIndex(nums);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testPivotIndex3() {
    int[] nums = {1, 2};
    int expect = -1;
    int actual = solution.pivotIndex(nums);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testPivotIndex4() {
    int[] nums = {-1, -1, -1, -1, -1, 0};
    int expect = 2;
    int actual = solution.pivotIndex(nums);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testPivotIndex5() {
    int[] nums = {-1};
    int expect = -1;
    int actual = solution.pivotIndex(nums);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testPivotIndex6() {
    int[] nums = {2, 2};
    int expect = -1;
    int actual = solution.pivotIndex(nums);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testPivotIndex7() {
    int[] nums = {};
    int expect = -1;
    int actual = solution.pivotIndex(nums);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testPivotIndex8() {
    int[] nums = {-1, -1, -1, 0, 1, 1};
    int expect = 0;
    int actual = solution.pivotIndex(nums);
    assertEquals(actual, expect);
  }
}
