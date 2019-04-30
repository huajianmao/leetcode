package cn.hjmao.leetcode.a020validparentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/valid-parentheses/
 *
 * Desc:
 * =====
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * The brackets must close in the correct order,
 * "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */

public class Solution {
  private static final Map<Character, Character> CLOSE_PARENTHESES_MAP = new HashMap<>();

  static {
    CLOSE_PARENTHESES_MAP.put(')', '(');
    CLOSE_PARENTHESES_MAP.put(']', '[');
    CLOSE_PARENTHESES_MAP.put('}', '{');
  }

  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char thisChar = s.charAt(i);
      if (thisChar == '(' || thisChar == '[' || thisChar == '{') {
        stack.push(thisChar);
      } else if (stack.empty() || stack.pop() != CLOSE_PARENTHESES_MAP.get(thisChar)) {
        return false;
      }
    }
    return stack.empty();
  }
}

