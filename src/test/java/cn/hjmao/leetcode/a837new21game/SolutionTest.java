package cn.hjmao.leetcode.a837new21game;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void testNew21Game1() {
    int N = 10;
    int K = 1;
    int W = 10;

    double expect = 1.0;
    double actual = solution.new21Game(N, K, W);
    assertEquals(actual, expect, 1e-5);
  }

  @Test
  public void testNew21Game2() {
    int N = 6;
    int K = 1;
    int W = 10;

    double expect = 0.6;
    double actual = solution.new21Game(N, K, W);
    assertEquals(actual, expect, 1e-5);
  }

  @Test
  public void testNew21Game3() {
    int N = 21;
    int K = 17;
    int W = 10;

    double expect = 0.73278;
    double actual = solution.new21Game(N, K, W);
    assertEquals(actual, expect, 1e-5);
  }
}