package com.leetcode.snippets.a022generateparentheses;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.testng.Assert.assertEquals;

/**
 * Created by hjmao on 17-2-17.
 */
public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testGenerateParenthesis() throws Exception {
    int n = 3;
    List<String> expected = Arrays.asList(
        "((()))",
        "(()())",
        "(())()",
        "()(())",
        "()()()"
    );
    List<String> actual = this.solution.generateParenthesis(n);

    assertEquals(new HashSet<>(actual), new HashSet<>(expected));
  }
}
