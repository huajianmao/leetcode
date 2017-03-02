package cn.hjmao.leetcode.a039combinationsum;

import cn.hjmao.utils.AssertUtils;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by hjmao on 01/03/2017.
 */
public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testCombinationSum1() throws Exception {
    int[] candidates = {2};
    int target = 3;
    List<List<Integer>> expected = Arrays.asList();
    List<List<Integer>> actual = this.solution.combinationSum(candidates, target);
    AssertUtils.assertEqualsOfTwoArrays(actual, expected);
  }

  @Test
  public void testCombinationSum2() throws Exception {
    int[] candidates = {2, 4};
    int target = 4;
    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(4),
        Arrays.asList(2, 2)
    );
    List<List<Integer>> actual = this.solution.combinationSum(candidates, target);
    AssertUtils.assertEqualsOfTwoArrays(actual, expected);
  }

  @Test
  public void testCombinationSum3() throws Exception {
    int[] candidates = {2, 3, 6, 7};
    int target = 7;
    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(7),
        Arrays.asList(2, 2, 3)
    );
    List<List<Integer>> actual = this.solution.combinationSum(candidates, target);
    AssertUtils.assertEqualsOfTwoArrays(actual, expected);
  }

  @Test
  public void testCombinationSum4() throws Exception {
    int[] candidates = {2, 3, 6, 7};
    int target = 6;
    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(6),
        Arrays.asList(3, 3),
        Arrays.asList(2, 2, 2)
    );
    List<List<Integer>> actual = this.solution.combinationSum(candidates, target);
    AssertUtils.assertEqualsOfTwoArrays(actual, expected);
  }

  @Test
  public void testCombinationSum5() throws Exception {
    int[] candidates = {3, 5, 7};
    int target = 10;
    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(3, 7),
        Arrays.asList(5, 5)
    );
    List<List<Integer>> actual = this.solution.combinationSum(candidates, target);
    AssertUtils.assertEqualsOfTwoArrays(actual, expected);
  }
}