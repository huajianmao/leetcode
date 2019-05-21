package cn.hjmao.leetcode.a447numberofboomerangs;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testNumberOfBoomerangs() {
    int[][] points = {{0, 0}, {1, 0}, {2, 0}};
    int expect = 2;
    int actual = solution.numberOfBoomerangs(points);
    assertEquals(actual, expect);
  }
}
