package cn.hjmao.leetcode.a1037validboomerang;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testIsBoomerang1() {
    int[][] points = {{1, 1}, {2, 3}, {3, 2}};
    boolean actual = solution.isBoomerang(points);
    assertTrue(actual);
  }

  @Test
  public void testIsBoomerang2() {
    int[][] points = {{1, 1}, {2, 2}, {3, 3}};
    boolean actual = solution.isBoomerang(points);
    assertFalse(actual);
  }

  @Test
  public void testIsBoomerang3() {
    int[][] points = {{0, 0}, {1, 0}, {2, 2}};
    boolean actual = solution.isBoomerang(points);
    assertTrue(actual);
  }
}
