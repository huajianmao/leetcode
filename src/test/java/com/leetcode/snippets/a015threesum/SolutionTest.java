package com.leetcode.snippets.a015threesum;

import cn.hjmao.utils.AssertUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertTrue;

/**
 * Created by hjmao on 17-2-9.
 */
public class SolutionTest {
  private Solution solution;

  @BeforeMethod
  public void setUp() throws Exception {
    this.solution = new Solution();
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testThreeSum1() throws Exception {
    int[] nums = {-1, 0, 1, 2, -1, -4};

    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(new Integer[]{-1, 0, 1}),
        Arrays.asList(new Integer[]{-1, -1, 2})
    );
    assertTrue(AssertUtils.areEqualsOfTwoArrays(this.solution.threeSum(nums), expected));
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testThreeSum2() throws Exception {
    int[] nums = {};

    List<List<Integer>> expected = new ArrayList<>();
    assertTrue(AssertUtils.areEqualsOfTwoArrays(this.solution.threeSum(nums), expected));
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testThreeSum3() throws Exception {
    int[] nums = {0, 0, 0, 0};

    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(new Integer[]{0, 0, 0})
    );
    assertTrue((AssertUtils.areEqualsOfTwoArrays(this.solution.threeSum(nums), expected)));
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testThreeSum4() throws Exception {
    int[] nums = {0, 0, 0, 1, 0};

    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(new Integer[]{0, 0, 0})
    );
    assertTrue(AssertUtils.areEqualsOfTwoArrays(this.solution.threeSum(nums), expected));
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testThreeSum5() throws Exception {
    int[] nums = {-1, -1, -1, 1, 0};

    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(new Integer[]{-1, 0, 1})
    );
    assertTrue(AssertUtils.areEqualsOfTwoArrays(this.solution.threeSum(nums), expected));
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testThreeSum6() throws Exception {
    int[] nums = {-1, -1, -1, 2};

    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(new Integer[]{-1, -1, 2})
    );
    assertTrue(AssertUtils.areEqualsOfTwoArrays(this.solution.threeSum(nums), expected));
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testThreeSum7() throws Exception {
    int[] nums = {3, 0, -2, -1, 1, 2};

    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(new Integer[]{-2, -1, 3}),
        Arrays.asList(new Integer[]{-2, 0, 2}),
        Arrays.asList(new Integer[]{-1, 0, 1})
    );
    assertTrue(AssertUtils.areEqualsOfTwoArrays(this.solution.threeSum(nums), expected));
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testThreeSum8() throws Exception {
    int[] nums = {-100, -100, 0, 0, 0, 0, 1, 1, 2};

    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(new Integer[]{0, 0, 0})
    );
    assertTrue(AssertUtils.areEqualsOfTwoArrays(this.solution.threeSum(nums), expected));
  }
}
