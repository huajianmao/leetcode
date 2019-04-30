package cn.hjmao.leetcode.a472constructquadtree;

import cn.hjmao.utils.quadtree.Node;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/construct-quad-tree/
 *
 * Desc:
 * =====
 * We want to use quad trees to store an N x N boolean grid.
 * Each cell in the grid can only be true or false.
 * The root node represents the whole grid.
 * For each node, it will be subdivided into four children nodes
 * until the values in the region it represents are all the same.
 *
 *
 *
 * Each node has another two boolean attributes : isLeaf and val.
 * isLeaf is true if and only if the node is a leaf node.
 * The val attribute for a leaf node contains the value of the region it represents.
 *
 *
 *
 * Your task is to use a quad tree to represent a given grid.
 * The following example may help you understand the problem better:
 *
 *
 *
 * Given the 8 x 8 grid below, we want to construct the corresponding quad tree:
 *
 *
 * It can be divided according to the definition above:
 *
 *
 *
 * The corresponding quad tree should be as following,
 * where each node is represented as a (isLeaf, val) pair.
 *
 * For the non-leaf nodes, val can be arbitrary, so it is represented as *.
 *
 *
 * Note:
 *
 * N is less than 1000 and guaranteed to be a power of 2.
 * If you want to know more about the quad tree, you can refer to its wiki.
 */

class Solution {
  public Node construct(int[][] grid) {
    return helper(grid, 0, 0, grid.length);
  }

  private Node helper(int[][] grid, int x, int y, int size) {
    if (size == 1) {
      return new Node(grid[x][y] == 1, true, null, null, null, null);
    } else {
      size >>= 1;
      Node topLeft = helper(grid, x, y, size);
      Node topRight = helper(grid, x, y + size, size);
      Node bottomLeft = helper(grid, x + size, y, size);
      Node bottomRight = helper(grid, x + size, y + size, size);

      if (topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf
          && topLeft.val == topRight.val && topLeft.val == bottomLeft.val && topLeft.val == bottomRight.val) {
        return new Node(topLeft.val, true, null, null, null, null);
      } else {
        return new Node(true, false, topLeft, topRight, bottomLeft, bottomRight);
      }
    }
  }
}
