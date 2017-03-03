package cn.hjmao.leetcode.a040combinationsum2;

import cn.hjmao.utils.AssertUtils;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by hjmao on 17-3-3.
 */
public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testCombinationSum21() throws Exception {
    int[] candidates = {10, 1, 2, 7, 6, 1, 5};
    int target = 8;
    List<List<Integer>> expected = Arrays.asList(
        Arrays.asList(1, 7),
        Arrays.asList(1, 2, 5),
        Arrays.asList(2, 6),
        Arrays.asList(1, 1, 6)
    );
    List<List<Integer>> actual = this.solution.combinationSum2(candidates, target);
    AssertUtils.assertEqualsOfTwoArrays(actual, expected);
  }
}