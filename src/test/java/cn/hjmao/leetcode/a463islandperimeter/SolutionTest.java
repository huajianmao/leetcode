package cn.hjmao.leetcode.a463islandperimeter;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testIslandPerimeter1() {
    int[][] grid = {
        {0, 1, 0, 0},
        {1, 1, 1, 0},
        {0, 1, 0, 0},
        {1, 1, 0, 0}
    };
    int expect = 16;
    int actual = solution.islandPerimeter(grid);
    assertEquals(actual, expect);
  }

  @Test
  public void testIslandPerimeter2() {
    int[][] grid = {{1}};
    int expect = 4;
    int actual = solution.islandPerimeter(grid);
    assertEquals(actual, expect);
  }

  @Test
  public void testIslandPerimeter3() {
    int[][] grid = {{1, 1}, {1, 1}};
    int expect = 8;
    int actual = solution.islandPerimeter(grid);
    assertEquals(actual, expect);
  }

  @Test
  public void testIslandPerimeter4() {
    int[][] grid = {{0, 1}, {0, 0}};
    int expect = 4;
    int actual = solution.islandPerimeter(grid);
    assertEquals(actual, expect);
  }

  @Test
  public void testIslandPerimeter5() {
    int[][] grid = {
        {0, 0, 0, 0},
        {0, 1, 0, 0},
        {0, 0, 0, 0},
        {0, 0, 0, 0}
    };
    int expect = 4;
    int actual = solution.islandPerimeter(grid);
    assertEquals(actual, expect);
  }

  @Test
  public void testIslandPerimeter6() {
    int[][] grid = {
        {1},
        {0}
    };
    int expect = 4;
    int actual = solution.islandPerimeter(grid);
    assertEquals(actual, expect);
  }

  @Test
  public void testIslandPerimeter7() {
    int[][] grid = {
        {0, 1}
    };
    int expect = 4;
    int actual = solution.islandPerimeter(grid);
    assertEquals(actual, expect);
  }
}