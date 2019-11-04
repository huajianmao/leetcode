package com.leetcode.snippets.a500keyboardrow;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFindWords1() {
    String[] words = {"Hello", "Alaska", "Dad", "Peace"};
    String[] expect = {"Alaska", "Dad"};
    String[] actual = solution.findWords(words);
    assertEquals(actual, expect);
  }
}
