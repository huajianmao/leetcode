package com.leetcode.snippets.a387firstuniquecharacterinastring;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFirstUniqChar1() {
    String s = "leetcode";
    int expect = 0;
    int actual = solution.firstUniqChar(s);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFirstUniqChar2() {
    String s = "loveleetcode";
    int expect = 2;
    int actual = solution.firstUniqChar(s);
    assertEquals(actual, expect);
  }
}
