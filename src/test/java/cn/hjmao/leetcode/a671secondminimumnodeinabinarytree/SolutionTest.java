package cn.hjmao.leetcode.a671secondminimumnodeinabinarytree;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testFindSecondMinimumValue1() {
    Integer[] nums = {2, 2, 5, null, null, 5, 7};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int expect = 5;
    int actual = solution.findSecondMinimumValue(root);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindSecondMinimumValue2() {
    Integer[] nums = {2, 2, 2};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int expect = -1;
    int actual = solution.findSecondMinimumValue(root);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindSecondMinimumValue3() {
    Integer[] nums = {2, 2, 5, 2, 3, 5, 7};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int expect = 3;
    int actual = solution.findSecondMinimumValue(root);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindSecondMinimumValue4() {
    Integer[] nums = {2, 2, 3, 2, 5, 3, 7};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int expect = 3;
    int actual = solution.findSecondMinimumValue(root);
    assertEquals(actual, expect);
  }
}