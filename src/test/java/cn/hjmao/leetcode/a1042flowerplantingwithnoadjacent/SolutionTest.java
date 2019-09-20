package cn.hjmao.leetcode.a1042flowerplantingwithnoadjacent;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testGardenNoAdj1() {
    int n = 3;
    int[][] paths = {{1, 2}, {2, 3}, {3, 1}};
    int[] expect = {1, 2, 3};
    int[] actual = solution.gardenNoAdj(n, paths);
    assertEquals(actual, expect);
  }

  @Test
  public void testGardenNoAdj2() {
    int n = 4;
    int[][] paths = {{1, 2}, {3, 4}};
    int[] expect = {1, 2, 1, 2};
    int[] actual = solution.gardenNoAdj(n, paths);
    assertEquals(actual, expect);
  }

  @Test
  public void testGardenNoAdj3() {
    int n = 4;
    int[][] paths = {{1, 2}, {2, 3}, {3, 4}, {4, 1}, {1, 3}, {2, 4}};
    int[] expect = {1, 2, 3, 4};
    int[] actual = solution.gardenNoAdj(n, paths);
    assertEquals(actual, expect);
  }

  @Test
  public void testGardenNoAdj4() {
    int n = 1;
    int[][] paths = {};
    int[] expect = {1};
    int[] actual = solution.gardenNoAdj(n, paths);
    assertEquals(actual, expect);
  }
}