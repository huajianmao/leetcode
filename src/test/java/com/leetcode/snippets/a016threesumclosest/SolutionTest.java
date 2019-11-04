package com.leetcode.snippets.a016threesumclosest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by hjmao on 11/02/2017.
 */
public class SolutionTest {
  private Solution solution;

  @BeforeMethod
  public void setUp() throws Exception {
    this.solution = new Solution();
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testThreeSumClosest1() throws Exception {
    int[] nums = {-1, 2, 1, -4};
    int target = 1;
    int expected = 2;

    assertEquals(this.solution.threeSumClosest(nums, target), expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testThreeSumClosest2() throws Exception {
    int[] nums = {1, 1, 1, 0};
    int target = 100;
    int expected = 3;

    assertEquals(this.solution.threeSumClosest(nums, target), expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testThreeSumClosest3() throws Exception {
    int[] nums = {0, 0, 0};
    int target = 1;
    int expected = 0;

    assertEquals(this.solution.threeSumClosest(nums, target), expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testThreeSumClosest4() throws Exception {
    int[] nums = {0, 1, 2};
    int target = 0;
    int expected = 3;

    assertEquals(this.solution.threeSumClosest(nums, target), expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testThreeSumClosest5() throws Exception {
    int[] nums = {1, 1, 1, 0};
    int target = 100;
    int expected = 3;

    assertEquals(this.solution.threeSumClosest(nums, target), expected);
  }


}
