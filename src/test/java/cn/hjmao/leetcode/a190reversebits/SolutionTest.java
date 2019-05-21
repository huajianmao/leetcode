package cn.hjmao.leetcode.a190reversebits;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test
  public void testReverseBits1() {
    int n = 43261596;
    int expect = 964176192;
    int actual = solution.reverseBits(n);
    assertEquals(actual, expect);
  }

  @Test
  public void testReverseBits2() {
    int n = -3;
    int expect = -1073741825;
    int actual = solution.reverseBits(n);
    assertEquals(actual, expect);
  }
}
