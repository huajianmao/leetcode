package cn.hjmao.leetcode.a015threesum;

import cn.hjmao.utils.AssertUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hjmao on 17-2-9.
 */
public class SolutionTest {
  private Solution solution;

  @BeforeMethod
  public void setUp() throws Exception {
    this.solution = new Solution();
  }

  @Test
  public void testThreeSum1() throws Exception {
    int[] nums = {-1, 0, 1, 2, -1, -4};

    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(new Integer[]{-1, 0, 1}),
        Arrays.asList(new Integer[]{-1, -1, 2})
    );
    AssertUtils.assertEqualsOfTwoArrays(this.solution.threeSum(nums), expected);
  }

  @Test
  public void testThreeSum2() throws Exception {
    int[] nums = {};

    List<List<Integer>> expected = new ArrayList<>();
    AssertUtils.assertEqualsOfTwoArrays(this.solution.threeSum(nums), expected);
  }

  @Test
  public void testThreeSum3() throws Exception {
    int[] nums = {0, 0, 0, 0};

    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(new Integer[]{0, 0, 0})
    );
    AssertUtils.assertEqualsOfTwoArrays(this.solution.threeSum(nums), expected);
  }

  @Test
  public void testThreeSum4() throws Exception {
    int[] nums = {0, 0, 0, 1, 0};

    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(new Integer[]{0, 0, 0})
    );
    AssertUtils.assertEqualsOfTwoArrays(this.solution.threeSum(nums), expected);
  }

  @Test
  public void testThreeSum5() throws Exception {
    int[] nums = {-1, -1, -1, 1, 0};

    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(new Integer[]{-1, 0, 1})
    );
    AssertUtils.assertEqualsOfTwoArrays(this.solution.threeSum(nums), expected);
  }

  @Test
  public void testThreeSum6() throws Exception {
    int[] nums = {-1, -1, -1, 2};

    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(new Integer[]{-1, -1, 2})
    );
    AssertUtils.assertEqualsOfTwoArrays(this.solution.threeSum(nums), expected);
  }

  @Test
  public void testThreeSum7() throws Exception {
    int[] nums = {3, 0, -2, -1, 1, 2};

    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(new Integer[]{-2, -1, 3}),
        Arrays.asList(new Integer[]{-2, 0, 2}),
        Arrays.asList(new Integer[]{-1, 0, 1})
    );
    AssertUtils.assertEqualsOfTwoArrays(this.solution.threeSum(nums), expected);
  }

  @Test
  public void testThreeSum8() throws Exception {
    int[] nums = {-100, -100, 0, 0, 0, 0, 1, 1, 2};

    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(new Integer[]{0, 0, 0})
    );
    AssertUtils.assertEqualsOfTwoArrays(this.solution.threeSum(nums), expected);
  }

  @Test
  public void testThreeSum9() throws Exception {
    int[] nums = {
        -13, 5, 13, 12, -2, -11, -1, 12, -3, 0, -3, -7, -7, -5, -3, -15, -2, 14, 14, 13,
        6, -11, -11, 5, -15, -14, 5, -5, -2, 0, 3, -8, -10, -7, 11, -5, -10, -5, -7, -6,
        2, 5, 3, 2, 7, 7, 3, -10, -2, 2, -12, -11, -1, 14, 10, -9, -15, -8, -7, -9,
        7, 3, -2, 5, 11, -13, -15, 8, -3, -7, -12, 7, 5, -2, -6, -3, -10, 4, 2, -5,
        14, -3, -1, -10, -3, -14, -4, -3, -7, -4, 3, 8, 14, 9, -2, 10, 11, -10, -4, -15,
        -9, -1, -1, 3, 4, 1, 8, 1
    };
    List<List<Integer>> expected = this.solution.brutalForceSolution(nums);
    AssertUtils.assertEqualsOfTwoArrays(this.solution.threeSum(nums), expected);
  }
}
