package com.leetcode.snippets.a551studentattendancerecordi;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCheckRecord1() {
    String s = "PPALLP";
    boolean actual = solution.checkRecord(s);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCheckRecord2() {
    String s = "PPALLL";
    boolean actual = solution.checkRecord(s);
    assertFalse(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCheckRecord3() {
    String s = "PPALLLL";
    boolean actual = solution.checkRecord(s);
    assertFalse(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCheckRecord4() {
    String s = "PPAALLPLL";
    boolean actual = solution.checkRecord(s);
    assertFalse(actual);
  }
}
