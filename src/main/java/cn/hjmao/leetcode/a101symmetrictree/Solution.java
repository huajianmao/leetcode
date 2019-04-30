package cn.hjmao.leetcode.a101symmetrictree;

import cn.hjmao.utils.tree.TreeNode;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/symmetric-tree/
 *
 * Desc:
 * =====
 * Given a binary tree, check whether it is a mirror of itself
 * (ie, symmetric around its center).
 *
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric.
 *
 * But the following [1,2,2,null,3,null,3] is not.
 */

public class Solution {

  // FIXME: add implementation code here.
  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    }
    if (root.left == null && root.right == null) {
      return true;
    }
    if (root.left != null && root.right != null && root.left.val == root.right.val) {
      TreeNode outer = new TreeNode(0);
      TreeNode inner = new TreeNode(0);
      outer.left = root.left.left;
      outer.right = root.right.right;
      inner.left = root.left.right;
      inner.right = root.right.left;

      return isSymmetric(outer) && isSymmetric(inner);
    } else {
      return false;
    }
  }
}
