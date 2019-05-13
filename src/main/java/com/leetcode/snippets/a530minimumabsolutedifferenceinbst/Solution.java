package com.leetcode.snippets.a530minimumabsolutedifferenceinbst;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/minimum-absolute-difference-in-bst/
 *
 * Desc:
 * =====
 * Given a binary search tree with non-negative values,
 * find the minimum absolute difference between values of any two nodes.
 *
 * Example:
 *
 * Input:
 *
 *    1
 *     \
 *      3
 *     /
 *    2
 *
 * Output:
 * 1
 *
 * Explanation:
 * The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
 *
 *
 * Note: There are at least two nodes in this BST.
 */

import cn.hjmao.utils.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
  public int getMinimumDifference(TreeNode root) {
    return -1;
  }
}
