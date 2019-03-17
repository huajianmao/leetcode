package cn.hjmao.leetcode.a112pathsum;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/path-sum/
 *
 * Desc:
 * =====
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path
 * such that adding up all the values along the path equals the given sum.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given the below binary tree and sum = 22,
 * 
 *       5
 *      / \
 *     4   8
 *    /   / \
 *   11  13  4
 *  /  \      \
 * 7    2      1
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 */

public class Solution {
  public boolean hasPathSum(TreeNode root, int sum) {
    boolean has = false;

    if (root != null) {
      sum = sum - root.val;
      if (root.left == null && root.right == null) {
        return sum == 0;
      } else if (root.left == null) {
        return hasPathSum(root.right, sum);
      } else if (root.right == null) {
        return hasPathSum(root.left, sum);
      } else {
        return hasPathSum(root.right, sum) || hasPathSum(root.left, sum);
      }
    }

    return has;
  }
}
