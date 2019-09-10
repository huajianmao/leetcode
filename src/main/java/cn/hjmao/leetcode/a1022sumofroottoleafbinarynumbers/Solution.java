package cn.hjmao.leetcode.a1022sumofroottoleafbinarynumbers;

import cn.hjmao.utils.tree.TreeNode;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
 *
 * Desc:
 * =====
 * Given a binary tree, each node has value 0 or 1.
 * Each root-to-leaf path represents a binary number starting with the most significant bit.
 * For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 01101 in binary, which is 13.
 *
 * For all leaves in the tree, consider the numbers represented by the path from the root to that leaf.
 *
 * Return the sum of these numbers.
 *
 *
 *
 * Example 1:
 * Input: [1,0,1,0,1,0,1]
 * Output: 22
 * Explanation: (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
 *
 *
 * Note:
 * The number of nodes in the tree is between 1 and 1000.
 * node.val is 0 or 1.
 * The answer will not exceed 2^31 - 1.}
 */
class Solution {
  public int sumRootToLeaf(TreeNode root) {
    return helper(root, 0);
  }

  private int helper(TreeNode node, int base) {
    int sum = 0;
    base = (base << 1) + node.val;

    if (node.left == null && node.right == null) {
      return base;
    } else {
      if (node.left != null) {
        sum += helper(node.left, base);
      }

      if (node.right != null) {
        sum += helper(node.right, base);
      }
      return sum;
    }
  }
}
