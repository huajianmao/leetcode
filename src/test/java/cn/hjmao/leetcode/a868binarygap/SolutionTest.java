package cn.hjmao.leetcode.a868binarygap;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testBinaryGap1() {
    int n = 22;
    int expect = 2;
    int actual = solution.binaryGap(n);
    assertEquals(actual, expect);
  }

  @Test
  public void testBinaryGap2() {
    int n = 5;
    int expect = 2;
    int actual = solution.binaryGap(n);
    assertEquals(actual, expect);
  }

  @Test
  public void testBinaryGap3() {
    int n = 6;
    int expect = 1;
    int actual = solution.binaryGap(n);
    assertEquals(actual, expect);
  }

  @Test
  public void testBinaryGap4() {
    int n = 8;
    int expect = 0;
    int actual = solution.binaryGap(n);
    assertEquals(actual, expect);
  }
}