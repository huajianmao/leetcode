package com.leetcode.snippets.a985sumofevennumbersafterqueries;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSumEvenAfterQueries1() {
    int[] a = {1, 2, 3, 4};
    int[][] queries = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
    int[] expect = {8, 6, 2, 4};
    int[] actual = solution.sumEvenAfterQueries(a, queries);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSumEvenAfterQueries2() {
    int[] a = {5, 5, 4};
    int[][] queries = {{0, 1}, {1, 0}, {4, 1}};
    int[] expect = {4, 10, 10};
    int[] actual = solution.sumEvenAfterQueries(a, queries);
    assertEquals(actual, expect);
  }
}
