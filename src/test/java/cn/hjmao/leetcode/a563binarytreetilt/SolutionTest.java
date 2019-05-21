package cn.hjmao.leetcode.a563binarytreetilt;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testFindTilt1() {
    Integer[] nums = {1, 2, 3};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int expect = 1;
    int actual = solution.findTilt(root);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindTilt2() {
    Integer[] nums = {1, 2, 3, 4, null, 5};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int expect = 11;
    int actual = solution.findTilt(root);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindTilt3() {
    Integer[] nums = {-8, 3, 0, -8, null, null, null, null, -1, null, 8};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int expect = 18;
    int actual = solution.findTilt(root);
    assertEquals(actual, expect);
  }
}
