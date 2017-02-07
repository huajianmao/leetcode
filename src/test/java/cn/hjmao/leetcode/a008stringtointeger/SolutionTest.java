package cn.hjmao.leetcode.a008stringtointeger;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by hjmao on 17-1-19.
 */
public class SolutionTest {
  private Solution solution;

  @BeforeMethod
  public void setUp() throws Exception {
    this.solution = new Solution();
  }

  @Test
  public void testMyAtoi1() throws Exception {
    String str = "123";
    int expected = 123;

    assertEquals(this.solution.myAtoi(str), expected);
  }

  @Test
  public void testMyAtoi2() throws Exception {
    String str = "+123";
    int expected = 123;

    assertEquals(this.solution.myAtoi(str), expected);
  }

  @Test
  public void testMyAtoi3() throws Exception {
    String str = "-123";
    int expected = -123;

    assertEquals(this.solution.myAtoi(str), expected);
  }

  @Test
  public void testMyAtoi4() throws Exception {
    String str = "0";
    int expected = 0;

    assertEquals(this.solution.myAtoi(str), expected);
  }

  @Test
  public void testMyAtoi5() throws Exception {
    String str = "    9";
    int expected = 9;

    assertEquals(this.solution.myAtoi(str), expected);
  }

  @Test
  public void testMyAtoi6() throws Exception {
    String str = "    9abcd   ";
    int expected = 9;

    assertEquals(this.solution.myAtoi(str), expected);
  }

  @Test
  public void testMyAtoi7() throws Exception {
    String str = "2147483648";
    int expected = 2147483647;

    assertEquals(this.solution.myAtoi(str), expected);
  }

  @Test
  public void testMyAtoi8() throws Exception {
    String str = "9223372036854775809";
    int expected = 2147483647;

    assertEquals(this.solution.myAtoi(str), expected);
  }

  @Test
  public void testMyAtoi9() throws Exception {
    String str = "-2147483648";
    int expected = -2147483648;

    assertEquals(this.solution.myAtoi(str), expected);
  }
}