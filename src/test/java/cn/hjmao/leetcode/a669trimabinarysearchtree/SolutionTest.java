package cn.hjmao.leetcode.a669trimabinarysearchtree;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testTrimBST1() {
    int l = 1;
    int r = 2;
    Integer[] nums = {1, 0, 2};
    Integer[] expectNums = {1, null, 2};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    TreeNode expect = TreeNodeUtils.fromArray(expectNums);
    TreeNode actual = solution.trimBST(root, l, r);
    assertTrue(TreeNodeUtils.isSameTree(actual, expect));
  }

  @Test
  public void testTrimBST2() {
    int l = 1;
    int r = 3;
    Integer[] nums = {3, 0, 4, null, 2, null, null, 1};
    Integer[] expectNums = {3, 2, null, 1};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    TreeNode expect = TreeNodeUtils.fromArray(expectNums);
    TreeNode actual = solution.trimBST(root, l, r);
    assertTrue(TreeNodeUtils.isSameTree(actual, expect));
  }

  @Test
  public void testTrimBST3() {
    int l = 1;
    int r = 3;
    Integer[] nums = {3};
    Integer[] expectNums = {3};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    TreeNode expect = TreeNodeUtils.fromArray(expectNums);
    TreeNode actual = solution.trimBST(root, l, r);
    assertTrue(TreeNodeUtils.isSameTree(actual, expect));
  }
}