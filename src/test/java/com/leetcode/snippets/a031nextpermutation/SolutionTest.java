package com.leetcode.snippets.a031nextpermutation;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by hjmao on 25/02/2017.
 */
public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testNextPermutation1() throws Exception {
    int[] nums = {1, 2, 3};
    int[] expected = {1, 3, 2};

    this.solution.nextPermutation(nums);
    assertEquals(nums, expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testNextPermutation2() throws Exception {
    int[] nums = {3, 2, 1};
    int[] expected = {1, 2, 3};

    this.solution.nextPermutation(nums);
    assertEquals(nums, expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testNextPermutation3() throws Exception {
    int[] nums = {1, 1, 5};
    int[] expected = {1, 5, 1};

    this.solution.nextPermutation(nums);
    assertEquals(nums, expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testNextPermutation4() throws Exception {
    int[] nums = {1, 5, 8, 7, 6, 5, 4, 3, 2, 1};
    int[] expected = {1, 6, 1, 2, 3, 4, 5, 5, 7, 8};

    this.solution.nextPermutation(nums);
    assertEquals(nums, expected);
  }
}
