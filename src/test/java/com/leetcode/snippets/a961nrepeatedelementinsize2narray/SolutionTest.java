package com.leetcode.snippets.a961nrepeatedelementinsize2narray;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testRepeatedNTimes1() {
    int[] a = {1, 2, 3, 3};
    int expect = 3;
    int actual = solution.repeatedNTimes(a);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testRepeatedNTimes2() {
    int[] a = {2, 1, 2, 5, 3, 2};
    int expect = 2;
    int actual = solution.repeatedNTimes(a);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testRepeatedNTimes3() {
    int[] a = {5, 1, 5, 2, 5, 3, 5, 4};
    int expect = 5;
    int actual = solution.repeatedNTimes(a);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testRepeatedNTimes4() {
    int[] a = {5, 1, 2, 5};
    int expect = 5;
    int actual = solution.repeatedNTimes(a);
    assertEquals(actual, expect);
  }
}
