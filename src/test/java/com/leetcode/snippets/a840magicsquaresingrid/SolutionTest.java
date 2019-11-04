package com.leetcode.snippets.a840magicsquaresingrid;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testNumMagicSquaresInside1() {
    int[][] grid = {
        {4, 3, 8, 4},
        {9, 5, 1, 9},
        {2, 7, 6, 2}
    };
    int expect = 1;
    int actual = solution.numMagicSquaresInside(grid);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testNumMagicSquaresInside2() {
    int[][] grid = {
        {4, 3, 8},
        {9, 5, 1},
        {2, 7, 6}
    };
    int expect = 1;
    int actual = solution.numMagicSquaresInside(grid);
    assertEquals(actual, expect);
  }
}
