package com.leetcode.snippets.a617mergetwobinarytrees;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testMergeTrees() {
    Integer[] nums1 = {1, 3, 2, 5};
    Integer[] nums2 = {2, 1, 3, null, 4, null, 7};
    TreeNode t1 = TreeNodeUtils.fromArray(nums1);
    TreeNode t2 = TreeNodeUtils.fromArray(nums2);

    Integer[] numsExpect = {3, 4, 5, 5, 4, null, 7};
    TreeNode expect =  TreeNodeUtils.fromArray(numsExpect);
    TreeNode actual = solution.mergeTrees(t1, t2);
    assertTrue(TreeNodeUtils.isSameTree(actual, expect));
  }
}
