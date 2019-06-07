package cn.hjmao.leetcode.a671secondminimumnodeinabinarytree;

import cn.hjmao.utils.tree.TreeNode;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
 *
 * Desc:
 * =====
 * Given a non-empty special binary tree consisting of nodes with the non-negative value,
 * where each node in this tree has exactly two or zero sub-node.
 * If the node has two sub-nodes, then this node's value is the smaller value among its two sub-nodes.
 * More formally, the property root.val = min(root.left.val, root.right.val) always holds.
 *
 * Given such a binary tree,
 * you need to output the second minimum value in the set made of all the nodes' value in the whole tree.
 *
 * If no such second minimum value exists, output -1 instead.
 *
 * Example 1:
 *
 * Input:
 *     2
 *    / \
 *   2   5
 *      / \
 *     5   7
 *
 * Output: 5
 * Explanation: The smallest value is 2, the second smallest value is 5.
 *
 *
 * Example 2:
 *
 * Input:
 *     2
 *    / \
 *   2   2
 *
 * Output: -1
 * Explanation: The smallest value is 2, but there isn't any second smallest value.
 */

class Solution {
  public int findSecondMinimumValue(TreeNode root) {
    int secondMin = -1;
    if (root == null || root.left == null) {
      return -1;
    }

    if (root.left.val == root.right.val) {
      int left = findSecondMinimumValue(root.left);
      int right = findSecondMinimumValue(root.right);
      if (left == -1 || right == -1) {
        secondMin = Math.max(left, right);
      } else {
        secondMin = Math.min(left, right);
      }
    } else if (root.left.val == root.val) {
      secondMin = root.right.val;
      int left = findSecondMinimumValue(root.left);
      if (left != -1) {
        secondMin = Math.min(secondMin, left);
      }
    } else if (root.right.val == root.val) {
      secondMin = root.left.val;
      int right = findSecondMinimumValue(root.right);
      if (right != -1) {
        secondMin = Math.min(secondMin, right);
      }
    }

    return secondMin;
  }
}
