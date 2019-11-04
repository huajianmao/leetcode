package com.leetcode.snippets.a027removeelement;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by hjmao on 17-2-20.
 */
public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testRemoveElement1() throws Exception {
    int[] nums = {3, 2, 2, 3};
    int val = 3;

    int expected = 2;
    int actual = this.solution.removeElement(nums, val);

    assertEquals(actual, expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testRemoveElement2() throws Exception {
    int[] nums = {};
    int val = 3;

    int expected = 0;
    int actual = this.solution.removeElement(nums, val);

    assertEquals(actual, expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testRemoveElement3() throws Exception {
    int[] nums = {3, 3, 3};
    int val = 3;

    int expected = 0;
    int actual = this.solution.removeElement(nums, val);

    assertEquals(actual, expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testRemoveElement4() throws Exception {
    int[] nums = {4, 5};
    int val = 4;

    int expected = 1;
    int actual = this.solution.removeElement(nums, val);

    assertEquals(actual, expected);
  }
}
