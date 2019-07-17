package cn.hjmao.leetcode.a836rectangleoverlap;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testIsRectangleOverlap1() {
    int[] rec1 = {0, 0, 2, 2};
    int[] rec2 = {1, 1, 3, 3};
    boolean actual = solution.isRectangleOverlap(rec1, rec2);
    assertTrue(actual);
  }

  @Test
  public void testIsRectangleOverlap2() {
    int[] rec1 = {0, 0, 1, 1};
    int[] rec2 = {1, 0, 2, 1};
    boolean actual = solution.isRectangleOverlap(rec1, rec2);
    assertFalse(actual);
  }

  @Test
  public void testIsRectangleOverlap3() {
    int[] rec1 = {0, 0, 1, 1};
    int[] rec2 = {0, 0, 5, 5};
    boolean actual = solution.isRectangleOverlap(rec1, rec2);
    assertTrue(actual);
  }

  @Test
  public void testIsRectangleOverlap4() {
    int[] rec1 = {0, 0, 5, 5};
    int[] rec2 = {0, 0, 1, 1};
    boolean actual = solution.isRectangleOverlap(rec1, rec2);
    assertTrue(actual);
  }

  @Test
  public void testIsRectangleOverlap5() {
    int[] rec1 = {-257926405,-680763313,702840196,454409669};
    int[] rec2 = {-275916328,-417802221,22808107,675629469};
    boolean actual = solution.isRectangleOverlap(rec1, rec2);
    assertTrue(actual);
  }
}