package com.leetcode.snippets.a541reversestringii;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testReverseStr1() {
    String s = "abcdefg";
    int k = 2;
    String expect = "bacdfeg";
    String actual = solution.reverseStr(s, k);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testReverseStr2() {
    String s = "";
    int k = 2;
    String expect = "";
    String actual = solution.reverseStr(s, k);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testReverseStr3() {
    String s = "a";
    int k = 2;
    String expect = "a";
    String actual = solution.reverseStr(s, k);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testReverseStr4() {
    String s = "ab";
    int k = 2;
    String expect = "ba";
    String actual = solution.reverseStr(s, k);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testReverseStr5() {
    String s = "abc";
    int k = 2;
    String expect = "bac";
    String actual = solution.reverseStr(s, k);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testReverseStr6() {
    String s = "abcd";
    int k = 2;
    String expect = "bacd";
    String actual = solution.reverseStr(s, k);
    assertEquals(actual, expect);
  }
}
