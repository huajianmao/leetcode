package cn.hjmao.leetcode.a404sumofleftleaves;

import cn.hjmao.utils.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/sum-of-left-leaves/
 *
 * Desc:
 * =====
 * Find the sum of all left leaves in a given binary tree.
 *
 * Example:
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 */

public class Solution {

  public int sumOfLeftLeaves(TreeNode root) {
    int sum = 0;
    if (root != null) {
      Queue<TreeNode> nodes = new LinkedList<>();
      nodes.add(root);
      while (!nodes.isEmpty()) {
        TreeNode node = nodes.poll();
        if (node.left != null && node.left.left == null && node.left.right == null) {
          sum += node.left.val;
        } else if (node.left != null) {
          nodes.add(node.left);
        }
        if (node.right != null) {
          nodes.add(node.right);
        }
      }
    }
    return sum;
  }

  public int sumOfLeftLeaves1(TreeNode root) {
    if (root == null) {
      return 0;
    }

    if (root.left != null) {
      int sum = 0;
      if (root.left.left == null && root.left.right == null) {
        sum += root.left.val;
      } else {
        sum += sumOfLeftLeaves1(root.left);
      }
      sum += sumOfLeftLeaves1(root.right);
      return sum;
    } else {
      return sumOfLeftLeaves1(root.right);
    }
  }
}
