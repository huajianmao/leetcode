package cn.hjmao.leetcode.a069sqrtx;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testMySqrt() {
    for (int i = 0; i < 1000; i++) {
      assertEquals((int) Math.sqrt(i), solution.mySqrt(i));
    }
  }

  @Test
  public void testMySqrt1() {
    int x = 1;
    int expected = (int) Math.sqrt(x);

    int actual = solution.mySqrt(x);

    assertEquals(actual, expected);
  }

  @Test
  public void testMySqrt4() {
    int x = 4;
    int expected = (int) Math.sqrt(x);

    int actual = solution.mySqrt(x);

    assertEquals(actual, expected);
  }

  @Test
  public void testMySqrt8() {
    int x = 8;
    int expected = (int) Math.sqrt(x);

    int actual = solution.mySqrt(x);

    assertEquals(actual, expected);
  }

  @Test
  public void testMySqrt9() {
    int x = 9;
    int expected = (int) Math.sqrt(x);

    int actual = solution.mySqrt(x);

    assertEquals(actual, expected);
  }

  @Test
  public void testMySqrt10() {
    int x = 10;
    int expected = (int) Math.sqrt(x);

    int actual = solution.mySqrt(x);

    assertEquals(actual, expected);
  }

  @Test
  public void testMySqrt2147395599() {
    int x = 2147395599;
    int expected = (int) Math.sqrt(x);

    int actual = solution.mySqrt(x);

    assertEquals(actual, expected);
  }
}
