package com.leetcode.snippets.a819mostcommonword;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testMostCommonWord1() {
    String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
    String[] banned = {"hit"};
    String expect = "ball";
    String actual = solution.mostCommonWord(paragraph, banned);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testMostCommonWord2() {
    String paragraph = "a.";
    String[] banned = {};
    String expect = "a";
    String actual = solution.mostCommonWord(paragraph, banned);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testMostCommonWord3() {
    String paragraph = "Bob. hIt, baLl";
    String[] banned = {"bob", "hit"};
    String expect = "ball";
    String actual = solution.mostCommonWord(paragraph, banned);
    assertEquals(actual, expect);
  }
}
