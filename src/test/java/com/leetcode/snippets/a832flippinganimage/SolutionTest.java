package com.leetcode.snippets.a832flippinganimage;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFlipAndInvertImage1() {
    int[][] a = {
        {1, 1, 0},
        {1, 0, 1},
        {0, 0, 0}
    };
    int[][] expect = {
        {1, 0, 0},
        {0, 1, 0},
        {1, 1, 1}
    };
    int[][] actual = solution.flipAndInvertImage(a);
    assertEquals(actual.length, expect.length);
    for (int i = 0; i < actual.length; i++) {
      assertEquals(actual[i], expect[i]);
    }
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFlipAndInvertImage2() {
    int[][] a = {
        {1, 1, 0, 0},
        {1, 0, 0, 1},
        {0, 1, 1, 1},
        {1, 0, 1, 0}
    };
    int[][] expect = {
        {1, 1, 0, 0},
        {0, 1, 1, 0},
        {0, 0, 0, 1},
        {1, 0, 1, 0}
    };
    int[][] actual = solution.flipAndInvertImage(a);
    assertEquals(actual.length, expect.length);
    for (int i = 0; i < actual.length; i++) {
      assertEquals(actual[i], expect[i]);
    }
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFlipAndInvertImage3() {
    int[][] a = {
        {1}
    };
    int[][] expect = {
        {0}
    };
    int[][] actual = solution.flipAndInvertImage(a);
    assertEquals(actual.length, expect.length);
    for (int i = 0; i < actual.length; i++) {
      assertEquals(actual[i], expect[i]);
    }
  }
}
