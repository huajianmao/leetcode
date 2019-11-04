package com.leetcode.snippets.a925longpressedname;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsLongPressedName1() {
    String name = "alex";
    String typed = "aaleex";
    boolean actual = solution.isLongPressedName(name, typed);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsLongPressedName2() {
    String name = "saeed";
    String typed = "ssaaedd";
    boolean actual = solution.isLongPressedName(name, typed);
    assertFalse(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsLongPressedName3() {
    String name = "leelee";
    String typed = "lleeelee";
    boolean actual = solution.isLongPressedName(name, typed);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsLongPressedName4() {
    String name = "laiden";
    String typed = "laiden";
    boolean actual = solution.isLongPressedName(name, typed);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsLongPressedName5() {
    String name = "";
    String typed = "";
    boolean actual = solution.isLongPressedName(name, typed);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsLongPressedName6() {
    String name = "";
    String typed = "a";
    boolean actual = solution.isLongPressedName(name, typed);
    assertFalse(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsLongPressedName7() {
    String name = "a";
    String typed = "";
    boolean actual = solution.isLongPressedName(name, typed);
    assertFalse(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsLongPressedName8() {
    String name = "a";
    String typed = "aaaaab";
    boolean actual = solution.isLongPressedName(name, typed);
    assertFalse(actual);
  }
}
