package com.leetcode.snippets.a849maximizedistancetoclosestperson;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testMaxDistToClosest1() {
    int[] seats = {1, 0, 0, 0, 1, 0, 1};
    int expect = 2;
    int actual = solution.maxDistToClosest(seats);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testMaxDistToClosest2() {
    int[] seats = {1, 0, 0, 0};
    int expect = 3;
    int actual = solution.maxDistToClosest(seats);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testMaxDistToClosest3() {
    int[] seats = {0, 0, 0, 1};
    int expect = 3;
    int actual = solution.maxDistToClosest(seats);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testMaxDistToClosest4() {
    int[] seats = {0, 0, 0, 1, 1, 0, 0, 0, 0};
    int expect = 4;
    int actual = solution.maxDistToClosest(seats);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testMaxDistToClosest5() {
    int[] seats = {0, 0, 0, 0, 1, 1, 0, 0, 0};
    int expect = 4;
    int actual = solution.maxDistToClosest(seats);
    assertEquals(actual, expect);
  }
}
