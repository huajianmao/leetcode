package cn.hjmao.leetcode.a013romantointeger;

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
  public void testRomanToInt1() throws Exception {
    String s = "I";
    int expected = 1;

    assertEquals(this.solution.romanToInt(s), expected);
  }

  @Test
  public void testRomanToInt2() throws Exception {
    String s = "IV";
    int expected = 4;

    assertEquals(this.solution.romanToInt(s), expected);
  }

  @Test
  public void testRomanToInt3() throws Exception {
    String s = "V";
    int expected = 5;

    assertEquals(this.solution.romanToInt(s), expected);
  }

  @Test
  public void testRomanToInt4() throws Exception {
    String s = "VIII";
    int expected = 8;

    assertEquals(this.solution.romanToInt(s), expected);
  }

  @Test
  public void testRomanToInt5() throws Exception {
    String s = "IX";
    int expected = 9;

    assertEquals(this.solution.romanToInt(s), expected);
  }

  @Test
  public void testRomanToInt6() throws Exception {
    String s = "X";
    int expected = 10;

    assertEquals(this.solution.romanToInt(s), expected);
  }

  @Test
  public void testRomanToInt7() throws Exception {
    String s = "XIX";
    int expected = 19;

    assertEquals(this.solution.romanToInt(s), expected);
  }

  @Test
  public void testRomanToInt8() throws Exception {
    String s = "XL";
    int expected = 40;

    assertEquals(this.solution.romanToInt(s), expected);
  }

  @Test
  public void testRomanToInt9() throws Exception {
    String s = "L";
    int expected = 50;

    assertEquals(this.solution.romanToInt(s), expected);
  }

  @Test
  public void testRomanToInt10() throws Exception {
    String s = "XC";
    int expected = 90;

    assertEquals(this.solution.romanToInt(s), expected);
  }

  @Test
  public void testRomanToInt11() throws Exception {
    String s = "C";
    int expected = 100;

    assertEquals(this.solution.romanToInt(s), expected);
  }

  @Test
  public void testRomanToInt12() throws Exception {
    String s = "D";
    int expected = 500;

    assertEquals(this.solution.romanToInt(s), expected);
  }

  @Test
  public void testRomanToInt13() throws Exception {
    String s = "M";
    int expected = 1000;

    assertEquals(this.solution.romanToInt(s), expected);
  }

  @Test
  public void testRomanToInt14() throws Exception {
    String s = "MDCCC";
    int expected = 1800;

    assertEquals(this.solution.romanToInt(s), expected);
  }
}
