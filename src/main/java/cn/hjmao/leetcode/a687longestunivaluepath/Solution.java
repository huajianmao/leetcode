package cn.hjmao.leetcode.a687longestunivaluepath;

import cn.hjmao.utils.tree.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/longest-univalue-path/
 *
 * Desc:
 * =====
 * Given a binary tree, find the length of the longest path where each node in the path has the same value.
 * This path may or may not pass through the root.
 *
 * The length of path between two nodes is represented by the number of edges between them.
 *
 *
 *
 * Example 1:
 *
 * Input:
 *
 *               5
 *              / \
 *             4   5
 *            / \   \
 *           1   1   5
 * Output: 2
 *
 *
 *
 * Example 2:
 *
 * Input:
 *
 *               1
 *              / \
 *             4   5
 *            / \   \
 *           4   4   5
 * Output: 2
 *
 *
 *
 * Note: The given binary tree has not more than 10000 nodes. The height of the tree is not more than 1000.
 */
class Solution {
  public int longestUnivaluePath(TreeNode root) {
    int[] res = new int[1];
    if (root != null) {
      dfs(root, res);
    }
    return res[0];
  }

  private int dfs(TreeNode node, int[] res) {
    int left = node.left != null ? dfs(node.left, res) : 0;
    int right = node.right != null ? dfs(node.right, res) : 0;
    int leftLength = node.left != null && node.left.val == node.val ? left + 1 : 0;
    int rightLength = node.right != null && node.right.val == node.val ? right + 1 : 0;
    res[0] = Math.max(res[0], leftLength + rightLength);
    return Math.max(leftLength, rightLength);
  }
}
