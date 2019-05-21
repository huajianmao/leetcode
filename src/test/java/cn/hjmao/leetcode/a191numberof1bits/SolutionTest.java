package cn.hjmao.leetcode.a191numberof1bits;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test
  public void testHammingWeight1() {
    int n = -3;
    int expect = 31;
    int actual = solution.hammingWeight(n);
    assertEquals(actual, expect);
  }
}
