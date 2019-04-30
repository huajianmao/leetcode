package cn.hjmao.leetcode.a172factorialtrailingzeroes;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testTrailingZeroes1() {
    int n = 3;
    int expect = 0;

    int actual = solution.trailingZeroes(n);
    assertEquals(actual, expect);
  }

  @Test
  public void testTrailingZeroes2() {
    int n = 5;
    int expect = 1;

    int actual = solution.trailingZeroes(n);
    assertEquals(actual, expect);
  }
}
