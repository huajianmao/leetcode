package cn.hjmao.leetcode.a993cousinsinbinarytree;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testIsCousins1() {
    Integer[] nums = {1, 2, 3, 4};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int x = 4;
    int y = 3;
    boolean actual = solution.isCousins(root, x, y);
    assertFalse(actual);
  }

  @Test
  public void testIsCousins2() {
    Integer[] nums = {1, 2, 3, null, 4, null, 5};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int x = 5;
    int y = 4;
    boolean actual = solution.isCousins(root, x, y);
    assertTrue(actual);
  }

  @Test
  public void testIsCousins4() {
    Integer[] nums = {1, 2, 3, null, 4};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int x = 2;
    int y = 3;
    boolean actual = solution.isCousins(root, x, y);
    assertFalse(actual);
  }
}