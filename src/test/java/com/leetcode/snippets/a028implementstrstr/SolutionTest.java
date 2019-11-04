package com.leetcode.snippets.a028implementstrstr;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by hjmao on 17-2-21.
 */
public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testStrStr() throws Exception {
    String haystack = "helloworld";
    String needle = "world";
    int expected = 5;

    assertEquals(this.solution.strStr(haystack, needle), expected);
  }
}
