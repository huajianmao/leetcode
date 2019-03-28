package cn.hjmao.leetcode.a125validpalindrome;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void testIsPalindrome1() {
    String s = "A man, a plan, a canal: Panama";
    boolean expect = true;
    boolean actual = solution.isPalindrome(s);
    assertEquals(actual, expect);
  }

  @Test
  public void testIsPalindrome2() {
    String s = "race a car";
    boolean expect = false;
    boolean actual = solution.isPalindrome(s);
    assertEquals(actual, expect);
  }
}