package cn.hjmao.leetcode.a538convertbsttogreatertree;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testConvertBST1() {
    Integer[] nums = {5, 2, 13};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    Integer[] expectNums = {18, 20, 13};
    TreeNode expect = TreeNodeUtils.fromArray(expectNums);
    TreeNode actual = solution.convertBST(root);
    assertTrue(TreeNodeUtils.isSameTree(actual, expect));
  }

  @Test
  public void testConvertBST3() {
    Integer[] nums = {2, 0, 3, -4, 1};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    Integer[] expectNums = {5, 6, 3, 2, 6};
    TreeNode expect = TreeNodeUtils.fromArray(expectNums);
    TreeNode actual = solution.convertBST(root);
    assertTrue(TreeNodeUtils.isSameTree(actual, expect));
  }

  @Test
  public void testConvertBST4() {
    Integer[] nums = {1, 0, 4, -2, null, 3};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    Integer[] expectNums = {8, 8, 4, 6, null, 7};
    TreeNode expect = TreeNodeUtils.fromArray(expectNums);
    TreeNode actual = solution.convertBST(root);
    assertTrue(TreeNodeUtils.isSameTree(actual, expect));
  }
}