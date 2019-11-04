package com.leetcode.snippets.a700searchinabinarysearchtree;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSearchBST1() {
    Integer[] nums = {4, 2, 7, 1, 3};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int val = 2;
    Integer[] expectNums = {2, 1, 3};
    TreeNode expect = TreeNodeUtils.fromArray(expectNums);
    TreeNode actual = solution.searchBST(root, val);
    assertTrue(TreeNodeUtils.isSameTree(actual, expect));
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSearchBST2() {
    Integer[] nums = {4, 2, 7, 1, 3};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int val = 5;
    Integer[] expectNums = {};
    TreeNode expect = TreeNodeUtils.fromArray(expectNums);
    TreeNode actual = solution.searchBST(root, val);
    assertTrue(TreeNodeUtils.isSameTree(actual, expect));
  }
}
