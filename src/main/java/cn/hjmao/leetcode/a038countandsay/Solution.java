package cn.hjmao.leetcode.a038countandsay;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/count-and-say
 *
 * Desc:
 * =====
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 *
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 *
 * Given an integer n, generate the nth sequence.
 *
 * Note: The sequence of integers will be represented as a string.
 */

public class Solution {
  public String countAndSay(int n) {
    if (n == 1) {
      return "1";
    }

    StringBuilder result = new StringBuilder();
    Queue<Integer> queue = new LinkedList<>();
    queue.add(1);
    queue.add(0);

    int currentInt = -1;
    int currentIntCount = 0;

    for (int i = 1; i < n;) {
      int thisInt;
      while (!queue.isEmpty()) {
        thisInt = queue.poll();

        if (currentInt == -1) {
          currentInt = thisInt;
          currentIntCount = 1;
          continue;
        }

        if (thisInt == 0) {
          queue.add(currentIntCount);
          queue.add(currentInt);
          queue.add(0);
          currentInt = -1;
          currentIntCount = 0;
          i++;
          break;
        } else if (thisInt == currentInt) {
          currentIntCount++;
        } else {
          queue.add(currentIntCount);
          queue.add(currentInt);
          currentInt = thisInt;
          currentIntCount = 1;
        }
      }
    }

    while (queue.peek() != 0) {
      result.append(queue.poll());
    }

    return result.toString();
  }
}
