package com.leetcode.snippets.a242validanagram;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsAnagram1() {
    String s = "anagram";
    String t = "nagaram";
    boolean actual = solution.isAnagram(s, t);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsAnagram2() {
    String s = "rat";
    String t = "car";
    boolean actual = solution.isAnagram(s, t);
    assertFalse(actual);
  }
}
