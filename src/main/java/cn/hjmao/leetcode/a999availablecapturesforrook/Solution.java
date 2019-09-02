package cn.hjmao.leetcode.a999availablecapturesforrook;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/available-captures-for-rook/
 *
 * Desc:
 * =====
 * On an 8 x 8 chessboard, there is one white rook.
 * There also may be empty squares, white bishops, and black pawns.
 * These are given as characters 'R', '.', 'B', and 'p' respectively.
 * Uppercase characters represent white pieces, and lowercase characters represent black pieces.
 *
 * The rook moves as in the rules of Chess:
 * it chooses one of four cardinal directions (north, east, west, and south),
 * then moves in that direction until it chooses to stop,
 * reaches the edge of the board, or captures an opposite colored pawn by moving to the same square it occupies.
 * Also, rooks cannot move into the same square as other friendly bishops.
 *
 * Return the number of pawns the rook can capture in one move.
 *
 *
 *
 * Example 1:
 * Input: [
 * [".",".",".",".",".",".",".","."],
 * [".",".",".","p",".",".",".","."],
 * [".",".",".","R",".",".",".","p"],
 * [".",".",".",".",".",".",".","."],
 * [".",".",".",".",".",".",".","."],
 * [".",".",".","p",".",".",".","."],
 * [".",".",".",".",".",".",".","."],
 * [".",".",".",".",".",".",".","."]]
 * Output: 3
 * Explanation:
 * In this example the rook is able to capture all the pawns.
 *
 * Example 2:
 * Input: [
 * [".",".",".",".",".",".",".","."],
 * [".","p","p","p","p","p",".","."],
 * [".","p","p","B","p","p",".","."],
 * [".","p","B","R","B","p",".","."],
 * [".","p","p","B","p","p",".","."],
 * [".","p","p","p","p","p",".","."],
 * [".",".",".",".",".",".",".","."],
 * [".",".",".",".",".",".",".","."]]
 * Output: 0
 * Explanation:
 * Bishops are blocking the rook to capture any pawn.
 *
 * Example 3:
 * Input: [
 * [".",".",".",".",".",".",".","."],
 * [".",".",".","p",".",".",".","."],
 * [".",".",".","p",".",".",".","."],
 * ["p","p",".","R",".","p","B","."],
 * [".",".",".",".",".",".",".","."],
 * [".",".",".","B",".",".",".","."],
 * [".",".",".","p",".",".",".","."],
 * [".",".",".",".",".",".",".","."]]
 * Output: 3
 * Explanation:
 * The rook can capture the pawns at positions b5, d6 and f5.
 *
 *
 * Note:
 * board.length == board[i].length == 8
 * board[i][j] is either 'R', '.', 'B', or 'p'
 * There is exactly one cell with board[i][j] == 'R''
 */

class Solution {
  public int numRookCaptures(char[][] board) {
    int i = 0;
    int j = 0;
    boolean found = false;
    while (i < board.length && !found) {
      for (j = 0; j < board[0].length; j++) {
        if (board[i][j] == 'R') {
          found = true;
          break;
        }
      }
      if (!found) {
        i++;
      }
    }

    int result = 0;
    int k = i - 1;
    while (k >= 0 && board[k][j] == '.') {
      k--;
    }
    if (k >= 0 && board[k][j] == 'p') {
      result++;
    }

    k = i + 1;
    while (k < board.length && board[k][j] == '.') {
      k++;
    }
    if (k < board.length && board[k][j] == 'p') {
      result++;
    }

    k = j - 1;
    while (k >= 0 && board[i][k] == '.') {
      k--;
    }
    if (k >= 0 && board[i][k] == 'p') {
      result++;
    }

    k = j + 1;
    while (k < board[0].length && board[i][k] == '.') {
      k++;
    }
    if (k < board[0].length && board[i][k] == 'p') {
      result++;
    }

    return result;
  }
}
