package cn.hjmao.leetcode.a830positionsoflargegroups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/positions-of-large-groups/
 *
 * Desc:
 * =====
 * In a string S of lowercase letters, these letters form consecutive groups of the same character.
 *
 * For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".
 *
 * Call a group large if it has 3 or more characters.
 * We would like the starting and ending positions of every large group.
 *
 * The final answer should be in lexicographic order.
 *
 *
 *
 * Example 1:
 *
 * Input: "abbxxxxzzy"
 * Output: [[3,6]]
 * Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.
 * Example 2:
 *
 * Input: "abc"
 * Output: []
 * Explanation: We have "a","b" and "c" but no large group.
 * Example 3:
 *
 * Input: "abcdddeeeeaabbbcd"
 * Output: [[3,5],[6,9],[12,14]]
 *
 *
 * Note:  1 <= S.length <= 10000
 */

class Solution {
  public List<List<Integer>> largeGroupPositions(String s) {
    List<List<Integer>> positions = new ArrayList<>();
    int start = 0;
    int end;
    for (end = start + 1; end < s.length(); end++) {
      if (s.charAt(start) != s.charAt(end)) {
        if (end - start >= 3) {
          positions.add(Arrays.asList(start, end - 1));
        }
        start = end;
      }
    }
    if (end == s.length() && end - start >= 3) {
      positions.add(Arrays.asList(start, end - 1));
    }
    return positions;
  }
}
