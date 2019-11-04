package com.leetcode.snippets.a204countprimes;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCountPrimes1() {
    int n = 10;
    int expect = 4;
    int actual = solution.countPrimes(n);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCountPrimes2() {
    int n = 2;
    int expect = 0;
    int actual = solution.countPrimes(n);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCountPrimes3() {
    int n = 0;
    int expect = 0;
    int actual = solution.countPrimes(n);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCountPrimes4() {
    int n = 1;
    int expect = 0;
    int actual = solution.countPrimes(n);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCountPrimes5() {
    int n = 3;
    int expect = 1;
    int actual = solution.countPrimes(n);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCountPrimes6() {
    int n = 499979;
    int expect = 41537;
    int actual = solution.countPrimes(n);
    assertEquals(actual, expect);
  }
}
