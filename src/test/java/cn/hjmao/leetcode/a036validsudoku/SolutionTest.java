package cn.hjmao.leetcode.a036validsudoku;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by hjmao on 17-2-27.
 */
public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testIsValidSudoku1() throws Exception {
    char[][] board = {
        {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
    };
    boolean expected = true;
    boolean actual = this.solution.isValidSudoku(board);

    assertEquals(actual, expected);
  }

  @Test
  public void testIsValidSudoku2() throws Exception {
    char[][] board = {
        {'5', '3', '.', '.', '9', '.', '.', '.', '.'},
        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
    };
    boolean expected = false;
    boolean actual = this.solution.isValidSudoku(board);

    assertEquals(actual, expected);
  }
}