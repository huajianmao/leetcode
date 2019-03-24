package cn.hjmao.leetcode.a110balancedbinarytree;

import cn.hjmao.utils.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/balanced-binary-tree/
 *
 * Desc:
 * =====
 * Given a binary tree, determine if it is height-balanced.
 *
 * For this problem, a height-balanced binary tree is defined as:
 *
 * a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * Example 1:
 *
 * Given the following tree [3,9,20,null,null,15,7]:
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * Return true.
 *
 * Example 2:
 *
 * Given the following tree [1,2,2,3,3,null,null,4,4]:
 *
 *        1
 *       / \
 *      2   2
 *     / \
 *    3   3
 *   / \
 *  4   4
 * Return false.
 */

public class Solution {
    boolean isBalanced = true;

    public boolean isBalanced(TreeNode root) {
        height(root);
        return isBalanced;
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        if (Math.abs(left - right) > 1) {
            isBalanced = false;
        }
        return Math.max(left, right) + 1;
    }

    // Wrong
    public boolean isBalanced1(TreeNode root) {
        if (root == null) {
            return true;
        }

        boolean positive = false;

        List<TreeNode> thisLevelSiblings = new ArrayList<>();
        thisLevelSiblings.add(root);

        while (true) {
            boolean hasNullChild = false;
            List<TreeNode> nextLevelSiblings = new ArrayList<>();
            for (int i = 0; i < thisLevelSiblings.size(); i++) {
                TreeNode thisNode = thisLevelSiblings.get(i);
                if (thisNode.left != null) {
                    nextLevelSiblings.add(thisNode.left);
                } else {
                    hasNullChild = true;
                }

                if (thisNode.right != null) {
                    nextLevelSiblings.add(thisNode.right);
                } else {
                    hasNullChild = true;
                }
            }
            if (hasNullChild) {
                if (nextLevelSiblings.size() == 0) {
                    return true;
                } else {
                    for (int i = 0; i < nextLevelSiblings.size(); i++) {
                        TreeNode thisNode = nextLevelSiblings.get(i);
                        return thisNode.left == null && thisNode.right == null;
                    }
                }
            } else {
                thisLevelSiblings = nextLevelSiblings;
            }
        }
    }
}
