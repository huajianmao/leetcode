package cn.hjmao.leetcode.a100sametree;

import cn.hjmao.utils.tree.TreeNode;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/same-tree/
 *
 * Desc:
 * =====
 * Given two binary trees, write a function to check if they are the same or not.
 *
 * Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
 */

public class Solution {
  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    } else if (p == null || q == null) {
      return false;
    } else {
      if (p.val == q.val) {
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
      } else {
        return false;
      }
    }
  }
}
