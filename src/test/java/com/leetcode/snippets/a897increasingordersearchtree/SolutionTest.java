package com.leetcode.snippets.a897increasingordersearchtree;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIncreasingBST1() {
    Integer[] nums = {5, 3, 6, 2, 4, null, 8, 1, null, null, null, 7, 9};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    Integer[] expectNums = {1, null, 2, null, 3, null, 4, null, 5, null, 6, null, 7, null, 8, null, 9};
    TreeNode expect = TreeNodeUtils.fromArray(expectNums);
    TreeNode actual = solution.increasingBST(root);
    assertTrue(TreeNodeUtils.isSameTree(actual, expect));
  }
}
