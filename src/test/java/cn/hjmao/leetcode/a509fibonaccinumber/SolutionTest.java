package cn.hjmao.leetcode.a509fibonaccinumber;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testFib1() {
    int n = 2;
    int expect = 1;
    int actual = solution.fib(n);
    assertEquals(actual, expect);
  }

  @Test
  public void testFib2() {
    int n = 3;
    int expect = 2;
    int actual = solution.fib(n);
    assertEquals(actual, expect);
  }

  @Test
  public void testFib3() {
    int n = 4;
    int expect = 3;
    int actual = solution.fib(n);
    assertEquals(actual, expect);
  }

  @Test
  public void testFib4() {
    int n = 30;
    int expect = 832040;
    int actual = solution.fib(n);
    assertEquals(actual, expect);
  }
}