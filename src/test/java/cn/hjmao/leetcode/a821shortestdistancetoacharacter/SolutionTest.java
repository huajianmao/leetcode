package cn.hjmao.leetcode.a821shortestdistancetoacharacter;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testShortestToChar1() {
    String s = "loveleetcode";
    char c = 'e';
    int[] expect = {3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0};
    int[] actual = solution.shortestToChar(s, c);
    assertEquals(actual, expect);
  }
}