package com.leetcode.snippets.a1018binaryprefixdivisibleby5;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testPrefixesDivBy5T1() {
    int[] a = {0, 1, 1};
    List<Boolean> expect = Arrays.asList(true, false, false);
    List<Boolean> actual = solution.prefixesDivBy5(a);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testPrefixesDivBy5T2() {
    int[] a = {1, 1, 1};
    List<Boolean> expect = Arrays.asList(false, false, false);
    List<Boolean> actual = solution.prefixesDivBy5(a);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testPrefixesDivBy5T3() {
    int[] a = {0, 1, 1, 1, 1, 1};
    List<Boolean> expect = Arrays.asList(true, false, false, false, true, false);
    List<Boolean> actual = solution.prefixesDivBy5(a);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testPrefixesDivBy5T4() {
    int[] a = {1, 1, 1, 0, 1};
    List<Boolean> expect = Arrays.asList(false, false, false, false, false);
    List<Boolean> actual = solution.prefixesDivBy5(a);
    assertEquals(actual, expect);
  }
}
