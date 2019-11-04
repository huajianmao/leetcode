package com.leetcode.snippets.a189rotatearray;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testRotate1() {
    int[] nums = {1, 2, 3, 4, 5, 6, 7};
    int k = 3;

    int[] expect = {5, 6, 7, 1, 2, 3, 4};
    solution.rotate(nums, k);
    assertEquals(nums, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testRotate2() {
    int[] nums = {-1, -100, 3, 99};
    int k = 2;

    int[] expect = {3, 99, -1, -100};
    solution.rotate(nums, k);
    assertEquals(nums, expect);
  }
}
