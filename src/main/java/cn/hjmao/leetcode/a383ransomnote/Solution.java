package cn.hjmao.leetcode.a383ransomnote;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/ransom-note/
 *
 * Desc:
 * =====
 * Given an arbitrary ransom note string and another string containing letters from all the magazines,
 * write a function that will return true if the ransom note can be constructed from the magazines ;
 * otherwise, it will return false.
 *
 * Each letter in the magazine string can only be used once in your ransom note.
 *
 * Note:
 * You may assume that both strings contain only lowercase letters.
 *
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 */

public class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {
    char[] letters = new char[26];
    for (char c: magazine.toCharArray()) {
      letters[c - 'a']++;
    }

    for (char c: ransomNote.toCharArray()) {
      if (letters[c - 'a']-- < 1) {
        return false;
      }
    }

    return true;
  }

  public boolean canConstruct1(String ransomNote, String magazine) {
    if (ransomNote == null) {
      return true;
    } else if (magazine != null && magazine.length() >= ransomNote.length()) {
      Map<Character, Integer> magazineChars = new HashMap<>();
      for (int i = 0; i < magazine.length(); i++) {
        char thisChar = magazine.charAt(i);
        magazineChars.put(thisChar, magazineChars.getOrDefault(thisChar, 0) + 1);
      }
      for (int i = 0; i < ransomNote.length(); i++) {
        char thisChar = ransomNote.charAt(i);
        int magazineLeftCharCount = magazineChars.getOrDefault(thisChar, 0);
        if (magazineLeftCharCount > 0) {
          magazineChars.put(thisChar, magazineLeftCharCount - 1);
        } else {
          return false;
        }
      }
      return true;
    } else {
      return false;
    }
  }
}
