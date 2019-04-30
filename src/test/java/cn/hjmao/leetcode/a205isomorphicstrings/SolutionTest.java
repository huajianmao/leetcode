package cn.hjmao.leetcode.a205isomorphicstrings;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testIsIsomorphic1() {
    String s = "egg";
    String t = "add";
    boolean actual = solution.isIsomorphic(s, t);
    assertTrue(actual);
  }

  @Test
  public void testIsIsomorphic2() {
    String s = "foo";
    String t = "bar";
    boolean actual = solution.isIsomorphic(s, t);
    assertFalse(actual);
  }

  @Test
  public void testIsIsomorphic3() {
    String s = "paper";
    String t = "title";
    boolean actual = solution.isIsomorphic(s, t);
    assertTrue(actual);
  }

  @Test
  public void testIsIsomorphic4() {
    String s = "13";
    String t = "42";
    boolean actual = solution.isIsomorphic(s, t);
    assertTrue(actual);
  }

  @Test
  public void testIsIsomorphic5() {
    String s = "ab";
    String t = "aa";
    boolean actual = solution.isIsomorphic(s, t);
    assertFalse(actual);
  }

  @Test
  public void testIsIsomorphic6() {
    String s = "aa";
    String t = "ab";
    boolean actual = solution.isIsomorphic(s, t);
    assertFalse(actual);
  }
}
