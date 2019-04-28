package cn.hjmao.leetcode.a401binarywatch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/binary-watch/
 *
 * Desc:
 * =====
 * A binary watch has 4 LEDs on the top which represent the hours (0-11),
 * and the 6 LEDs on the bottom represent the minutes (0-59).
 *
 * Each LED represents a zero or one, with the least significant bit on the right.
 *
 *
 * For example, the above binary watch reads "3:25".
 *
 * Given a non-negative integer n which represents the number of LEDs that are currently on,
 * return all possible times the watch could represent.
 *
 * Example:
 *
 * Input: n = 1
 * Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
 * Note:
 * - The order of output does not matter.
 * - The hour must not contain a leading zero, for example "01:00" is not valid, it should be "1:00".
 * - The minute must be consist of two digits and may contain a leading zero,
 *   for example "10:2" is not valid, it should be "10:02".
 */

public class Solution {

  public List<String> readBinaryWatch(int num) {
    List<String> res = new ArrayList<>();
    dfs(0, 0, num, 0, res);
    return res;
  }

  private void dfs(int time, int pos, int num, int index, List<String> res) {
    if (pos == num) {
      handle(time, res);
      return;
    }
    for (int i = index; i < 10; i++) {
      if ((time & 1 << i) == 0) {
        dfs(time | 1 << i, pos + 1, num, i, res);
      }
    }
  }

  private void handle(int time, List<String> res) {
    final int hour = time >> 6;
    if (hour > 11) {
      return;
    }
    final int minute = time & 960 ^ time;
    if (minute > 59) {
      return;
    }
    res.add(hour + ":" + (minute > 9 ? minute : "0" + minute));
  }
  
  public List<String> readBinaryWatch2(int num) {
    List<String> times = new ArrayList<>();
    for (int hour = 0; hour < 12; hour++) {
      int hourBits = Integer.bitCount(hour);
      if (hourBits > num) {
        continue;
      }
      for (int min = 0; min < 60; min++) {
        if (Integer.bitCount(min) == num - hourBits) {
          times.add(String.format("%d:%02d", hour, min));
        }
      }
    }
    return times;
  }

  public List<String> readBinaryWatch1(int num) {
    List<String> times = new ArrayList<>();
    if (num < 10) {
      int maxhNum = Math.min(num, 4);
      for (int hNum = 0; hNum <= maxhNum; hNum++) {
        int mNum = num - hNum;
        int[] hours = getAllCases(hNum, 4);
        int[] mins = getAllCases(mNum, 6);
        for (int hour : hours) {
          for (int min : mins) {
            times.add(String.format("%d:%02d", hour, min));
          }
        }
      }
    }
    return times;
  }

  private int[] getAllCases(int n, int all) {
    if (n == 0) {
      return new int[1];
    }
    int[][] hours = {{0}, {1, 2, 4, 8}, {3, 5, 6, 9, 10}, {7, 11}};
    int[][] mins = {
        {0},
        {1, 2, 4, 8, 16, 32},
        {3, 5, 6, 9, 10, 12, 17, 18, 20, 24, 33, 34, 36, 40, 48},
        {7, 11, 13, 14, 19, 21, 22, 25, 26, 28, 35, 37, 38, 41, 42, 44, 49, 50, 52, 56},
        {15, 23, 27, 29, 30, 39, 43, 45, 46, 51, 53, 54, 57, 58},
        {31, 47, 55, 59}};
    if (all == 4 && n < 4) {
      return hours[n];
    } else if (all == 6 && n < 6) {
      return mins[n];
    } else {
      return new int[0];
    }
  }
}
