package com.leetcode.snippets.a874walkingrobotsimulation;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testRobotSim1() {
    int[] commands = {4, -1, 3};
    int[][] obstacles = {};
    int expect = 25;
    int actual = solution.robotSim(commands, obstacles);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testRobotSim2() {
    int[] commands = {4, -1, 4, -2, 4};
    int[][] obstacles = {{2, 4}};
    int expect = 65;
    int actual = solution.robotSim(commands, obstacles);
    assertEquals(actual, expect);
  }
}
