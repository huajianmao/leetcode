package cn.hjmao.leetcode.a993cousinsinbinarytree;

import cn.hjmao.utils.tree.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/cousins-in-binary-tree/
 *
 * Desc:
 * =====
 * In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
 *
 * Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
 *
 * We are given the root of a binary tree with unique values,
 * and the values x and y of two different nodes in the tree.
 *
 * Return true if and only if the nodes corresponding to the values x and y are cousins.
 *
 *
 *
 * Example 1:
 * Input: root = [1,2,3,4], x = 4, y = 3
 * Output: false
 *
 * Example 2:
 * Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
 * Output: true
 *
 * Example 3:
 * Input: root = [1,2,3,null,4], x = 2, y = 3
 * Output: false
 *
 *
 * Note:
 * The number of nodes in the tree will be between 2 and 100.
 * Each node has a unique integer value from 1 to 100.}
 */

class Solution {
  public boolean isCousins(TreeNode root, int x, int y) {
    List<TreeNode> cousins = new LinkedList<>();
    cousins.add(root);
    while (cousins.size() > 0) {
      int size = cousins.size();
      Set<Integer> xy = new HashSet<>();
      xy.add(x);
      xy.add(y);
      for (int i = 0; i < size; i++) {
        TreeNode cousin = cousins.remove(0);
        if (cousin.left != null && cousin.right != null
            && xy.contains(cousin.left.val) && xy.contains(cousin.right.val)) {
          return false;
        }
        if (xy.contains(cousin.val)) {
          xy.remove(cousin.val);
        }
        if (cousin.left != null) {
          cousins.add(cousin.left);
        }
        if (cousin.right != null) {
          cousins.add(cousin.right);
        }
      }
      if (xy.size() == 0) {
        return true;
      } else if (xy.size() == 1) {
        return false;
      }
    }
    return false;
  }
}
