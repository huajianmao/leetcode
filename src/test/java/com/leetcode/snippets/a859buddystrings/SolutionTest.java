package com.leetcode.snippets.a859buddystrings;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testBuddyStrings1() {
    String a = "ab";
    String b = "ba";
    boolean actual = solution.buddyStrings(a, b);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testBuddyStrings2() {
    String a = "ab";
    String b = "ab";
    boolean actual = solution.buddyStrings(a, b);
    assertFalse(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testBuddyStrings3() {
    String a = "aa";
    String b = "aa";
    boolean actual = solution.buddyStrings(a, b);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testBuddyStrings4() {
    String a = "aaaaaaabc";
    String b = "aaaaaaacb";
    boolean actual = solution.buddyStrings(a, b);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testBuddyStrings5() {
    String a = "";
    String b = "aa";
    boolean actual = solution.buddyStrings(a, b);
    assertFalse(actual);
  }
}
