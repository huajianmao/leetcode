package cn.hjmao.leetcode.a543diameterofbinarytree;

import cn.hjmao.utils.tree.TreeNode;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/diameter-of-binary-tree/
 *
 * Desc:
 * =====
 * Given a binary tree, you need to compute the length of the diameter of the tree.
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
 * This path may or may not pass through the root.
 *
 * Example:
 * Given a binary tree
 *           1
 *          / \
 *         2   3
 *        / \
 *       4   5
 * Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
 *
 * Note: The length of path between two nodes is represented by the number of edges between them.
 */


class Solution {
  private int max = 0;

  public int diameterOfBinaryTree(TreeNode root) {
    max = 0;
    if (root != null) {
      maxDepth(root);
    }
    return max;
  }

  private int maxDepth(TreeNode node) {
    if (node.left != null && node.right != null) {
      node.val = Math.max(maxDepth(node.left), maxDepth(node.right)) + 1;
      max = Math.max(max, node.left.val + node.right.val + 2);
    } else if (node.right != null) {
      node.val = maxDepth(node.right) + 1;
      max = Math.max(max, node.right.val + 1);
    } else if (node.left != null) {
      node.val = maxDepth(node.left) + 1;
      max = Math.max(max, node.left.val + 1);
    } else {
      node.val = 0;
    }
    return node.val;
  }
}
