package cn.hjmao.leetcode.a441arrangingcoins;

import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testArrangeCoins1() {
    int n = 5;
    int expect = 2;
    int actual = solution.arrangeCoins(n);
    assertEquals(actual, expect);
  }

  @Test
  public void testArrangeCoins2() {
    int n = 8;
    int expect = 3;
    int actual = solution.arrangeCoins(n);
    assertEquals(actual, expect);
  }

  @Test
  public void testArrangeCoins3() {
    int n = 32;
    int expect = 7;
    int actual = solution.arrangeCoins(n);
    assertEquals(actual, expect);
  }

  @Test
  public void testArrangeCoins4() {
    int n = 0;
    int expect = 0;
    int actual = solution.arrangeCoins(n);
    assertEquals(actual, expect);
  }

  @Test
  public void testArrangeCoins5() {
    int n = 2123949673;
    int expect = 65175;
    int actual = solution.arrangeCoins(n);
    assertEquals(actual, expect);
  }

  @Test
  public void testArrangeCoins7() {
    int n = 1908265293;
    int expect = 61777;
    int actual = solution.arrangeCoins(n);
    assertEquals(actual, expect);
  }

  @Test
  public void testArrangeCoins8() {
    int n = 1449861365;
    int expect = 53848;
    int actual = solution.arrangeCoins(n);
    assertEquals(actual, expect);
  }

  @Test
  public void testArrangeCoins9() {
    int n = 1972203226;
    int expect = 62804;
    int actual = solution.arrangeCoins(n);
    assertEquals(actual, expect);
  }


  @Test
  public void testArrangeCoinsX() {
    Random random = new Random();
    for (int i = 0; i < 10000; i++) {
      int n = random.nextInt();
      int actual = solution.arrangeCoins(n);
      if (n <= 0) {
        assertEquals(actual, 0);
      } else {
        int thisLevelTotal = (int)((long)actual * (actual + 1) / 2);
        int nextLevelTotal = (int)((long)(actual + 1) * (actual + 2) / 2);
        assertTrue(thisLevelTotal <= n);
        assertTrue(nextLevelTotal > n);
      }
    }
  }
}