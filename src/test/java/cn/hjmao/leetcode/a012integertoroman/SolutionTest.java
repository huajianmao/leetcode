package cn.hjmao.leetcode.a012integertoroman;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by hjmao on 17-2-8.
 */
public class SolutionTest {
  private Solution solution;

  @BeforeMethod
  public void setUp() throws Exception {
    this.solution = new Solution();
  }

  @Test
  public void testIntToRoman1() throws Exception {
    int num = 1;
    String expected = "I";

    assertEquals(this.solution.intToRoman(num), expected);
  }

  @Test
  public void testIntToRoman2() throws Exception {
    int num = 4;
    String expected = "IV";

    assertEquals(this.solution.intToRoman(num), expected);
  }

  @Test
  public void testIntToRoman3() throws Exception {
    int num = 5;
    String expected = "V";

    assertEquals(this.solution.intToRoman(num), expected);
  }

  @Test
  public void testIntToRoman4() throws Exception {
    int num = 8;
    String expected = "VIII";

    assertEquals(this.solution.intToRoman(num), expected);
  }

  @Test
  public void testIntToRoman5() throws Exception {
    int num = 9;
    String expected = "IX";

    assertEquals(this.solution.intToRoman(num), expected);
  }

  @Test
  public void testIntToRoman6() throws Exception {
    int num = 10;
    String expected = "X";

    assertEquals(this.solution.intToRoman(num), expected);
  }

  @Test
  public void testIntToRoman7() throws Exception {
    int num = 19;
    String expected = "XIX";

    assertEquals(this.solution.intToRoman(num), expected);
  }

  @Test
  public void testIntToRoman8() throws Exception {
    int num = 40;
    String expected = "XL";

    assertEquals(this.solution.intToRoman(num), expected);
  }

  @Test
  public void testIntToRoman9() throws Exception {
    int num = 50;
    String expected = "L";

    assertEquals(this.solution.intToRoman(num), expected);
  }

  @Test
  public void testIntToRoman10() throws Exception {
    int num = 90;
    String expected = "XC";

    assertEquals(this.solution.intToRoman(num), expected);
  }

  @Test
  public void testIntToRoman11() throws Exception {
    int num = 100;
    String expected = "C";

    assertEquals(this.solution.intToRoman(num), expected);
  }

  @Test
  public void testIntToRoman12() throws Exception {
    int num = 500;
    String expected = "D";

    assertEquals(this.solution.intToRoman(num), expected);
  }

  @Test
  public void testIntToRoman13() throws Exception {
    int num = 1000;
    String expected = "M";

    assertEquals(this.solution.intToRoman(num), expected);
  }

  @Test
  public void testIntToRoman14() throws Exception {
    int num = 1800;
    String expected = "MDCCC";

    assertEquals(this.solution.intToRoman(num), expected);
  }
}