package com.leetcode.snippets.a637averageoflevelsinbinarytree;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testAverageOfLevels1() {
    Integer[] nums = {3, 9, 20, null, null, 15, 7};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    List<Double> expect = Arrays.asList(3.0, 14.5, 11.0);
    List<Double> actual = solution.averageOfLevels(root);
    assertEquals(actual, expect);
  }
}
