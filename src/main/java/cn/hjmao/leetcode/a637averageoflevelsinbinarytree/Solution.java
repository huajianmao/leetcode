package cn.hjmao.leetcode.a637averageoflevelsinbinarytree;

import cn.hjmao.utils.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/
 *
 * Desc:
 * =====
 * Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.
 * Example 1:
 * Input:
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * Output: [3, 14.5, 11]
 * Explanation:
 * The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on level 2 is 11. Hence return [3, 14.5, 11].
 *
 * Note:
 * The range of node's value is in the range of 32-bit signed integer.
 */

class Solution {
  public List<Double> averageOfLevels(TreeNode root) {
    List<Double> result = new ArrayList<>();

    List<TreeNode> thisLevel = new ArrayList<>();
    thisLevel.add(root);
    while (!thisLevel.isEmpty()) {
      List<TreeNode> nextLevel = new ArrayList<>();
      double thisLevelValue = 0;
      int thisLevelCount = thisLevel.size();
      for (TreeNode node: thisLevel) {
        thisLevelValue += node.val;
        if (node.left != null) {
          nextLevel.add(node.left);
        }
        if (node.right != null) {
          nextLevel.add(node.right);
        }
      }
      result.add(thisLevelValue / thisLevelCount);
      thisLevel = nextLevel;
    }

    return result;
  }
}
