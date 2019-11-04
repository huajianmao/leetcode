package com.leetcode.snippets.a231poweroftwo;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsPowerOfTwo1() {
    int n = 1;
    boolean actual = solution.isPowerOfTwo(n);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsPowerOfTwo2() {
    int n = 16;
    boolean actual = solution.isPowerOfTwo(n);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsPowerOfTwo3() {
    int n = 218;
    boolean actual = solution.isPowerOfTwo(n);
    assertFalse(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsPowerOfTwo4() {
    int n = 0;
    boolean actual = solution.isPowerOfTwo(n);
    assertFalse(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsPowerOfTwo5() {
    int n = -2147483648;
    boolean actual = solution.isPowerOfTwo(n);
    assertFalse(actual);
  }
}
