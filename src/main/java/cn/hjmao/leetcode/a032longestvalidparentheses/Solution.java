package cn.hjmao.leetcode.a032longestvalidparentheses;

import java.util.Stack;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/longest-valid-parentheses
 *
 * Desc:
 * =====
 * Given a string containing just the characters '(' and ')',
 * find the length of the longest valid (well-formed) parentheses substring.
 *
 * For "(()",
 * the longest valid parentheses substring is "()", which has length = 2.
 *
 * Another example is ")()())",
 * where the longest valid parentheses substring is "()()", which has length = 4.
 */

public class Solution {
  public int longestValidParentheses(String s) {
    if (s == null || s.length() <= 1 || s.indexOf(')') == -1) {
      return 0;
    }

    int longest = 0;
    Stack<Character> stack = new Stack<>();
    Stack<Integer> validLengths = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char thisChar = s.charAt(i);
      switch (thisChar) {
        case '(':
          stack.push(thisChar);
          break;
        case ')':
          if (stack.empty()) {
            continue;
          }

          int currentLength = 0;
          if (!stack.empty() && stack.peek() == '.') {
            stack.pop();
            currentLength = currentLength + validLengths.pop();
          }

          if (stack.empty()) {
            if (longest < currentLength) {
              longest = currentLength;
            }
            validLengths.clear();
          } else {
            Character topChar = stack.pop();
            currentLength = currentLength + 2;
            if (!stack.empty() && stack.peek() == '.') {
              stack.pop();
              currentLength = currentLength + validLengths.pop();
            }
            stack.push('.');
            validLengths.push(currentLength);
          }
          break;
        default:
          break;
      }
    }

    while (!validLengths.empty()) {
      int currentLength = validLengths.pop();
      longest = currentLength > longest ? currentLength : longest;
    }

    return longest;
  }

  public int longestValidParentheses1(String s) {
    if (s == null || s.length() <= 1) {
      return 0;
    }

    int currentLongest = 0;
    int[] longest = new int[s.length()];
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == ')') {
        if (s.charAt(i - 1) == '(') {
          longest[i] = (i - 2) >= 0 ? (longest[i - 2] + 2) : 2;
          currentLongest = Math.max(longest[i], currentLongest);
        } else {
          if (i - longest[i - 1] - 1 >= 0 && s.charAt(i - longest[i - 1] - 1) == '(') {
            longest[i] = longest[i - 1] + 2 + ((i - longest[i - 1] - 2 >= 0) ? longest[i - longest[i - 1] - 2] : 0);
            currentLongest = Math.max(longest[i], currentLongest);
          }
        }
      }
    }

    return currentLongest;
  }

  public int longestValidParentheses2(String s) {
    Stack<Integer> stack = new Stack<>();
    int longest = 0;
    int left = -1;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(') {
        stack.push(i);
      } else {
        if (stack.isEmpty()) {
          left = i;
        } else {
          stack.pop();
          if (stack.isEmpty()) {
            longest = Math.max(longest, i - left);
          } else {
            longest = Math.max(longest, i - stack.peek());
          }
        }
      }
    }
    return longest;
  }
}
