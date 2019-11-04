package com.leetcode.snippets.a014longestcommonprefix;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by hjmao on 17-2-9.
 */
public class SolutionTest {
  private Solution solution;

  @BeforeMethod
  public void setUp() throws Exception {
    this.solution = new Solution();
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testLongestCommonPrefix1() throws Exception {
    String[] strs = {"helloWorld", ""};
    String expected = "";

    assertEquals(this.solution.longestCommonPrefix(strs), expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testLongestCommonPrefix2() throws Exception {
    String[] strs = {"", ""};
    String expected = "";

    assertEquals(this.solution.longestCommonPrefix(strs), expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testLongestCommonPrefix3() throws Exception {
    String[] strs = {""};
    String expected = "";

    assertEquals(this.solution.longestCommonPrefix(strs), expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testLongestCommonPrefix4() throws Exception {
    String[] strs = {"helloWorld"};
    String expected = "helloWorld";

    assertEquals(this.solution.longestCommonPrefix(strs), expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testLongestCommonPrefix5() throws Exception {
    String[] strs = {"helloWorld", "HelloX"};
    String expected = "";

    assertEquals(this.solution.longestCommonPrefix(strs), expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testLongestCommonPrefix6() throws Exception {
    String[] strs = {"hel", "helloX", "heLLoX"};
    String expected = "he";

    assertEquals(this.solution.longestCommonPrefix(strs), expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testLongestCommonPrefix7() throws Exception {
    String[] strs = {"hello", "hello"};
    String expected = "hello";

    assertEquals(this.solution.longestCommonPrefix(strs), expected);
  }
}
