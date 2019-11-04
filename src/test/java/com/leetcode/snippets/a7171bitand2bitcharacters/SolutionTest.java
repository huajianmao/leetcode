package com.leetcode.snippets.a7171bitand2bitcharacters;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsOneBitCharacter0() {
    int[] bits = {0};
    boolean actual = solution.isOneBitCharacter(bits);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsOneBitCharacter1() {
    int[] bits = {1, 0, 0};
    boolean actual = solution.isOneBitCharacter(bits);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsOneBitCharacter2() {
    int[] bits = {1, 1, 1, 0};
    boolean actual = solution.isOneBitCharacter(bits);
    assertFalse(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsOneBitCharacter3() {
    int[] bits = {1, 1, 1, 1, 0};
    boolean actual = solution.isOneBitCharacter(bits);
    assertTrue(actual);
  }
}
