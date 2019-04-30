package cn.hjmao.leetcode.a400nthdigit;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testFindNthDigit1() {
    int n = 3;
    int expect = 3;
    int actual = solution.findNthDigit(n);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindNthDigit2() {
    int n = 11;
    int expect = 0;
    int actual = solution.findNthDigit(n);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindNthDigit3() {
    int n = 10;
    int expect = 1;
    int actual = solution.findNthDigit(n);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindNthDigit4() {
    int n = 1000000000;
    int expect = 1;
    int actual = solution.findNthDigit(n);
    assertEquals(actual, expect);
  }
}
