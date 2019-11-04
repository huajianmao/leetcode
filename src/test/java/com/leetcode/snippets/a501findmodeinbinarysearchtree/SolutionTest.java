package com.leetcode.snippets.a501findmodeinbinarysearchtree;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFindMode1() {
    Integer[] bst = {1, null, 2, 2};
    TreeNode root = TreeNodeUtils.fromArray(bst);
    int[] expect = {2};
    int[] actual = solution.findMode(root);
    assertEquals(actual, expect);
  }
}
