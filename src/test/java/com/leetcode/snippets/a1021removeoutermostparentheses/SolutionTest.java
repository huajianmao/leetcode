package com.leetcode.snippets.a1021removeoutermostparentheses;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testRemoveOuterParentheses1() {
    String s = "(()())(())";
    String expect = "()()()";
    String actual = solution.removeOuterParentheses(s);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testRemoveOuterParentheses2() {
    String s = "(()())(())(()(()))";
    String expect = "()()()()(())";
    String actual = solution.removeOuterParentheses(s);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testRemoveOuterParentheses3() {
    String s = "()()";
    String expect = "";
    String actual = solution.removeOuterParentheses(s);
    assertEquals(actual, expect);
  }
}
