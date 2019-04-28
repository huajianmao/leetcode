package cn.hjmao.leetcode.a404sumofleftleaves;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testSumOfLeftLeaves1() {
    Integer[] nums = {3, 9, 20, null, null, 15, 7};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int expect = 24;
    int actual = solution.sumOfLeftLeaves(root);
    assertEquals(actual, expect);
  }
}