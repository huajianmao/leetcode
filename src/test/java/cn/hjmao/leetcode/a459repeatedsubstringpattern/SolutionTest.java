package cn.hjmao.leetcode.a459repeatedsubstringpattern;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testRepeatedSubstringPattern1() {
    String s = "abab";
    boolean actual = solution.repeatedSubstringPattern(s);
    assertTrue(actual);
  }

  @Test
  public void testRepeatedSubstringPattern2() {
    String s = "aba";
    boolean actual = solution.repeatedSubstringPattern(s);
    assertFalse(actual);
  }

  @Test
  public void testRepeatedSubstringPattern3() {
    String s = "abcabcabcabc";
    boolean actual = solution.repeatedSubstringPattern(s);
    assertTrue(actual);
  }

  @Test
  public void testRepeatedSubstringPattern4() {
    String s = "a";
    boolean actual = solution.repeatedSubstringPattern(s);
    assertFalse(actual);
  }

  @Test
  public void testRepeatedSubstringPattern5() {
    String s = "ababba";
    boolean actual = solution.repeatedSubstringPattern(s);
    assertFalse(actual);
  }

  @Test
  public void testRepeatedSubstringPattern6() {
    String s = "bb";
    boolean actual = solution.repeatedSubstringPattern(s);
    assertTrue(actual);
  }

  @Test
  public void testRepeatedSubstringPattern7() {
    String s = "";
    boolean actual = solution.repeatedSubstringPattern(s);
    assertFalse(actual);
  }

  @Test
  public void testRepeatedSubstringPattern8() {
    String s = "ab";
    boolean actual = solution.repeatedSubstringPattern(s);
    assertFalse(actual);
  }

  @Test
  public void testRepeatedSubstringPattern9() {
    String s = "abacababacab";
    boolean actual = solution.repeatedSubstringPattern(s);
    assertTrue(actual);
  }
}