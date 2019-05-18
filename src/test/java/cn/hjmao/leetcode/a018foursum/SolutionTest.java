package cn.hjmao.leetcode.a018foursum;

import cn.hjmao.utils.AssertUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertTrue;

/**
 * Created by hjmao on 17-2-14.
 */
public class SolutionTest {
  private Solution solution;

  @BeforeMethod
  public void setUp() throws Exception {
    this.solution = new Solution();
  }

  @Test
  public void testFourSum1() throws Exception {
    int[] nums = {1, 0, -1, 0, -2, 2};
    int target = 0;
    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(-1, 0, 0, 1),
        Arrays.asList(-2, -1, 1, 2),
        Arrays.asList(-2, 0, 0, 2)
    );
    assertTrue(AssertUtils.areEqualsOfTwoArrays(this.solution.fourSum(nums, target), expected));
  }

  @Test
  public void testFourSum2() throws Exception {
    int[] nums = {-3, -2, -1, 0, 0, 1, 2, 3};
    int target = 0;
    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(-3, -2, 2, 3),
        Arrays.asList(-3, -1, 1, 3),
        Arrays.asList(-3, 0, 0, 3),
        Arrays.asList(-3, 0, 1, 2),
        Arrays.asList(-2, -1, 0, 3),
        Arrays.asList(-2, -1, 1, 2),
        Arrays.asList(-2, 0, 0, 2),
        Arrays.asList(-1, 0, 0, 1)
    );
    assertTrue(AssertUtils.areEqualsOfTwoArrays(this.solution.fourSum(nums, target), expected));
  }

  @Test
  public void testFourSum3() throws Exception {
    int[] nums = {3, 1, 4, 2, 5, -4, 2, 4, -5};
    int target = -12;
    List<List<Integer>> expected = new ArrayList<>();
    assertTrue(AssertUtils.areEqualsOfTwoArrays(this.solution.fourSum(nums, target), expected));
  }

  @Test
  public void testFourSum4() throws Exception {
    int[] nums = {-5, 5, 4, -3, 0, 0, 4, -2};
    int target = 4;
    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(-5, 0, 4, 5),
        Arrays.asList(-3, -2, 4, 5)
    );
    assertTrue(AssertUtils.areEqualsOfTwoArrays(this.solution.fourSum(nums, target), expected));
  }

  @Test
  public void testFourSum5() throws Exception {
    int[] nums = {1, -2, -5, -4, -3, 3, 3, 5};
    int target = -11;
    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(-5, -4, -3, 1)
    );
    assertTrue(AssertUtils.areEqualsOfTwoArrays(this.solution.fourSum(nums, target), expected));
  }

  @Test
  public void testFourSum6() throws Exception {
    int[] nums = {0, 1, 1, 1};
    int target = 1000;
    List<List<Integer>> expected = new ArrayList<>();
    assertTrue(AssertUtils.areEqualsOfTwoArrays(this.solution.fourSum(nums, target), expected));
  }

  @Test
  public void testFourSum7() throws Exception {
    int[] nums = {1, 1, 1, 1000, 1000};
    int target = 3;
    List<List<Integer>> expected = new ArrayList<>();
    assertTrue(AssertUtils.areEqualsOfTwoArrays(this.solution.fourSum(nums, target), expected));
  }

  @Test
  public void testFourSum8() throws Exception {
    int[] nums = {1, 1, 1000, 1000, 1000};
    int target = 2;
    List<List<Integer>> expected = new ArrayList<>();
    assertTrue(AssertUtils.areEqualsOfTwoArrays(this.solution.fourSum(nums, target), expected));
  }
}
