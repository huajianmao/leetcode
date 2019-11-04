package com.leetcode.snippets.a557reversewordsinastringiii;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testReverseWords1() {
    String s = "Let's take LeetCode contest";
    String expect = "s'teL ekat edoCteeL tsetnoc";
    String actual = solution.reverseWords(s);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testReverseWords2() {
    String s = "";
    String expect = "";
    String actual = solution.reverseWords(s);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testReverseWords3() {
    String s = "a";
    String expect = "a";
    String actual = solution.reverseWords(s);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testReverseWords4() {
    String s = "ba";
    String expect = "ab";
    String actual = solution.reverseWords(s);
    assertEquals(actual, expect);
  }
}
