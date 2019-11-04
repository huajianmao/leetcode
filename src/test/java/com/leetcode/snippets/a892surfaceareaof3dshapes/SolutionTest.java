package com.leetcode.snippets.a892surfaceareaof3dshapes;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSurfaceArea1() {
    int[][] grid = {{2}};
    int expect = 10;
    int actual = solution.surfaceArea(grid);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSurfaceArea2() {
    int[][] grid = {{1, 2}, {3, 4}};
    int expect = 34;
    int actual = solution.surfaceArea(grid);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSurfaceArea3() {
    int[][] grid = {{1, 0}, {0, 2}};
    int expect = 16;
    int actual = solution.surfaceArea(grid);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSurfaceArea4() {
    int[][] grid = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    int expect = 32;
    int actual = solution.surfaceArea(grid);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSurfaceArea5() {
    int[][] grid = {{2, 2, 2}, {2, 1, 2}, {2, 2, 2}};
    int expect = 46;
    int actual = solution.surfaceArea(grid);
    assertEquals(actual, expect);
  }
}
