package cn.hjmao.leetcode.a680validpalindromeii;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testValidPalindrome1() {
    String s = "aba";
    boolean actual = solution.validPalindrome(s);
    assertTrue(actual);
  }

  @Test
  public void testValidPalindrome2() {
    String s = "abca";
    boolean actual = solution.validPalindrome(s);
    assertTrue(actual);
  }

  @Test
  public void testValidPalindrome3() {
    String s = "abcd";
    boolean actual = solution.validPalindrome(s);
    assertFalse(actual);
  }

  @Test
  public void testValidPalindrome4() {
    String s = "a";
    boolean actual = solution.validPalindrome(s);
    assertTrue(actual);
  }

  @Test
  public void testValidPalindrome5() {
    String s = "ab";
    boolean actual = solution.validPalindrome(s);
    assertTrue(actual);
  }

  @Test
  public void testValidPalindrome6() {
    String s = "aa";
    boolean actual = solution.validPalindrome(s);
    assertTrue(actual);
  }
}