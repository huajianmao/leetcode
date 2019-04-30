package cn.hjmao.leetcode.a108convertsortedarraytobinarysearchtree;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testSortedArrayToBST() {
    int[] nums = {-10, -3, 0, 5, 9};
    Integer[] treenums = {0, -3, 9, -10, null, 5};

    TreeNode expect = TreeNodeUtils.fromArray(treenums);
    TreeNode actual = solution.sortedArrayToBST(nums);
  }
}
