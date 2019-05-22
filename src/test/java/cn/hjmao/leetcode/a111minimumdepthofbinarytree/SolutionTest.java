package cn.hjmao.leetcode.a111minimumdepthofbinarytree;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testMinDepth1() {
    Integer[] nums = {3, 9, 20, null, null, 15, 7};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int expect = 2;
    int actual = solution.minDepth(root);
    assertEquals(actual, expect);
  }
}