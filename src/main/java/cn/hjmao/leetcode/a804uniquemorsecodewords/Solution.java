package cn.hjmao.leetcode.a804uniquemorsecodewords;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/unique-morse-code-words/
 *
 * Desc:
 * =====
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes,
 * as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
 *
 * For convenience, the full table for the 26 letters of the English alphabet is given below:
 *
 * [
 *   ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
 *   "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
 * ]
 * Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter.
 * For example, "cba" can be written as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-").
 * We'll call such a concatenation, the transformation of a word.
 *
 * Return the number of different transformations among all words we have.
 *
 * Example:
 * Input: words = ["gin", "zen", "gig", "msg"]
 * Output: 2
 *
 * Explanation:
 * The transformation of each word is:
 * "gin" -> "--...-."
 * "zen" -> "--...-."
 * "gig" -> "--...--."
 * "msg" -> "--...--."
 *
 * There are 2 different transformations, "--...-." and "--...--.".
 * Note:
 *
 * The length of words will be at most 100.
 * Each words[i] will have length in range [1, 12].
 * words[i] will only consist of lowercase letters..
 */

class Solution {
  private String[] morse = {
      ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
      ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
      ".--", "-..-", "-.--", "--.."
  };

  public int uniqueMorseRepresentations(String[] words) {
    Set<String> representations = new HashSet<>();
    for (String word: words) {
      StringBuilder sb = new StringBuilder();
      for (char c: word.toCharArray()) {
        sb.append(morse[c - 'a']);
      }
      representations.add(sb.toString());
    }
    return representations.size();
  }
}
