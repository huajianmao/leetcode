package cn.hjmao.leetcode.a258adddigits;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testAddDigits1() {
    int num = 38;
    int expect = 2;
    int actual = solution.addDigits(num);
    assertEquals(actual, expect);
  }
}
