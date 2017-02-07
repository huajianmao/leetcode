package cn.hjmao.leetcode.regularexpressionmatching;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by hjmao on 22/01/2017.
 */
public class SolutionTest {
  private Solution solution;

  @BeforeMethod
  public void setUp() throws Exception {
    this.solution = new Solution();
  }

  @Test
  public void testIsMatch1() throws Exception {
    String s = "aa";
    String p = "a";
    boolean expected = false;

    assertEquals(this.solution.isMatch(s, p), expected);
  }

  @Test
  public void testIsMatch2() throws Exception {
    String s = "aa";
    String p = "aa";
    boolean expected = true;

    assertEquals(this.solution.isMatch(s, p), expected);
  }

  @Test
  public void testIsMatch3() throws Exception {
    String s = "aaa";
    String p = "aa";
    boolean expected = false;

    assertEquals(this.solution.isMatch(s, p), expected);
  }

  @Test
  public void testIsMatch4() throws Exception {
    String s = "aa";
    String p = "a*";
    boolean expected = true;

    assertEquals(this.solution.isMatch(s, p), expected);
  }

  @Test
  public void testIsMatch5() throws Exception {
    String s = "aa";
    String p = ".*";
    boolean expected = true;

    assertEquals(this.solution.isMatch(s, p), expected);
  }

  @Test
  public void testIsMatch6() throws Exception {
    String s = "ab";
    String p = ".*";
    boolean expected = true;

    assertEquals(this.solution.isMatch(s, p), expected);
  }

  @Test
  public void testIsMatch7() throws Exception {
    String s = "aab";
    String p = "c*a*b";
    boolean expected = true;

    assertEquals(this.solution.isMatch(s, p), expected);
  }

  @Test
  public void testIsMatch8() throws Exception {
    String s = "ab";
    String p = "a.";
    boolean expected = true;

    assertEquals(this.solution.isMatch(s, p), expected);
  }
}