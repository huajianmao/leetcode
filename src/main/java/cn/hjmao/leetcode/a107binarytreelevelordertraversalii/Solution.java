package cn.hjmao.leetcode.a107binarytreelevelordertraversalii;

import cn.hjmao.utils.tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 *
 * Desc:
 * =====
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values.
 * (ie, from left to right, level by level from leaf to root).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its bottom-up level order traversal as:
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 */

public class Solution {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) { return result; }

        List<TreeNode> thisLevelSiblings = new ArrayList<>();
        thisLevelSiblings.add(root);
        while(!thisLevelSiblings.isEmpty()) {
            List<TreeNode> nextLevelSiblings = new ArrayList<>();
            List<Integer> thisLevelValues = new ArrayList<>();
            for (int i = 0; i < thisLevelSiblings.size(); i++) {
                TreeNode sibling = thisLevelSiblings.get(i);

                thisLevelValues.add(sibling.val);
                if (sibling.left != null) {
                    nextLevelSiblings.add(sibling.left);
                }
                if (sibling.right != null) {
                    nextLevelSiblings.add(sibling.right);
                }
            }
            result.add(thisLevelValues);
            thisLevelSiblings = nextLevelSiblings;
        }

        Collections.reverse(result);
        return result;
    }
}
