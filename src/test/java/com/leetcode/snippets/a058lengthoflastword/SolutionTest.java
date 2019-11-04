package com.leetcode.snippets.a058lengthoflastword;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testLengthOfLastWord1() {
    String s = "Hello World";
    int expected = 5;
    int actual = solution.lengthOfLastWord(s);

    assertEquals(actual, expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testLengthOfLastWordWithBlankString() {
    String s = "";
    int expected = 0;
    int actual = solution.lengthOfLastWord(s);

    assertEquals(actual, expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testLengthOfLastWordWithSpaceString() {
    String s = " ";
    int expected = 0;
    int actual = solution.lengthOfLastWord(s);

    assertEquals(actual, expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testLengthOfLastWordWithTwoSpacesString() {
    String s = " ";
    int expected = 0;
    int actual = solution.lengthOfLastWord(s);

    assertEquals(actual, expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testLengthOfLastWordWithLastSpaceString() {
    String s = "Hello ";
    int expected = 5;
    int actual = solution.lengthOfLastWord(s);

    assertEquals(actual, expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testLengthOfLastWordWithAString() {
    String s = "a ";
    int expected = 1;
    int actual = solution.lengthOfLastWord(s);

    assertEquals(actual, expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testLengthOfLastWordWithBlankPrefixString() {
    String s = " a";
    int expected = 1;
    int actual = solution.lengthOfLastWord(s);

    assertEquals(actual, expected);
  }
}
