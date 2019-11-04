package com.leetcode.snippets.a581shortestunsortedcontinuoussubarray;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFindUnsortedSubarray1() {
    int[] nums = {2, 6, 4, 8, 10, 9, 15};
    int expect = 5;
    int actual = solution.findUnsortedSubarray(nums);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFindUnsortedSubarray2() {
    int[] nums = {2, 4, 8, 10, 15};
    int expect = 0;
    int actual = solution.findUnsortedSubarray(nums);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFindUnsortedSubarray3() {
    int[] nums = {5};
    int expect = 0;
    int actual = solution.findUnsortedSubarray(nums);
    assertEquals(actual, expect);
  }
}
