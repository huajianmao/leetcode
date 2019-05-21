package cn.hjmao.leetcode.a589narytreepreordertraversal;

import cn.hjmao.utils.narytree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/n-ary-tree-preorder-traversal/
 *
 * Desc:
 * =====
 * Given an n-ary tree, return the preorder traversal of its nodes' values.
 *
 * For example, given a 3-ary tree:
 *
 *           1
 *         / |  \
 *       3   2   4
 *      / \
 *     5   6
 *
 * Return its preorder traversal as: [1,3,5,6,2,4].
 *
 * Note:
 *
 * Recursive solution is trivial, could you do it iteratively??
 */

class Solution {
  public List<Integer> preorder(Node root) {
    List<Integer> result = new ArrayList<>();
    if (root != null) {
      Stack<Node> stack = new Stack<>();
      stack.push(root);
      while (!stack.isEmpty()) {
        Node thisNode = stack.pop();
        result.add(thisNode.val);
        if (thisNode.children != null) {
          for (int i = thisNode.children.size() - 1; i >= 0; i--) {
            Node node = thisNode.children.get(i);
            if (node != null) {
              stack.add(node);
            }
          }
        }
      }
    }
    return result;
  }
}
