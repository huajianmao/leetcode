package cn.hjmao.leetcode.a1022sumofroottoleafbinarynumbers;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testSumRootToLeaf1() {
    Integer[] nums = {1,0,1,0,1,0,1};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int expect = 22;
    int actual = solution.sumRootToLeaf(root);
    assertEquals(actual, expect);
  }
}