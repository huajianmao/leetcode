package cn.hjmao.leetcode.a859buddystrings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/buddy-strings/
 *
 * Desc:
 * =====
 * Given two strings A and B of lowercase letters,
 * return true if and only if we can swap two letters in A so that the result equals B.
 *
 *
 *
 * Example 1:
 * Input: A = "ab", B = "ba"
 * Output: true
 *
 * Example 2:
 * Input: A = "ab", B = "ab"
 * Output: false
 *
 * Example 3:
 * Input: A = "aa", B = "aa"
 * Output: true
 *
 * Example 4:
 * Input: A = "aaaaaaabc", B = "aaaaaaacb"
 * Output: true
 *
 * Example 5:
 * Input: A = "", B = "aa"
 * Output: false
 *
 *
 * Note:
 * 0 <= A.length <= 20000
 * 0 <= B.length <= 20000
 * A and B consist only of lowercase letters.
 */

class Solution {
  public boolean buddyStrings(String a, String b) {
    if (a == null || b == null || a.length() != b.length()) {
      return false;
    }

    if (a.equals(b)) {
      Set<Character> set = new HashSet<Character>();
      for (char c : a.toCharArray()) {
        if (set.contains(c)) {
          return true;
        } else {
          set.add(c);
        }
      }
      return false;
    }

    List<Integer> diff = new ArrayList<>();
    for (int i = 0; i < a.length(); ++i) {
      if (a.charAt(i) != b.charAt(i)) {
        diff.add(i);
      }
    }

    return diff.size() == 2
        && a.charAt(diff.get(0)) == b.charAt(diff.get(1))
        && a.charAt(diff.get(1)) == b.charAt(diff.get(0));
  }
}
