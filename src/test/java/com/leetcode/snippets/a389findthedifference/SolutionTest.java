package com.leetcode.snippets.a389findthedifference;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFindTheDifference() {
    String s = "abcd";
    String t = "abcde";
    char expect = 'e';
    char actual = solution.findTheDifference(s, t);
    assertEquals(actual, expect);
  }
}
