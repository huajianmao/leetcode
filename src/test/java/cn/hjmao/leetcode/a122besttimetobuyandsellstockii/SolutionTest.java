package cn.hjmao.leetcode.a122besttimetobuyandsellstockii;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test
  public void testMaxProfit1() {
    int[] prices = {7, 1, 5, 3, 6, 4};
    int expect = 7;
    int actual = solution.maxProfit(prices);
    assertEquals(actual, expect);
  }

  @Test
  public void testMaxProfit2() {
    int[] prices = {1, 2, 3, 4, 5};
    int expect = 4;
    int actual = solution.maxProfit(prices);
    assertEquals(actual, expect);
  }

  @Test
  public void testMaxProfit3() {
    int[] prices = {7, 6, 4, 3, 1};
    int expect = 0;
    int actual = solution.maxProfit(prices);
    assertEquals(actual, expect);
  }
}
