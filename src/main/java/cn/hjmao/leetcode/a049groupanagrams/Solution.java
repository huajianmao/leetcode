package cn.hjmao.leetcode.a049groupanagrams;

import java.util.*;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/group-anagrams/
 *
 * Desc:
 * =====
 * Given an array of strings, group anagrams together.
 *
 * Example:
 *
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 * Note:
 *
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 */

public class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();

    for (String str: strs) {
      char[] characters = str.toCharArray();
      Arrays.sort(characters);
      String key = "";
      for (int i = 0; i < characters.length; i++) {
        key += characters[i];
      }
      if (map.containsKey(key)) {
        map.get(key).add(str);
      } else {
        List<String> newOne = new ArrayList<>();
        newOne.add(str);
        map.put(key, newOne);
      }
    }

    List<List<String>> result = new ArrayList<>();
    for (List<String> value: map.values()) {
      result.add(value);
    }
    return result;
  }

}
