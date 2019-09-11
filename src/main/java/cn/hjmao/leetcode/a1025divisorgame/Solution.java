package cn.hjmao.leetcode.a1025divisorgame;

import java.util.Set;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/divisor-game/
 *
 * Desc:
 * =====
 * Alice and Bob take turns playing a game, with Alice starting first.
 *
 * Initially, there is a number N on the chalkboard.
 *
 * On each player's turn, that player makes a move consisting of:
 * Choosing any x with 0 < x < N and N % x == 0.
 * Replacing the number N on the chalkboard with N - x.
 * Also, if a player cannot make a move, they lose the game.
 *
 * Return True if and only if Alice wins the game, assuming both players play optimally.
 *
 *
 *
 * Example 1:
 * Input: 2
 * Output: true
 * Explanation: Alice chooses 1, and Bob has no more moves.
 *
 * Example 2:
 * Input: 3
 * Output: false
 * Explanation: Alice chooses 1, Bob chooses 1, and Alice has no more moves.
 *
 *
 * Note:
 * 1 <= N <= 10000
 */

class Solution {
  public boolean divisorGame(int n) {
    return n % 2 == 0;
  }
}
