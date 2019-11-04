package com.leetcode.snippets.a344reversestring;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testReverseString1() {
    char[] s = {'h', 'e', 'l', 'l', 'o'};
    char[] expect = {'o', 'l', 'l', 'e', 'h'};
    solution.reverseString(s);
    assertEquals(s, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testReverseString2() {
    char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
    char[] expect = {'h', 'a', 'n', 'n', 'a', 'H'};
    solution.reverseString(s);
    assertEquals(s, expect);
  }
}
