package com.leetcode.snippets.a1033movingstonesuntilconsecutive;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testNumMovesStones1() {
    int a = 1;
    int b = 2;
    int c = 5;
    int[] expect = {1, 2};
    int[] actual = solution.numMovesStones(a, b, c);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testNumMovesStones2() {
    int a = 4;
    int b = 3;
    int c = 2;
    int[] expect = {0, 0};
    int[] actual = solution.numMovesStones(a, b, c);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testNumMovesStones3() {
    int a = 3;
    int b = 5;
    int c = 1;
    int[] expect = {1, 2};
    int[] actual = solution.numMovesStones(a, b, c);
    assertEquals(actual, expect);
  }
}
