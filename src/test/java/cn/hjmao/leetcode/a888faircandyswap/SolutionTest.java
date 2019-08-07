package cn.hjmao.leetcode.a888faircandyswap;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testFairCandySwap1() {
    int[] a = {1, 1};
    int[] b = {2, 2};
    int[] expect = {1, 2};
    int[] actual = solution.fairCandySwap(a, b);
    assertEquals(actual, expect);
  }

  @Test
  public void testFairCandySwap2() {
    int[] a = {1, 2};
    int[] b = {2, 3};
    int[] expect = {2, 3};
    int[] actual = solution.fairCandySwap(a, b);
    assertEquals(actual, expect);
  }

  @Test
  public void testFairCandySwap3() {
    int[] a = {2};
    int[] b = {1, 3};
    int[] expect = {2, 3};
    int[] actual = solution.fairCandySwap(a, b);
    assertEquals(actual, expect);
  }

  @Test
  public void testFairCandySwap4() {
    int[] a = {1, 2, 5};
    int[] b = {2, 4};
    int[] expect = {5, 4};
    int[] actual = solution.fairCandySwap(a, b);
    assertEquals(actual, expect);
  }
}