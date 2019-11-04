package com.leetcode.snippets.a543diameterofbinarytree;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testDiameterOfBinaryTree1() {
    Integer[] values = {1, 2, 3, 4, 5};
    TreeNode root = TreeNodeUtils.fromArray(values);
    int expect = 3;
    int actual = solution.diameterOfBinaryTree(root);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testDiameterOfBinaryTree2() {
    Integer[] values = {};
    TreeNode root = TreeNodeUtils.fromArray(values);
    int expect = 0;
    int actual = solution.diameterOfBinaryTree(root);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testDiameterOfBinaryTree3() {
    Integer[] values = {1};
    TreeNode root = TreeNodeUtils.fromArray(values);
    int expect = 0;
    int actual = solution.diameterOfBinaryTree(root);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testDiameterOfBinaryTree4() {
    Integer[] values = {1, 2};
    TreeNode root = TreeNodeUtils.fromArray(values);
    int expect = 1;
    int actual = solution.diameterOfBinaryTree(root);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testDiameterOfBinaryTree5() {
    Integer[] values = {1, 2, 3};
    TreeNode root = TreeNodeUtils.fromArray(values);
    int expect = 2;
    int actual = solution.diameterOfBinaryTree(root);
    assertEquals(actual, expect);
  }
}
