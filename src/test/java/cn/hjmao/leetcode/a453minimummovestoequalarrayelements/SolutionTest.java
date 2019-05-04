package cn.hjmao.leetcode.a453minimummovestoequalarrayelements;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testMinMoves1() {
    int[] nums = {1, 2, 3};
    int expect = 3;
    int actual = solution.minMoves(nums);
    assertEquals(actual, expect);
  }
}