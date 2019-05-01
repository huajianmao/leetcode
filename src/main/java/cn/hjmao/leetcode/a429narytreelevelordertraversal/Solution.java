package cn.hjmao.leetcode.a429narytreelevelordertraversal;

import cn.hjmao.utils.narytree.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/n-ary-tree-level-order-traversal/
 *
 * Desc:
 * =====
 * Given an n-ary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 *
 * For example, given a 3-ary tree:
 *
 *
 * We should return its level order traversal:
 *
 * [
 * [1],
 * [3,2,4],
 * [5,6]
 * ]
 *
 * Note:
 * 
 * 
 * The depth of the tree is at most 1000.
 * The total number of nodes is at most 5000.
 */

class Solution {
  public List<List<Integer>> levelOrder(Node root) {
    List<List<Integer>> values = new ArrayList<>();
    List<Node> siblings = new ArrayList<>();

    if (root != null) {
      siblings.add(root);
      while (siblings.size() != 0) {
        List<Node> nextLevelSiblings = new ArrayList<>();
        List<Integer> thisLevelValues = new ArrayList<>();
        for (Node node: siblings) {
          thisLevelValues.add(node.val);
          if (node.children != null && node.children.size() != 0) {
            nextLevelSiblings.addAll(node.children);
          }
        }
        values.add(thisLevelValues);
        siblings = nextLevelSiblings;
      }
    }
    return values;
  }
}