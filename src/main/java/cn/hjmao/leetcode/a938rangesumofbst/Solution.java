package cn.hjmao.leetcode.a938rangesumofbst;

import cn.hjmao.utils.tree.TreeNode;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/range-sum-of-bst/
 *
 * Desc:
 * =====
 * Given the root node of a binary search tree,
 * return the sum of values of all nodes with value between L and R (inclusive).
 *
 * The binary search tree is guaranteed to have unique values.
 *
 *
 *
 * Example 1:
 * Input: root = [10,5,15,3,7,null,18], L = 7, R = 15
 * Output: 32
 *
 * Example 2:
 * Input: root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
 * Output: 23
 *
 *
 * Note:
 * The number of nodes in the tree is at most 10000.
 * The final answer is guaranteed to be less than 2^31.}
 */

class Solution {
  public int rangeSumBST(TreeNode root, int l, int r) {
    if (root == null) {
      return 0;
    } else {
      if (root.val < l) {
        return rangeSumBST(root.right, l, r);
      } else if (root.val > r) {
        return rangeSumBST(root.left, l, r);
      } else {
        return root.val + rangeSumBST(root.left, l, r) + rangeSumBST(root.right, l, r);
      }
    }
  }
}
