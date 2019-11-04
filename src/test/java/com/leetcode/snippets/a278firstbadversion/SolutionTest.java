package com.leetcode.snippets.a278firstbadversion;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFirstBadVersion1() {
    int n = 5;
    int expect = 4;
    solution.setFirst(expect);
    int actual = solution.firstBadVersion(n);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFirstBadVersion2() {
    int n = 2126753390;
    int expect = 1702766719;
    solution.setFirst(expect);
    int actual = solution.firstBadVersion(n);
    assertEquals(actual, expect);
  }
}
