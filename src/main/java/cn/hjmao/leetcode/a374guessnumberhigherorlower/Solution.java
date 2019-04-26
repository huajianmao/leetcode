package cn.hjmao.leetcode.a374guessnumberhigherorlower;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/guess-number-higher-or-lower/
 *
 * Desc:
 * =====
 * We are playing the Guess Game. The game is as follows:
 *
 * I pick a number from 1 to n. You have to guess which number I picked.
 *
 * Every time you guess wrong, I'll tell you whether the number is higher or lower.
 *
 * You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):
 *
 * -1 : My number is lower
 *  1 : My number is higher
 *  0 : Congrats! You got it!
 * Example :
 *
 * Input: n = 10, pick = 6
 * Output: 6
 */

public class Solution extends GuessGame {
  public int guessNumber(int n) {
    int low = 1;
    while (low <= n) {
      int pick = low + (n - low) / 2;
      int guess = guess(pick);
      if (guess == 0) {
        return pick;
      } else if (guess == 1) {
        low = pick + 1;
      } else {
        n = pick - 1;
      }
    }
    return low;
  }
}
