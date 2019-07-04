package cn.hjmao.leetcode.a771jewelsandstones;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testNumJewelsInStones1() {
    String j = "aA";
    String s = "aAAbbbb";
    int expect = 3;
    int actual = solution.numJewelsInStones(j, s);
    assertEquals(actual, expect);
  }

  @Test
  public void testNumJewelsInStones2() {
    String j = "z";
    String s = "ZZ";
    int expect = 0;
    int actual = solution.numJewelsInStones(j, s);
    assertEquals(actual, expect);
  }
}