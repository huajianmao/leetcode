package com.leetcode.snippets.a783minimumdistancebetweenbstnodes;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testMinDiffInBST1() {
    Integer[] nums = {4, 2, 6, 1, 3};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int expect = 1;
    int actual = solution.minDiffInBST(root);
    assertEquals(actual, expect);
  }
}
