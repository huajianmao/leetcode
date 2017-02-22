package cn.hjmao.leetcode.a029dividetwointegers;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by hjmao on 17-2-22.
 */
public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testDivide1() throws Exception {
    int dividend = 1;
    int divisor = 1;
    int expected = 1;
    int actual = this.solution.divide(dividend, divisor);

    assertEquals(actual, expected);
  }

  @Test
  public void testDivide2() throws Exception {
    int dividend = 2;
    int divisor = 0;
    int expected = Integer.MAX_VALUE;
    int actual = this.solution.divide(dividend, divisor);

    assertEquals(actual, expected);
  }

  @Test
  public void testDivide3() throws Exception {
    int dividend = 5;
    int divisor = 3;
    int expected = 1;
    int actual = this.solution.divide(dividend, divisor);

    assertEquals(actual, expected);
  }

  @Test
  public void testDivide4() throws Exception {
    int dividend = 500;
    int divisor = 2;
    int expected = 250;
    int actual = this.solution.divide(dividend, divisor);

    assertEquals(actual, expected);
  }

  @Test
  public void testDivide5() throws Exception {
    int dividend = 500;
    int divisor = 499;
    int expected = dividend / divisor;
    int actual = this.solution.divide(dividend, divisor);

    assertEquals(actual, expected);
  }

  @Test
  public void testDivide6() throws Exception {
    int dividend = (2 << 29) + 1;
    int divisor = 2;
    int expected = dividend / divisor;
    int actual = this.solution.divide(dividend, divisor);

    assertEquals(actual, expected);
  }

  @Test
  public void testDivide7() throws Exception {
    int dividend = 500;
    int divisor = 3;
    int expected = dividend / divisor;
    int actual = this.solution.divide(dividend, divisor);

    assertEquals(actual, expected);
  }

  @Test
  public void testDivide8() throws Exception {
    int dividend = -2147483648;
    int divisor = 2;
    int expected = dividend / divisor;
    int actual = this.solution.divide(dividend, divisor);

    assertEquals(actual, expected);
  }

  @Test
  public void testDivide9() throws Exception {
    int dividend = -2147483648;
    int divisor = 1;
    int expected = dividend / divisor;
    int actual = this.solution.divide(dividend, divisor);

    assertEquals(actual, expected);
  }

  @Test
  public void testDivide10() throws Exception {
    int dividend = 2147483647;
    int divisor = 1;
    int expected = dividend / divisor;
    int actual = this.solution.divide(dividend, divisor);

    assertEquals(actual, expected);
  }

  @Test
  public void testDivide11() throws Exception {
    int dividend = 2147483647;
    int divisor = -1;
    int expected = dividend / divisor;
    int actual = this.solution.divide(dividend, divisor);

    assertEquals(actual, expected);
  }

  @Test
  public void testDivide12() throws Exception {
    int dividend = -2147483648;
    int divisor = -1;
    int expected = Integer.MAX_VALUE;
    int actual = this.solution.divide(dividend, divisor);

    assertEquals(actual, expected);
  }

  @Test
  public void testDivide13() throws Exception {
    int dividend = -1971826679;
    int divisor = 1441631257;
    int expected = dividend / divisor;
    int actual = this.solution.divide(dividend, divisor);

    assertEquals(actual, expected);
  }

}