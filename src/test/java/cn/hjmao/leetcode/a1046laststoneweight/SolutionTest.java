package cn.hjmao.leetcode.a1046laststoneweight;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testLastStoneWeight1() {
    int[] stones = {2, 7, 4, 1, 8, 1};
    int expect = 1;
    int actual = solution.lastStoneWeight(stones);
    assertEquals(actual, expect);
  }
}