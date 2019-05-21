package cn.hjmao.leetcode.a235lowestcommonancestorofabinarysearchtree;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testLowestCommonAncestor1() {
    Integer[] nums = {6, 2, 8, 0, 4, 7, 9, null, null, 3, 5};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    TreeNode p = new TreeNode(2);
    TreeNode q = new TreeNode(8);
    TreeNode expect = root;
    TreeNode actual = solution.lowestCommonAncestor(root, p, q);
    assertEquals(actual, expect);
  }

  @Test
  public void testLowestCommonAncestor2() {
    Integer[] nums = {6, 2, 8, 0, 4, 7, 9, null, null, 3, 5};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    TreeNode p = new TreeNode(2);
    TreeNode q = new TreeNode(4);
    TreeNode expect = root.left;
    TreeNode actual = solution.lowestCommonAncestor(root, p, q);
    assertEquals(actual, expect);
  }
}
