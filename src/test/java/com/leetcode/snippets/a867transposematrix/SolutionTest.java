package com.leetcode.snippets.a867transposematrix;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testTranspose1() {
    int[][] a = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    int[][] expect = {
        {1, 4, 7},
        {2, 5, 8},
        {3, 6, 9}
    };
    int[][] actual = solution.transpose(a);
    assertEquals(actual.length, expect.length);
    for (int i = 0; i < actual.length; i++) {
      assertEquals(actual[i], expect[i]);
    }
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testTranspose2() {
    int[][] a = {
        {1, 2, 3},
        {4, 5, 6}
    };
    int[][] expect = {
        {1, 4},
        {2, 5},
        {3, 6}
    };
    int[][] actual = solution.transpose(a);
    assertEquals(actual.length, expect.length);
    for (int i = 0; i < actual.length; i++) {
      assertEquals(actual[i], expect[i]);
    }
  }
}
