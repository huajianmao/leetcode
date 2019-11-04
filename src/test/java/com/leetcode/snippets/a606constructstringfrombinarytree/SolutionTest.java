package com.leetcode.snippets.a606constructstringfrombinarytree;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testTree2str1() {
    Integer[] nums = {1, 2, 3, 4};
    TreeNode t = TreeNodeUtils.fromArray(nums);
    String expect = "1(2(4))(3)";
    String actual = solution.tree2str(t);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testTree2str2() {
    Integer[] nums = {1, 2, 3, null, 4};
    TreeNode t = TreeNodeUtils.fromArray(nums);
    String expect = "1(2()(4))(3)";
    String actual = solution.tree2str(t);
    assertEquals(actual, expect);
  }
}
