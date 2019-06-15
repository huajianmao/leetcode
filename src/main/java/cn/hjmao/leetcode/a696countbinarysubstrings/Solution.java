package cn.hjmao.leetcode.a696countbinarysubstrings;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/count-binary-substrings/
 *
 * Desc:
 * =====
 * Give a string s, count the number of non-empty (contiguous) substrings that have the same number of 0's and 1's,
 * and all the 0's and all the 1's in these substrings are grouped consecutively.
 *
 * Substrings that occur multiple times are counted the number of times they occur.
 *
 *
 *
 * Example 1:
 * Input: "00110011"
 * Output: 6
 * Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's:
 * "0011", "01", "1100", "10", "0011", and "01".
 *
 * Notice that some of these substrings repeat and are counted the number of times they occur.
 *
 * Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.
 *
 *
 *
 * Example 2:
 * Input: "10101"
 * Output: 4
 * Explanation: There are 4 substrings: "10", "01", "10", "01" that have equal number of consecutive 1's and 0's.
 * Note:
 *
 * s.length will be between 1 and 50,000.
 * s will only consist of "0" or "1" characters.
 */

class Solution {
  public int countBinarySubstrings(String s) {
    if (s == null || s.length() == 0) {
      return 0;
    }
    int sum = 0;
    int prevCount = 0;
    int index = 0;

    while (index < s.length()) {
      int i = 0;
      while (index + i < s.length() - 1) {
        if (s.charAt(index + i) != s.charAt(index + i + 1)) {
          break;
        }
        i++;
      }
      int thisCount = i + 1;
      sum += Math.min(thisCount, prevCount);
      prevCount = thisCount;
      index += i + 1;
    }

    return sum;
  }
}
