package cn.hjmao.leetcode.a883projectionareaof3dshapes;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testProjectionArea1() {
    int[][] grid = {{2}};
    int expect = 5;
    int actual = solution.projectionArea(grid);
    assertEquals(actual, expect);
  }

  @Test
  public void testProjectionArea2() {
    int[][] grid = {{1, 2}, {3, 4}};
    int expect = 17;
    int actual = solution.projectionArea(grid);
    assertEquals(actual, expect);
  }

  @Test
  public void testProjectionArea3() {
    int[][] grid = {{1, 0}, {0, 2}};
    int expect = 8;
    int actual = solution.projectionArea(grid);
    assertEquals(actual, expect);
  }

  @Test
  public void testProjectionArea4() {
    int[][] grid = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    int expect = 14;
    int actual = solution.projectionArea(grid);
    assertEquals(actual, expect);
  }

  @Test
  public void testProjectionArea5() {
    int[][] grid = {{2, 2, 2}, {2, 1, 2}, {2, 2, 2}};
    int expect = 21;
    int actual = solution.projectionArea(grid);
    assertEquals(actual, expect);
  }
}