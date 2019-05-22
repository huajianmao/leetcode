package cn.hjmao.leetcode.a022generateparentheses;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/generate-parentheses/
 *
 * Desc:
 * =====
 * Given n pairs of parentheses,
 * write a function to generate all combinations of well-formed parentheses.
 *
 * For example, given n = 3, a solution set is:
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 */

public class Solution {
  // private List<String> generateParenthesisRecursively(int left, int right) {
  //   if (left == 0) {
  //     String thisResult = "";
  //     while (right > 0) {
  //       thisResult += ")";
  //       right--;
  //     }
  //     return Arrays.asList(thisResult);
  //   }
  //
  //   List<String> thisResults = new LinkedList<>();
  //   if (left == right) {
  //     List<String> results = generateParenthesisRecursively(left - 1, right);
  //     for (String it : results) {
  //       thisResults.add("(" + it);
  //     }
  //   } else {
  //     List<String> results = generateParenthesisRecursively(left - 1, right);
  //     for (String it : results) {
  //       thisResults.add("(" + it);
  //     }
  //     results = generateParenthesisRecursively(left, right - 1);
  //     for (String it : results) {
  //      thisResults.add(")" + it);
  //    }
  //  }
  //   return thisResults;
  // }

  class StringCount {
    private String val;
    private int left;
    private int right;

    StringCount(String val, int left, int right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
  }

  private List<String> solution1(int n) {
    Queue<StringCount> parenthesis = new LinkedList<>();

    parenthesis.add(new StringCount("(", 1, 0));
    StringCount thisSequence = parenthesis.peek();
    while (thisSequence.left + thisSequence.right < 2 * n) {
      thisSequence = parenthesis.remove();

      if (thisSequence.left == thisSequence.right) {
        parenthesis.add(new StringCount(thisSequence.val + "(", thisSequence.left + 1, thisSequence.right));
      } else if (thisSequence.left > thisSequence.right) {
        if (thisSequence.left < n) {
          parenthesis.add(new StringCount(thisSequence.val + "(", thisSequence.left + 1, thisSequence.right));
        }
        if (thisSequence.right < n) {
          parenthesis.add(new StringCount(thisSequence.val + ")", thisSequence.left, thisSequence.right + 1));
        }
      }

      thisSequence = parenthesis.peek();
    }

    List<String> results = new ArrayList<>();
    for (StringCount element: parenthesis) {
      results.add(element.val);
    }
    return results;
  }

  public List<String> generateParenthesis(int n) {
    List<String> result = solution1(n);
    return result;
  }
}
