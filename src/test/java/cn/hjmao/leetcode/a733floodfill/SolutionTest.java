package cn.hjmao.leetcode.a733floodfill;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testFloodFill1() {
    int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
    int sr = 1;
    int sc = 1;
    int newColor = 2;
    int[][] expect = {{2, 2, 2}, {2, 2, 0}, {2, 0, 1}};
    int[][] actual = solution.floodFill(image, sr, sc, newColor);
    assertEquals(actual.length, expect.length);
    for (int i = 0; i < actual.length; i++) {
      assertEquals(actual[i], expect[i]);
    }
  }
}