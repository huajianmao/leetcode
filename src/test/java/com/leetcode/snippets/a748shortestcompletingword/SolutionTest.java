package com.leetcode.snippets.a748shortestcompletingword;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testShortestCompletingWord1() {
    String licensePlate = "1s3 PSt";
    String[] words = {"step", "steps", "stripe", "stepple"};
    String expect = "steps";
    String actual = solution.shortestCompletingWord(licensePlate, words);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testShortestCompletingWord2() {
    String licensePlate = "1s3 456";
    String[] words = {"looks", "pest", "stew", "show"};
    String expect = "pest";
    String actual = solution.shortestCompletingWord(licensePlate, words);
    assertEquals(actual, expect);
  }
}
