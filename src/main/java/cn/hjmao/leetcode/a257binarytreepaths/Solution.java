package cn.hjmao.leetcode.a257binarytreepaths;

import cn.hjmao.utils.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/binary-tree-paths/
 *
 * Desc:
 * =====
 * Given a binary tree, return all root-to-leaf paths.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Input:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * Output: ["1->2->5", "1->3"]
 *
 * Explanation: All root-to-leaf paths are: 1->2->5, 1->3
 */

public class Solution {
  public List<String> binaryTreePaths(TreeNode root) {
    List<String> result = new ArrayList<>();
    if (root != null) {
      if (root.left == null && root.right == null) {
        result.add("" + root.val);
      }
      List<String> children = binaryTreePaths(root.left);
      children.addAll(binaryTreePaths(root.right));
      for (String child: children) {
        result.add(root.val + "->" + child);
      }
    }
    return result;
  }
}
