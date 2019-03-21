package cn.hjmao.leetcode.a044wildcardmatching;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by hjmao on 17-3-9.
 */
public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testIsMatch1() throws Exception {
    String s = "aa";
    String p = "a";
    boolean expected = false;
    boolean actual = this.solution.isMatch(s, p);
    assertEquals(actual, expected);
  }

//  @Test
//  public void testIsMatch2() throws Exception {
//    String s = "aa";
//    String p = "aa";
//    boolean expected = true;
//    boolean actual = this.solution.isMatch(s, p);
//    assertEquals(actual, expected);
//  }
//
//  @Test
//  public void testIsMatch3() throws Exception {
//    String s = "aaa";
//    String p = "aa";
//    boolean expected = false;
//    boolean actual = this.solution.isMatch(s, p);
//    assertEquals(actual, expected);
//  }
//
//  @Test
//  public void testIsMatch4() throws Exception {
//    String s = "aa";
//    String p = "*";
//    boolean expected = true;
//    boolean actual = this.solution.isMatch(s, p);
//    assertEquals(actual, expected);
//  }
//
//  @Test
//  public void testIsMatch5() throws Exception {
//    String s = "aa";
//    String p = "a*";
//    boolean expected = true;
//    boolean actual = this.solution.isMatch(s, p);
//    assertEquals(actual, expected);
//  }
//
//  @Test
//  public void testIsMatch6() throws Exception {
//    String s = "ab";
//    String p = "?*";
//    boolean expected = true;
//    boolean actual = this.solution.isMatch(s, p);
//    assertEquals(actual, expected);
//  }
//
//  @Test
//  public void testIsMatch7() throws Exception {
//    String s = "aab";
//    String p = "c*a*b";
//    boolean expected = false;
//    boolean actual = this.solution.isMatch(s, p);
//    assertEquals(actual, expected);
//  }
}