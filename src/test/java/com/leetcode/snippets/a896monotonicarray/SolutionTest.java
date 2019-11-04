package com.leetcode.snippets.a896monotonicarray;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsMonotonic1() {
    int[] a = {1, 2, 2, 3};
    boolean actual = solution.isMonotonic(a);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsMonotonic2() {
    int[] a = {6, 5, 4, 4};
    boolean actual = solution.isMonotonic(a);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsMonotonic3() {
    int[] a = {1, 3, 2};
    boolean actual = solution.isMonotonic(a);
    assertFalse(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsMonotonic4() {
    int[] a = {1, 2, 4, 5};
    boolean actual = solution.isMonotonic(a);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsMonotonic5() {
    int[] a = {1, 1, 1};
    boolean actual = solution.isMonotonic(a);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsMonotonic6() {
    int[] a = {1, -1, 1};
    boolean actual = solution.isMonotonic(a);
    assertFalse(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsMonotonic7() {
    int[] a = {1};
    boolean actual = solution.isMonotonic(a);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsMonotonic8() {
    int[] a = {1, 2};
    boolean actual = solution.isMonotonic(a);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsMonotonic9() {
    int[] a = {2, 1};
    boolean actual = solution.isMonotonic(a);
    assertTrue(actual);
  }
}
