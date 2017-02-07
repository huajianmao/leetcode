package cn.hjmao.leetcode.a003longestsubstringwithoutrepeatingcharacters;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hjmao.
 * <p>
 * URL:
 * =====
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * <p>
 * Desc:
 * =====
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class Solution {
  public int lengthOfLongestSubstring(String s) {
    int longestLength = 0;

    Map<Character, Integer> charPosMap = new HashMap<Character, Integer>();
    int last = 0;
    for (int i = 0; i < s.length(); i++) {
      char thisChar = s.charAt(i);
      if (charPosMap.containsKey(thisChar)) {
        int thisLongestLength = i - last;
        int lastThisCharPos = charPosMap.get(thisChar);
        if (thisLongestLength > longestLength) {
          longestLength = thisLongestLength;
        }

        for (int j = last; j <= lastThisCharPos; j++) {
          charPosMap.remove(s.charAt(j));
        }
        last = lastThisCharPos + 1;
      }
      charPosMap.put(thisChar, i);
    }

    int unCountLength = charPosMap.size();
    if (longestLength < unCountLength) {
      longestLength = unCountLength;
    }

    return longestLength;
  }
}
