package com.leetcode.snippets.a804uniquemorsecodewords;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testUniqueMorseRepresentations1() {
    String[] words = {"gin", "zen", "gig", "msg"};
    int expect = 2;
    int actual = solution.uniqueMorseRepresentations(words);
    assertEquals(actual, expect);
  }
}
