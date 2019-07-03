package cn.hjmao.leetcode.a762primenumberofsetbitsinbinaryrepresentation;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testCountPrimeSetBits1() {
    int l = 6;
    int r = 10;
    int expect = 4;
    int actual = solution.countPrimeSetBits(l, r);
    assertEquals(actual, expect);
  }

  @Test
  public void testCountPrimeSetBits2() {
    int l = 10;
    int r = 15;
    int expect = 5;
    int actual = solution.countPrimeSetBits(l, r);
    assertEquals(actual, expect);
  }
}