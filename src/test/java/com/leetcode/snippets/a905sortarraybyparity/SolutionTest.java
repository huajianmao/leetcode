package com.leetcode.snippets.a905sortarraybyparity;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSortArrayByParity1() {
    int[] a = {3,1,2,4};
    int[] expect = {4, 2, 1, 3};
    int[] actual = solution.sortArrayByParity(a);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSortArrayByParity2() {
    int[] a = {1};
    int[] expect = {1};
    int[] actual = solution.sortArrayByParity(a);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSortArrayByParity3() {
    int[] a = {2};
    int[] expect = {2};
    int[] actual = solution.sortArrayByParity(a);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSortArrayByParity4() {
    int[] a = {2, 4};
    int[] expect = {2, 4};
    int[] actual = solution.sortArrayByParity(a);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSortArrayByParity5() {
    int[] a = {1, 3};
    int[] expect = {1, 3};
    int[] actual = solution.sortArrayByParity(a);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSortArrayByParity6() {
    int[] a = {1, 2};
    int[] expect = {2, 1};
    int[] actual = solution.sortArrayByParity(a);
    assertEquals(actual, expect);
  }
}
