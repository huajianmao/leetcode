package cn.hjmao.leetcode.a1005maximizesumofarrayafterknegations;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testLargestSumAfterKNegations1() {
    int[] a = {4, 2, 3};
    int k = 1;
    int expect = 5;
    int actual = solution.largestSumAfterKNegations(a, k);
    assertEquals(actual, expect);
  }

  @Test
  public void testLargestSumAfterKNegations2() {
    int[] a = {3, -1, 0, 2};
    int k = 3;
    int expect = 6;
    int actual = solution.largestSumAfterKNegations(a, k);
    assertEquals(actual, expect);
  }

  @Test
  public void testLargestSumAfterKNegations3() {
    int[] a = {2, -3, -1, 5, -4};
    int k = 2;
    int expect = 13;
    int actual = solution.largestSumAfterKNegations(a, k);
    assertEquals(actual, expect);
  }

  @Test
  public void testLargestSumAfterKNegations4() {
    int[] a = {2};
    int k = 2;
    int expect = 2;
    int actual = solution.largestSumAfterKNegations(a, k);
    assertEquals(actual, expect);
  }

  @Test
  public void testLargestSumAfterKNegations5() {
    int[] a = {2};
    int k = 1;
    int expect = -2;
    int actual = solution.largestSumAfterKNegations(a, k);
    assertEquals(actual, expect);
  }

  @Test
  public void testLargestSumAfterKNegations6() {
    int[] a = {-1};
    int k = 1;
    int expect = 1;
    int actual = solution.largestSumAfterKNegations(a, k);
    assertEquals(actual, expect);
  }

  @Test
  public void testLargestSumAfterKNegations7() {
    int[] a = {-1};
    int k = 2;
    int expect = -1;
    int actual = solution.largestSumAfterKNegations(a, k);
    assertEquals(actual, expect);
  }

  @Test
  public void testLargestSumAfterKNegations8() {
    int[] a = {-1};
    int k = 8;
    int expect = -1;
    int actual = solution.largestSumAfterKNegations(a, k);
    assertEquals(actual, expect);
  }

  @Test
  public void testLargestSumAfterKNegations9() {
    int[] a = {-1};
    int k = 7;
    int expect = 1;
    int actual = solution.largestSumAfterKNegations(a, k);
    assertEquals(actual, expect);
  }

  @Test
  public void testLargestSumAfterKNegations10() {
    int[] a = {-1, -2, -3};
    int k = 7;
    int expect = 6;
    int actual = solution.largestSumAfterKNegations(a, k);
    assertEquals(actual, expect);
  }

  @Test
  public void testLargestSumAfterKNegations11() {
    int[] a = {-1, -2, -3};
    int k = 6;
    int expect = 4;
    int actual = solution.largestSumAfterKNegations(a, k);
    assertEquals(actual, expect);
  }
}