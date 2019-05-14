package cn.hjmao.leetcode.a538convertbsttogreatertree;

import cn.hjmao.utils.tree.TreeNode;

import java.util.Stack;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/convert-bst-to-greater-tree/
 *
 * Desc:
 * =====
 * Given a Binary Search Tree (BST), convert it to a Greater Tree
 * such that every key of the original BST is changed to the original key
 * plus sum of all keys greater than the original key in BST.
 *
 * Example:
 *
 * Input: The root of a Binary Search Tree like this:
 *               5
 *             /  \
 *            2   13
 *
 * Output: The root of a Greater Tree like this:
 *              18
 *             /  \
 *           20   13
 */
class Solution {
  public TreeNode convertBST(TreeNode root) {
    if (root == null) {
      return null;
    }
    int sum = 0;
    Stack<TreeNode> stack = new Stack<>();
    TreeNode cur = root;
    while (!stack.isEmpty() || cur != null) {
      while (cur != null) {
        stack.push(cur);
        cur = cur.right;
      }
      cur = stack.pop();
      int tmp = cur.val;
      cur.val += sum;
      sum += tmp;
      cur = cur.left;
    }
    return root;
  }
}