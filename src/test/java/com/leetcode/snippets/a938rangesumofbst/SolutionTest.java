package com.leetcode.snippets.a938rangesumofbst;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testRangeSumBST1() {
    Integer[] nums = {10, 5, 15, 3, 7, null, 18};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int l = 7;
    int r = 15;
    int expect = 32;
    int actual = solution.rangeSumBST(root, l, r);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testRangeSumBST2() {
    Integer[] nums = {10, 5, 15, 3, 7, 13, 18, 1, null, 6};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int l = 6;
    int r = 10;
    int expect = 23;
    int actual = solution.rangeSumBST(root, l, r);
    assertEquals(actual, expect);
  }
}
