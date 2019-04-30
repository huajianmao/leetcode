package cn.hjmao.leetcode.a006zigzagconversion;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by hjmao on 18/01/2017.
 */
public class SolutionTest {
  private Solution solution;

  @BeforeMethod
  public void setUp() throws Exception {
    this.solution = new Solution();
  }

  @Test
  public void testConvert() throws Exception {
    String s = "PAYPALISHIRING";
    int numRows = 3;
    String expected = "PAHNAPLSIIGYIR";

    assertEquals(this.solution.convert(s, numRows), expected);
  }
}