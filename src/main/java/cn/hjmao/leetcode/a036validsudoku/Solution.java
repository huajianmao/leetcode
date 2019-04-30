package cn.hjmao.leetcode.a036validsudoku;

import java.util.HashSet;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/valid-sudoku
 *
 * Desc:
 * =====
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 * [Sudoku board](http://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Sudoku-by-L2G-20050714.svg/250px-Sudoku-by-L2G-20050714.svg.png)
 *
 * Note:
 * A valid Sudoku board (partially filled) is not necessarily solvable.
 * Only the filled cells need to be validated.
 */

public class Solution {

  /**
   * From: https://discuss.leetcode.com/topic/9748/shared-my-concise-java-code/2
   *
   * Just trying to explain how to think about `%` and `/`.
   * These two operators can be helpful for matrix traversal problems.
   *
   * For a block traversal, it goes the following way.
   * 0,0, 0,1, 0,2; < --- 3 Horizontal Steps followed by 1 Vertical step to next level.
   * 1,0, 1,1, 1,2; < --- 3 Horizontal Steps followed by 1 Vertical step to next level.
   * 2,0, 2,1, 2,2; < --- 3 Horizontal Steps.
   *
   * And so on...
   * But, the j iterates from 0 to 9.
   *
   * But we need to stop after 3 horizontal steps, and go down 1 step vertical.
   * Use `%` for horizontal traversal.
   * Because `%` increments by 1 for each j : 0%3 = 0 , 1%3 = 1, 2%3 = 2, and resets back.
   *
   * So this covers horizontal traversal for each block by 3 steps.
   *
   * Use / for vertical traversal.
   * Because / increments by 1 after every 3 j: 0/3 = 0; 1/3 = 0; 2/3 =0; 3/3 = 1.
   *
   * So far, for a given block, you can traverse the whole block using just j.
   *
   * But because j is just 0 to 9, it will stay only first block.
   * But to increment block, use i.
   *
   * To move horizontally to next block, use % again : ColIndex = 3 * i%3
   * (Multiply by 3 so that the next block is after 3 columns.
   * Ie 0,0 is start of first block, second block is 0,3 (not 0,1));
   *
   * Similarly, to move to next block vertically, use / and multiply by 3 as explained above.
   *
   * Hope this helps.
   */
  public boolean isValidSudoku(char[][] board) {
    for (int i = 0; i < 9; i++) {
      HashSet<Character> rows = new HashSet<>();
      HashSet<Character> columns = new HashSet<>();
      HashSet<Character> cube = new HashSet<>();
      for (int j = 0; j < 9; j++) {
        if (board[i][j] != '.' && !rows.add(board[i][j])) {
          return false;
        }
        if (board[j][i] != '.' && !columns.add(board[j][i])) {
          return false;
        }
        int rowIndex = 3 * (i / 3);
        int colIndex = 3 * (i % 3);
        if (board[rowIndex + j / 3][colIndex + j % 3] != '.'
            && !cube.add(board[rowIndex + j / 3][colIndex + j % 3])) {
          return false;
        }
      }
    }
    return true;
  }

  private boolean validToPut(int[] numbers, char digit) {
    int index = digit - '1';
    if (index >= 0 && index <= 8) {
      if (numbers[index] != 0) {
        return false;
      } else {
        numbers[index] = 1;
      }
    }
    return true;
  }

  private boolean checkSquare(char[][] board, int x, int y) {
    int[] numbers = new int[9];
    int startX = 3 * x;
    int startY = 3 * y;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (!validToPut(numbers, board[startX + i][startY + j])) {
          return false;
        }
      }
    }
    return true;
  }

  private boolean checkRow(char[][] board, int x) {
    int[] numbers = new int[9];
    for (int j = 0; j < 9; j++) {
      if (!validToPut(numbers, board[x][j])) {
        return false;
      }
    }
    return true;
  }

  private boolean checkColumn(char[][] board, int y) {
    int[] numbers = new int[9];
    for (int i = 0; i < 9; i++) {
      if (!validToPut(numbers, board[i][y])) {
        return false;
      }
    }
    return true;
  }

  public boolean isValidSudokuUgly(char[][] board) {
    for (int i = 0; i < 9; i++) {
      if (!checkRow(board, i)) {
        return false;
      }
      if (!checkColumn(board, i)) {
        return false;
      }
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (!checkSquare(board, i, j)) {
          return false;
        }
      }
    }

    return true;
  }
}
