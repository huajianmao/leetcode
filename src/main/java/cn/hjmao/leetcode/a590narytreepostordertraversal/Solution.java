package cn.hjmao.leetcode.a590narytreepostordertraversal;

import cn.hjmao.utils.narytree.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/n-ary-tree-postorder-traversal/
 *
 * Desc:
 * =====
 * Given an n-ary tree, return the postorder traversal of its nodes' values.
 * 
 * 
 * For example, given a 3-ary tree:
 *
 *           1
 *         / | \
 *       3   2  4
 *      / \
 *     5   6
 * 
 * 
 *
 * Return its postorder traversal as: [5,6,3,2,4,1].
 * 
 *
 * Note:
 * Recursive solution is trivial, could you do it iteratively?
 */

class Solution {
  public List<Integer> postorder(Node root) {
    List<Integer> result = new ArrayList<>();
    if (root != null) {
      Stack<Node> stack = new Stack<>();
      stack.push(root);
      while (!stack.isEmpty()) {
        Node thisNode = stack.pop();
        result.add(0, thisNode.val);
        if (thisNode.children != null) {
          stack.addAll(thisNode.children);
        }
      }
    }
    return result;
  }
}
