package cn.hjmao.leetcode.a572subtreeofanothertree;

import cn.hjmao.utils.tree.TreeNode;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/subtree-of-another-tree/
 *
 * Desc:
 * =====
 * Given two non-empty binary trees s and t,
 * check whether tree t has exactly the same structure and node values with a subtree of s.
 * A subtree of s is a tree consists of a node in s and all of this node's descendants.
 * The tree s could also be considered as a subtree of itself.
 *
 * Example 1:
 * Given tree s:
 *
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 * Given tree t:
 *    4
 *   / \
 *  1   2
 * Return true, because t has the same structure and node values with a subtree of s.
 *
 *
 * Example 2:
 * Given tree s:
 *
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 *     /
 *    0
 * Given tree t:
 *    4
 *   / \
 *  1   2
 * Return false.
 */

class Solution {
  public boolean isSubtree(TreeNode s, TreeNode t) {
    if (isSubtreeFromNode(s, t)) {
      return true;
    } else {
      return (s.left != null && isSubtree(s.left, t)) || (s.right != null && isSubtree(s.right, t));
    }
  }

  private boolean isSubtreeFromNode(TreeNode s, TreeNode t) {
    if (s == null && t == null) {
      return true;
    } else if (s != null && t != null) {
      return s.val == t.val && isSubtreeFromNode(s.left, t.left) && isSubtreeFromNode(s.right, t.right);
    } else {
      return false;
    }
  }
}
