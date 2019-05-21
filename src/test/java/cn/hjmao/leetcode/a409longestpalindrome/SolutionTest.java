package cn.hjmao.leetcode.a409longestpalindrome;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testLongestPalindrome1() {
    String s = "abccccdd";
    int expect = 7;
    int actual = solution.longestPalindrome(s);
    assertEquals(actual, expect);
  }

  @Test
  public void testLongestPalindrome2() {
    String s = "";
    int expect = 0;
    int actual = solution.longestPalindrome(s);
    assertEquals(actual, expect);
  }

  @Test
  public void testLongestPalindrome3() {
    String s = "AAAAAA";
    int expect = 6;
    int actual = solution.longestPalindrome(s);
    assertEquals(actual, expect);
  }

  @Test
  public void testLongestPalindrome4() {
    String s = "zeusnilemacaronimaisanitratetartinasiaminoracamelinsuez";
    int expect = 55;
    int actual = solution.longestPalindrome(s);
    assertEquals(actual, expect);
  }
}
