package com.leetcode.snippets.a872leafsimilartrees;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testLeafSimilar1() {
    Integer[] root1Array = {3, 5, 1, 6, 2, 9, 8, null, null, 7, 4};
    Integer[] root2Array = {3, 5, 1, 6, 7, 2, 8, null, null, null, null, 4, 9};
    TreeNode root1 = TreeNodeUtils.fromArray(root1Array);
    TreeNode root2 = TreeNodeUtils.fromArray(root2Array);
    boolean actual = solution.leafSimilar(root1, root2);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testLeafSimilar2() {
    Integer[] root1Array = {3, 5, 1, 6, 2, 9, 8};
    Integer[] root2Array = {3, 5, 1, 6, 7, 2, 8, null, null, 4, 9};
    TreeNode root1 = TreeNodeUtils.fromArray(root1Array);
    TreeNode root2 = TreeNodeUtils.fromArray(root2Array);
    boolean actual = solution.leafSimilar(root1, root2);
    assertFalse(actual);
  }
}
