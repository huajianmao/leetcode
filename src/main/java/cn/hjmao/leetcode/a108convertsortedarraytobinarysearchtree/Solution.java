package cn.hjmao.leetcode.a108convertsortedarraytobinarysearchtree;

import cn.hjmao.utils.tree.TreeNode;

import java.util.Arrays;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 *
 * Desc:
 * =====
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 * For this problem, a height-balanced binary tree is defined as a binary tree
 * in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * Example:
 *
 * Given the sorted array: [-10,-3,0,5,9],
 *
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 */

public class Solution {
  public TreeNode sortedArrayToBST(int[] nums) {
    TreeNode root = null;
    if (nums.length > 0) {
      root = new TreeNode(nums[nums.length / 2]);
      if (nums.length / 2 > 0) {
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, nums.length / 2));
      }
      if (nums.length / 2 + 1 < nums.length) {
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, nums.length / 2 + 1, nums.length));
      }
    }
    return root;
  }

//public TreeNode sortedArrayToBST(int[] nums) {
//
//    TreeNode root = null;
//
//    if (nums.length > 0) {
//        root = new TreeNode(nums[0]);
//        List<TreeNode> thisLevelSiblings = new ArrayList<>();
//        thisLevelSiblings.add(root);
//
//        int i = 1;
//        while (i < nums.length) {
//            List<TreeNode> nextLevelSiblings = new ArrayList<>();
//            for (int j = 0; j < thisLevelSiblings.size(); j++) {
//                TreeNode thisNode = thisLevelSiblings.get(j);
//                if (i < nums.length) {
//                    TreeNode left = new TreeNode(nums[i++]);
//                    thisNode.left = left;
//                    nextLevelSiblings.add(left);
//                } else {
//                    break;
//                }
//
//                if (i < nums.length) {
//                    TreeNode right = new TreeNode(nums[i++]);
//                    thisNode.right = right;
//                    nextLevelSiblings.add(right);
//                } else {
//                    break;
//                }
//            }
//            thisLevelSiblings = nextLevelSiblings;
//        }
//    }
//
//    return root;
//}
}
