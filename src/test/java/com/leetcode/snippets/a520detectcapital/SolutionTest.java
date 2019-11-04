package com.leetcode.snippets.a520detectcapital;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testDetectCapitalUse1() {
    String word = "USA";
    boolean actual = solution.detectCapitalUse(word);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testDetectCapitalUse2() {
    String word = "FlaG";
    boolean actual = solution.detectCapitalUse(word);
    assertFalse(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testDetectCapitalUse3() {
    String word = "leetcode";
    boolean actual = solution.detectCapitalUse(word);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testDetectCapitalUse4() {
    String word = "l";
    boolean actual = solution.detectCapitalUse(word);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testDetectCapitalUse5() {
    String word = "G";
    boolean actual = solution.detectCapitalUse(word);
    assertTrue(actual);
  }
}
