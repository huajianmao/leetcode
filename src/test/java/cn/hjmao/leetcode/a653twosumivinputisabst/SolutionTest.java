package cn.hjmao.leetcode.a653twosumivinputisabst;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testFindTarget1() {
    Integer[] nums = {5, 3, 6, 2, 4, null, 7};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int k = 9;
    boolean actual = solution.findTarget(root, k);
    assertTrue(actual);
  }

  @Test
  public void testFindTarget2() {
    Integer[] nums = {5, 3, 6, 2, 4, null, 7};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int k = 28;
    boolean actual = solution.findTarget(root, k);
    assertFalse(actual);
  }

  @Test
  public void testFindTarget3() {
    Integer[] nums = {1};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int k = 2;
    boolean actual = solution.findTarget(root, k);
    assertFalse(actual);
  }
}