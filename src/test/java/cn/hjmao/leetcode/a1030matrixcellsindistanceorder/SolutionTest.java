package cn.hjmao.leetcode.a1030matrixcellsindistanceorder;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testAllCellsDistOrder1() {
    int r = 1;
    int c = 2;
    int r0 = 0;
    int c0 = 0;
    int[][] expect = {{0, 0}, {0, 1}};
    int[][] actual = solution.allCellsDistOrder(r, c, r0, c0);
    assertEquals(actual.length, expect.length);
    for (int i = 0; i < expect.length; i++) {
      assertEquals(actual[i], expect[i]);
    }
  }

  @Test
  public void testAllCellsDistOrder2() {
    int r = 2;
    int c = 2;
    int r0 = 0;
    int c0 = 1;
    int[][] expect = {{0, 1}, {0, 0}, {1, 1}, {1, 0}};
    int[][] actual = solution.allCellsDistOrder(r, c, r0, c0);
    assertEquals(actual.length, expect.length);
    for (int i = 0; i < expect.length; i++) {
      assertEquals(actual[i], expect[i]);
    }
  }

  @Test
  public void testAllCellsDistOrder3() {
    int r = 2;
    int c = 3;
    int r0 = 1;
    int c0 = 2;
    int[][] expect = {{1, 2}, {0, 2}, {1, 1}, {0, 1}, {1, 0}, {0, 0}};
    int[][] actual = solution.allCellsDistOrder(r, c, r0, c0);
    assertEquals(actual.length, expect.length);
    for (int i = 0; i < expect.length; i++) {
      assertEquals(actual[i], expect[i]);
    }
  }
}