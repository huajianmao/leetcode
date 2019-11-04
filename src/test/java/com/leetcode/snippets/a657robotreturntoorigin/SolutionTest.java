package com.leetcode.snippets.a657robotreturntoorigin;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testJudgeCircle1() {
    String moves = "UD";
    boolean actual = solution.judgeCircle(moves);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testJudgeCircle2() {
    String moves = "LL";
    boolean actual = solution.judgeCircle(moves);
    assertFalse(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testJudgeCircle3() {
    String moves = "LR";
    boolean actual = solution.judgeCircle(moves);
    assertTrue(actual);
  }
}
