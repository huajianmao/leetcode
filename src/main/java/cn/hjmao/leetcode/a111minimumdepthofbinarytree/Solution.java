package cn.hjmao.leetcode.a111minimumdepthofbinarytree;

import cn.hjmao.utils.tree.TreeNode;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 *
 * Desc:
 * =====
 * Given a binary tree, find its minimum depth.
 *
 * The minimum depth is the number of nodes along the shortest path
 * from the root node down to the nearest leaf node.
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given binary tree [3,9,20,null,null,15,7],
 *
 *   3
 *  / \
 * 9  20
 *   /  \
 *  15   7
 * return its minimum depth = 2.
 */

public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null || root.right == null) {
            return 1 + Math.max(minDepth(root.left), minDepth(root.right));
        } else {
            return 1 + Math.min(minDepth(root.left), minDepth(root.right));
        }
    }
}
