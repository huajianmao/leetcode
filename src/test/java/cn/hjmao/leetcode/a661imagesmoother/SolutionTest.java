package cn.hjmao.leetcode.a661imagesmoother;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testImageSmoother1() {
    int[][] m = {
        {1, 1},
        {1, 0},
        {1, 1}
    };
    int[][] expect = {
        {0, 0},
        {0, 0},
        {0, 0}
    };
    int[][] actual = solution.imageSmoother(m);
    for (int i = 0; i < m.length; i++) {
      assertEquals(actual[i], expect[i]);
    }
  }

  @Test
  public void testImageSmoother2() {
    int[][] m = {
        {1, 1, 1},
        {1, 0, 1},
        {1, 1, 1}
    };
    int[][] expect = {
        {0, 0, 0},
        {0, 0, 0},
        {0, 0, 0}
    };
    int[][] actual = solution.imageSmoother(m);
    for (int i = 0; i < m.length; i++) {
      assertEquals(actual[i], expect[i]);
    }
  }
}