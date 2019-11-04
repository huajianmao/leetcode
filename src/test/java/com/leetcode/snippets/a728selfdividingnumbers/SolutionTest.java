package com.leetcode.snippets.a728selfdividingnumbers;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSelfDividingNumbers1() {
    int left = 1;
    int right = 22;
    List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22);
    List<Integer> actual = solution.selfDividingNumbers(left, right);
    assertEquals(actual, expect);
  }
}
