package cn.hjmao.leetcode.a037sudokusolver;

import java.util.Arrays;

/**
 * Created by hjmao.
 * <p>
 * URL:
 * =====
 * https://leetcode.com/problems/sudoku-solver/
 * <p>
 * Desc:
 * =====
 * Write a program to solve a Sudoku puzzle by filling the empty cells.
 * Empty cells are indicated by the character '.'.
 * <p>
 * You may assume that there will be only one unique solution.
 */

public class Solution {
  public void solveSudoku(char[][] board) {
    dfs(board, 0);
  }

  private boolean dfs(char[][] board, int d) {
    if (d == 81) {
      return true;
    }
    int i = d / 9;
    int j = d % 9;
    if (board[i][j] != '.') {
      return dfs(board, d + 1);
    }

    boolean[] flag = new boolean[9];
    validate(board, i, j, flag);
    for (int k = 0; k < 9; k++) {
      if (flag[k]) {
        board[i][j] = (char) ('1' + k);
        if (dfs(board, d + 1)) {
          return true;
        }
      }
    }
    board[i][j] = '.';
    return false;
  }

  private void validate(char[][] board, int i, int j, boolean[] flag) {
    Arrays.fill(flag, true);
    for (int k = 0; k < 9; k++) {
      if (board[i][k] != '.') {
        flag[board[i][k] - '1'] = false;
      }
      if (board[k][j] != '.') {
        flag[board[k][j] - '1'] = false;
      }
      char c = board[i / 3 * 3 + k / 3][j / 3 * 3 + k % 3];
      if (c != '.') {
        flag[c - '1'] = false;
      }
    }
  }
}