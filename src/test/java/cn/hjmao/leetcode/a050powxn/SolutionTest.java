package cn.hjmao.leetcode.a050powxn;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by hjmao on 08/02/2017.
 */
public class SolutionTest {
  private Solution solution;

  @BeforeMethod
  public void setUp() throws Exception {
    this.solution = new Solution();
  }

  @Test
  public void testMyPow1() throws Exception {
    double x = 0.0;
    int n = 0;
    double expected = Math.pow(x, n);

    assertEquals(this.solution.myPow(x, n), expected);
  }

  @Test
  public void testMyPow2() throws Exception {
    double x = 0.0;
    int n = -1;
    double expected = Math.pow(x, n);

    assertEquals(this.solution.myPow(x, n), expected);
  }

  @Test
  public void testMyPow3() throws Exception {
    double x = 23.23;
    int n = -1;
    double expected = Math.pow(x, n);

    assertEquals(this.solution.myPow(x, n), expected);
  }

  @Test
  public void testMyPow4() throws Exception {
    double x = 23.23;
    int n = 1;
    double expected = Math.pow(x, n);

    assertEquals(this.solution.myPow(x, n), expected);
  }

  @Test
  public void testMyPow5() throws Exception {
    double x = 23.23;
    int n = 2;
    double expected = Math.pow(x, n);

    assertEquals(this.solution.myPow(x, n), expected);
  }

  @Test
  public void testMyPow6() throws Exception {
    double x = Double.MAX_VALUE;
    int n = 2;
    double expected = Math.pow(x, n);

    assertEquals(this.solution.myPow(x, n), expected);
  }

  @Test
  public void testMyPow7() throws Exception {
    double x = 0.00001;
    int n = 2147483647;
    double expected = Math.pow(x, n);

    assertEquals(this.solution.myPow(x, n), expected);
  }

  @Test
  public void testMyPow8() throws Exception {
    double x = 100000;
    int n = 2147483647;
    double expected = Math.pow(x, n);

    assertEquals(this.solution.myPow(x, n), expected);
  }

  @Test
  public void testMyPow9() throws Exception {
    double x = -100000;
    int n = 2147483647;
    double expected = Math.pow(x, n);

    assertEquals(this.solution.myPow(x, n), expected);
  }

  @Test
  public void testMyPow10() throws Exception {
    double x = -100000;
    int n = 2147483646;
    double expected = Math.pow(x, n);

    assertEquals(this.solution.myPow(x, n), expected);
  }

  @Test
  public void testMyPow11() throws Exception {
    double x = 1.00000;
    int n = 2147483647;
    double expected = Math.pow(x, n);

    assertEquals(this.solution.myPow(x, n), expected);
  }

  @Test
  public void testMyPow12() throws Exception {
    double x = 1.00000;
    int n = -2147483648;
    double expected = Math.pow(x, n);

    assertEquals(this.solution.myPow(x, n), expected);
  }

  @Test
  public void testMyPow13() throws Exception {
    double x = -1.00000;
    int n = 2147483647;
    double expected = Math.pow(x, n);

    assertEquals(this.solution.myPow(x, n), expected);
  }

  @Test
  public void testMyPow14() throws Exception {
    double x = -13.62608;
    int n = 3;
    double expected = Math.pow(x, n);

    assertEquals(this.solution.myPow(x, n), expected);
  }
}
