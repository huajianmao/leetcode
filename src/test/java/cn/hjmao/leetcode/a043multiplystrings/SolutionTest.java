package cn.hjmao.leetcode.a043multiplystrings;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by hjmao on 17-3-9.
 */
public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testMultiply1() throws Exception {
    String num1 = "1";
    String num2 = "2";
    String expected = "2";
    String actual = this.solution.multiply(num1, num2);
    assertEquals(actual, expected);
  }

  @Test
  public void testMultiply2() throws Exception {
    String num1 = "0";
    String num2 = "0";
    String expected = "0";
    String actual = this.solution.multiply(num1, num2);
    assertEquals(actual, expected);
  }

  @Test
  public void testMultiply3() throws Exception {
    String num1 = "0";
    String num2 = "1";
    String expected = "0";
    String actual = this.solution.multiply(num1, num2);
    assertEquals(actual, expected);
  }

  @Test
  public void testMultiply4() throws Exception {
    String num1 = "1";
    String num2 = "0";
    String expected = "0";
    String actual = this.solution.multiply(num1, num2);
    assertEquals(actual, expected);
  }

  @Test
  public void testMultiply5() throws Exception {
    String num1 = "9999999";
    String num2 = "99999999";
    String expected = "999999890000001";
    String actual = this.solution.multiply(num1, num2);
    assertEquals(actual, expected);
  }

  @Test
  public void testMultiply6() throws Exception {
    String num1 = "23549";
    String num2 = "20395";
    String expected = "480281855";
    String actual = this.solution.multiply(num1, num2);
    assertEquals(actual, expected);
  }

  @Test
  public void testMultiply7() throws Exception {
    String num1 = "235491823351215235213534647342135215";
    String num2 = "2039581206194e892983415910585623189623";
    String expected = "4803046971207650804255753779663006253762956119544111478794333971650873945";
    String actual = this.solution.multiply(num1, num2);
    assertEquals(actual, expected);
  }

  @Test
  public void testMultiply8() throws Exception {
    String num1 = "99";
    String num2 = "99";
    String expected = 99 * 99 + "";
    String actual = this.solution.multiply(num1, num2);
    assertEquals(actual, expected);
  }

  @Test
  public void testMultiply9() throws Exception {
    String num1 = "999999";
    String num2 = "0";
    String expected = "0";
    String actual = this.solution.multiply(num1, num2);
    assertEquals(actual, expected);
  }
}
