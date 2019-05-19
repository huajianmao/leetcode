package cn.hjmao.leetcode.a559maximumdepthofnarytree;

import cn.hjmao.utils.narytree.Node;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
 *
 * Desc:
 * =====
 * Given a n-ary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * For example, given a 3-ary tree:
 *
 * We should return its max depth, which is 3.
 *
 *
 * Note:
 *
 * The depth of the tree is at most 1000.
 * The total number of nodes is at most 5000..
 */

class Solution {
  public int maxDepth(Node root) {
    int depth = 0;

    if (root != null) {
      Set<Node> thisLevelNodes = new HashSet<>();
      thisLevelNodes.add(root);

      Set<Node> nextLevelNodes;
      while (!thisLevelNodes.isEmpty()) {
        nextLevelNodes = new HashSet<>();
        depth++;
        for (Node node : thisLevelNodes) {
          if (node.children != null && !node.children.isEmpty()) {
            nextLevelNodes.addAll(node.children);
          }
        }
        thisLevelNodes = nextLevelNodes;
      }
    }

    return depth;
  }

  public int maxDepth1(Node root) {
    int depth = 0;
    if (root != null) {
      depth++;
      if (root.children != null) {
        for (Node node : root.children) {
          depth = Math.max(depth, maxDepth(node) + 1);
        }
      }
    }
    return depth;
  }
}