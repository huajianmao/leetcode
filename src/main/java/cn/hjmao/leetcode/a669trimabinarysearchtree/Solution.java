package cn.hjmao.leetcode.a669trimabinarysearchtree;

import cn.hjmao.utils.tree.TreeNode;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/trim-a-binary-search-tree/
 *
 * Desc:
 * =====
 * Given a binary search tree and the lowest and highest boundaries as L and R,
 * trim the tree so that all its elements lies in [L, R] (R >= L).
 * You might need to change the root of the tree,
 * so the result should return the new root of the trimmed binary search tree.
 *
 * Example 1:
 * Input:
 *     1
 *    / \
 *   0   2
 *
 *   L = 1
 *   R = 2
 *
 * Output:
 *     1
 *       \
 *        2
 * Example 2:
 * Input:
 *     3
 *    / \
 *   0   4
 *    \
 *     2
 *    /
 *   1
 *
 *   L = 1
 *   R = 3
 *
 * Output:
 *       3
 *      /
 *    2
 *   /
 *  1
 */
class Solution {
  public TreeNode trimBST(TreeNode root, int l, int r) {
    if (root != null) {
      if (root.val > r) {
        root = trimBST(root.left, l, r);
      } else if (root.val < l) {
        root = trimBST(root.right, l, r);
      } else {
        root.left = trimBST(root.left, l, r);
        root.right = trimBST(root.right, l, r);
      }
    }
    return root;
  }
}
