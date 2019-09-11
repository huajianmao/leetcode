package cn.hjmao.leetcode.a1025divisorgame;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testDivisorGame1() {
    int n = 2;
    boolean actual = solution.divisorGame(n);
    assertTrue(actual);
  }

  @Test
  public void testDivisorGame2() {
    int n = 3;
    boolean actual = solution.divisorGame(n);
    assertFalse(actual);
  }
}