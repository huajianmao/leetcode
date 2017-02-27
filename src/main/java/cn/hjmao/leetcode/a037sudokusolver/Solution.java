package cn.hjmao.leetcode.a037sudokusolver;

import java.util.*;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/sudoku-solver/
 *
 * Desc:
 * =====
 * Write a program to solve a Sudoku puzzle by filling the empty cells.
 * Empty cells are indicated by the character '.'.
 *
 * You may assume that there will be only one unique solution.
 */

public class Solution {
  private void modify(char[][] board, int i, int j, int x, int y,
                      Map<Integer, Set<Character>> unsolvedCandidates,
                      Stack<Integer> oneCandidate) {
    int sameRowKey = x * 10 + y;
    if (unsolvedCandidates.containsKey(sameRowKey)) {
      Set<Character> sameRowUnSolvedCandidates = unsolvedCandidates.get(sameRowKey);
      sameRowUnSolvedCandidates.remove(board[i][j]);
      if (sameRowUnSolvedCandidates.size() == 1) {
        oneCandidate.push(sameRowKey);
        board[x][y] = sameRowUnSolvedCandidates.iterator().next();
        unsolvedCandidates.remove(sameRowKey);
      } else {
        unsolvedCandidates.put(sameRowKey, sameRowUnSolvedCandidates);
      }
    }
  }

  public void solveSudoku(char[][] board) {
    Map<Integer, Set<Character>> unsolvedCandidates = new HashMap<>();
    Stack<Integer> oneCandidate = new Stack<>();

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        if (board[i][j] == '.') {
          Set<Character> whole = new HashSet<>(Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9'));
          unsolvedCandidates.put(i * 10 + j, whole);
        } else {
          oneCandidate.add(i * 10 + j);
        }
      }
    }

    while (!oneCandidate.isEmpty()) {
      Integer thisOne = oneCandidate.pop();
      int i = thisOne / 10;
      int j = thisOne % 10;
      for (int x = 0; x < 9; x++) {
        modify(board, i, j, i, x, unsolvedCandidates, oneCandidate);
        modify(board, i, j, x, j, unsolvedCandidates, oneCandidate);
        modify(board, i, j, i / 3 * 3 + x / 3, j / 3 * 3 + x % 3, unsolvedCandidates, oneCandidate);
      }
    }
  }
}