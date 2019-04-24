package cn.hjmao.leetcode.a345reversevowelsofastring;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 *
 * Desc:
 * =====
 * Write a function that takes a string as input and reverse only the vowels of a string.
 *
 * Example 1:
 *
 * Input: "hello"
 * Output: "holle"
 * Example 2:
 *
 * Input: "leetcode"
 * Output: "leotcede"
 * Note:
 * The vowels does not include the letter "y".
 */

public class Solution {
  public String reverseVowels(String s) {
    int i = 0;
    int j = s.length() - 1;
    char[] chars = new char[s.length()];
    while (i <= j) {
      while (i <= j && !isVowel(s.charAt(i))) {
        chars[i] = s.charAt(i);
        i++;
      }
      while (i <= j && !isVowel(s.charAt(j))) {
        chars[j] = s.charAt(j);
        j--;
      }
      if (i > j) {
        break;
      } else {
        chars[i] = s.charAt(j);
        chars[j] = s.charAt(i);
        i++;
        j--;
      }
    }
    return new String(chars);
  }

  private boolean isVowel(char c) {
    c = Character.toLowerCase(c);
    return c == 'a' || c == 'o' || c == 'e' || c == 'i' || c == 'u';
  }
}
