package com.leetcode.snippets.a167twosumiiinputarrayissorted;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testTwoSum1() {
    int[] numbers = {2, 7, 11, 15};
    int target = 9;

    int[] expected = {1, 2};
    int[] actual = solution.twoSum(numbers, target);
    assertEquals(actual, expected);
  }
}
