package cn.hjmao.leetcode.a994rottingoranges;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/rotting-oranges/
 *
 * Desc:
 * =====
 * In a given grid, each cell can have one of three values:
 *
 * the value 0 representing an empty cell;
 * the value 1 representing a fresh orange;
 * the value 2 representing a rotten orange.
 * Every minute, any fresh orange that is adjacent (4-directionally) to a rotten orange becomes rotten.
 *
 * Return the minimum number of minutes that must elapse until no cell has a fresh orange.
 * If this is impossible, return -1 instead.
 *
 *
 *
 * Example 1:
 * Input: [[2,1,1],[1,1,0],[0,1,1]]
 * Output: 4
 *
 * Example 2:
 * Input: [[2,1,1],[0,1,1],[1,0,1]]
 * Output: -1
 * Explanation:  The orange in the bottom left corner (row 2, column 0) is never rotten,
 * because rotting only happens 4-directionally.
 *
 * Example 3:
 * Input: [[0,2]]
 * Output: 0
 * Explanation:  Since there are already no fresh oranges at minute 0, the answer is just 0.
 *
 *
 * Note:
 * 1 <= grid.length <= 10
 * 1 <= grid[0].length <= 10
 * grid[i][j] is only 0, 1, or 2..
 */

class Solution {
  public int orangesRotting(int[][] grid) {
    List<Integer> rotten = new LinkedList<>();
    Set<Integer> fresh = new HashSet<>();
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == 2) {
          rotten.add(i * grid[0].length + j);
        } else if (grid[i][j] == 1) {
          fresh.add(i * grid[0].length + j);
        }
      }
    }

    int minutes = 0;
    while (rotten.size() > 0 && fresh.size() > 0) {
      int size = rotten.size();
      while (size-- > 0) {
        int index = rotten.remove(0);
        int x = index / grid[0].length;
        int y = index % grid[0].length;
        rotAround(x, y, grid, rotten, fresh);
        grid[x][y] = 0;
      }
      minutes++;
    }

    return fresh.size() > 0 ? -1 : minutes;
  }

  private void rotAround(int x, int y, int[][] grid, List<Integer> rotten, Set<Integer> fresh) {
    if (x - 1 >= 0 && grid[x - 1][y] == 1) {
      grid[x - 1][y] = 2;
      int index = (x - 1) * grid[0].length + y;
      fresh.remove(index);
      rotten.add(index);
    }
    if (x + 1 < grid.length && grid[x + 1][y] == 1) {
      grid[x + 1][y] = 2;
      int index = (x + 1) * grid[0].length + y;
      fresh.remove(index);
      rotten.add(index);
    }
    if (y - 1 >= 0 && grid[x][y - 1] == 1) {
      grid[x][y - 1] = 2;
      int index = x * grid[0].length + y - 1;
      fresh.remove(index);
      rotten.add(index);
    }
    if (y + 1 < grid[0].length && grid[x][y + 1] == 1) {
      grid[x][y + 1] = 2;
      int index = x * grid[0].length + y + 1;
      fresh.remove(index);
      rotten.add(index);
    }
  }
}
