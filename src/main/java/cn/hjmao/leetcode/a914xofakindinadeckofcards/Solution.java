package cn.hjmao.leetcode.a914xofakindinadeckofcards;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/
 *
 * Desc:
 * =====
 * In a deck of cards, each card has an integer written on it.
 *
 * Return true if and only if you can choose X >= 2
 * such that it is possible to split the entire deck into 1 or more groups of cards, where:
 * Each group has exactly X cards.
 *
 * All the cards in each group have the same integer.
 *
 *
 * Example 1:
 * Input: [1,2,3,4,4,3,2,1]
 * Output: true
 * Explanation: Possible partition [1,1],[2,2],[3,3],[4,4]
 *
 * Example 2:
 * Input: [1,1,1,2,2,2,3,3]
 * Output: false
 * Explanation: No possible partition.
 *
 * Example 3:
 * Input: [1]
 * Output: false
 * Explanation: No possible partition.
 *
 * Example 4:
 * Input: [1,1]
 * Output: true
 * Explanation: Possible partition [1,1]
 *
 * Example 5:
 * Input: [1,1,2,2,2,2]
 * Output: true
 * Explanation: Possible partition [1,1],[2,2],[2,2]
 *
 * Note:
 *
 * 1 <= deck.length <= 10000
 * 0 <= deck[i] < 10000
 */

class Solution {
  public boolean hasGroupsSizeX(int[] deck) {
    Map<Integer, Integer> counts = new HashMap<>();
    for (int num: deck) {
      counts.put(num, counts.getOrDefault(num, 0) + 1);
    }

    int gcp = gcp(counts.values());

    return gcp >= 2;
  }

  int gcp(Collection<Integer> values) {
    int gcp = -1;
    for (int value: values) {
      if (gcp == -1) {
        gcp = value;
      } else {
        gcp = gcp(gcp, value);
        if (gcp == 1) {
          return 1;
        }
      }
    }
    return gcp;
  }

  int gcp(int a, int b) {
    while (a % b != 0) {
      int tmp = a;
      a = b % a;
      b = tmp;
    }
    return b;
  }
}
