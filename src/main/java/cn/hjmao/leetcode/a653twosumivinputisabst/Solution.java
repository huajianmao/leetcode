package cn.hjmao.leetcode.a653twosumivinputisabst;

import cn.hjmao.utils.tree.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
 *
 * Desc:
 * =====
 * Given a Binary Search Tree and a target number,
 * return true if there exist two elements in the BST such that their sum is equal to the given target.
 *
 * Example 1:
 *
 * Input:
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 *
 * Target = 9
 *
 * Output: True
 *
 *
 * Example 2:
 *
 * Input:
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 *
 * Target = 28
 *
 * Output: False
 */
class Solution {
  public boolean findTarget(TreeNode root, int k) {
    Set<Integer> values = new HashSet<>();
    List<TreeNode> thisLevel = new ArrayList<>();
    thisLevel.add(root);
    while (!thisLevel.isEmpty()) {
      List<TreeNode> nextLevel = new ArrayList<>();
      for (TreeNode node: thisLevel) {
        if (values.contains(k - node.val)) {
          return true;
        } else {
          values.add(node.val);
        }
        if (node.left != null) {
          nextLevel.add(node.left);
        }
        if (node.right != null) {
          nextLevel.add(node.right);
        }
      }
      thisLevel = nextLevel;
    }

    return false;
  }
}
