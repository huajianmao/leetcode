package cn.hjmao.leetcode.a872leafsimilartrees;

import cn.hjmao.utils.tree.TreeNode;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/leaf-similar-trees/
 *
 * Desc:
 * =====
 * Consider all the leaves of a binary tree.
 * From left to right order, the values of those leaves form a leaf value sequence.
 *
 *
 *
 * For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).
 *
 * Two binary trees are considered leaf-similar if their leaf value sequence is the same.
 *
 * Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
 *
 *
 *
 * Note:
 * Both of the given trees will have between 1 and 100 nodes..
 */

class Solution {
  public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    Stack<TreeNode> nodes1 = new Stack<>();
    Stack<TreeNode> nodes2 = new Stack<>();
    nodes1.add(root1);
    nodes2.add(root2);

    while (!nodes1.isEmpty() || !nodes2.isEmpty()) {
      TreeNode leaf1 = nextLeaf(nodes1);
      TreeNode leaf2 = nextLeaf(nodes2);
      if (!(leaf1 == null && leaf2 == null) && !(leaf1 != null && leaf2 != null && leaf1.val == leaf2.val)) {
        return false;
      }
    }

    return true;
  }

  private TreeNode nextLeaf(Stack<TreeNode> nodes) {
    while (!nodes.isEmpty()) {
      TreeNode node = nodes.pop();
      if (node.left == null && node.right == null) {
        return node;
      }

      if (node.right != null) {
        nodes.push(node.right);
      }
      if (node.left != null) {
        nodes.push(node.left);
      }
    }
    return null;
  }
}
