package cn.hjmao.leetcode.a999availablecapturesforrook;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testNumRookCaptures1() {
    char[][] board = {
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', 'p', '.', '.', '.', '.'},
        {'.', '.', '.', 'R', '.', '.', '.', 'p'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', 'p', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'}
    };
    int expect = 3;
    int actual = solution.numRookCaptures(board);
    assertEquals(actual, expect);
  }

  @Test
  public void testNumRookCaptures2() {
    char[][] board = {
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'},
        {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'},
        {'.', 'p', 'B', 'R', 'B', 'p', '.', '.'},
        {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'},
        {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'}
    };
    int expect = 0;
    int actual = solution.numRookCaptures(board);
    assertEquals(actual, expect);
  }

  @Test
  public void testNumRookCaptures3() {
    char[][] board = {
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', 'p', '.', '.', '.', '.'},
        {'.', '.', '.', 'p', '.', '.', '.', '.'},
        {'p', 'p', '.', 'R', '.', 'p', 'B', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', 'B', '.', '.', '.', '.'},
        {'.', '.', '.', 'p', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'}
    };
    int expect = 3;
    int actual = solution.numRookCaptures(board);
    assertEquals(actual, expect);
  }

  @Test
  public void testNumRookCaptures4() {
    char[][] board = {
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', 'R', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'}
    };
    int expect = 0;
    int actual = solution.numRookCaptures(board);
    assertEquals(actual, expect);
  }
}
