package com.leetcode.snippets.a125validpalindrome;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsPalindrome1() {
    String s = "A man, a plan, a canal: Panama";
    boolean expect = true;
    boolean actual = solution.isPalindrome(s);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsPalindrome2() {
    String s = "race a car";
    boolean expect = false;
    boolean actual = solution.isPalindrome(s);
    assertEquals(actual, expect);
  }
}
