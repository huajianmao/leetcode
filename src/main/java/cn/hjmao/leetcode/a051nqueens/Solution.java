package cn.hjmao.leetcode.a051nqueens;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/n-queens/
 *
 * Desc:
 * =====
 * The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.
 *
 *
 *
 * Given an integer n, return all distinct solutions to the n-queens puzzle.
 *
 * Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.
 *
 * Example:
 *
 * Input: 4
 * Output: [
 *  [".Q..",  // Solution 1
 *   "...Q",
 *   "Q...",
 *   "..Q."],
 *
 *  ["..Q.",  // Solution 2
 *   "Q...",
 *   "...Q",
 *   ".Q.."]
 * ]
 * Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above.
 */

public class Solution {

  public List<List<String>> solveNQueens(int n) {
    List<List<Integer>> queens = new ArrayList<>();
    List<Integer> startQueens = new ArrayList<>();
    List<Integer> xyDiff = new ArrayList<>();
    List<Integer> xySum = new ArrayList<>();

    helper(n, queens, startQueens, xyDiff, xySum);

    List<List<String>> result = new ArrayList<>();
    for (List<Integer> thisQueens: queens) {
      List<String> board = new ArrayList<>();
      for (int i: thisQueens) {
        StringBuilder thisLine = new StringBuilder();
        for (int j = 0; j < i; j++) {
          thisLine.append('.');
        }
        thisLine.append('Q');
        for (int j = i + 1; j < n; j++) {
          thisLine.append('.');
        }
        board.add(thisLine.toString());
      }
      result.add(board);
    }

    return result;
  }

  private void helper(int n, List<List<Integer>> queens, List<Integer> thisQueens, List<Integer> xyDiff, List<Integer> xySum) {
    int p = thisQueens.size();
    if (p == n) {
      queens.add(thisQueens);
      return;
    }

    for (int q = 0; q < n; q++) {
      if (!thisQueens.contains(q) && !xySum.contains(p + q) && !xyDiff.contains(p - q)) {
        List<Integer> newQueens = new ArrayList<>();
        List<Integer> newXYDiff = new ArrayList<>();
        List<Integer> newXYSum = new ArrayList<>();
        newQueens.addAll(thisQueens);
        newQueens.add(q);
        newXYDiff.addAll(xyDiff);
        newXYDiff.add(p - q);
        newXYSum.addAll(xySum);
        newXYSum.add(p + q);
        helper(n, queens, newQueens, newXYDiff, newXYSum);
      }
    }
  }
}
