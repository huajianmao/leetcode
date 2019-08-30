package cn.hjmao.leetcode.a994rottingoranges;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testOrangesRotting1() {
    int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
    int expect = 4;
    int actual = solution.orangesRotting(grid);
    assertEquals(actual, expect);
  }

  @Test
  public void testOrangesRotting2() {
    int[][] grid = {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
    int expect = -1;
    int actual = solution.orangesRotting(grid);
    assertEquals(actual, expect);
  }

  @Test
  public void testOrangesRotting3() {
    int[][] grid = {{0, 2}};
    int expect = 0;
    int actual = solution.orangesRotting(grid);
    assertEquals(actual, expect);
  }

  @Test
  public void testOrangesRotting4() {
    int[][] grid = {{1, 2}};
    int expect = 1;
    int actual = solution.orangesRotting(grid);
    assertEquals(actual, expect);
  }
}