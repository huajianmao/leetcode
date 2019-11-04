package com.leetcode.snippets.a687longestunivaluepath;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testLongestUnivaluePath0() {
    int expect = 0;
    int actual = solution.longestUnivaluePath(null);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testLongestUnivaluePath1() {
    Integer[] nums = {5, 4, 5, 1, 1, null, 5};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int expect = 2;
    int actual = solution.longestUnivaluePath(root);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testLongestUnivaluePath2() {
    Integer[] nums = {1, 4, 5, 4, 4, null, 5};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int expect = 2;
    int actual = solution.longestUnivaluePath(root);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testLongestUnivaluePath3() {
    Integer[] nums = {4, 4, 4, 4, 4, null, 5};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int expect = 3;
    int actual = solution.longestUnivaluePath(root);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testLongestUnivaluePath4() {
    Integer[] nums = {1, 2, 3, 4, null, 5};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int expect = 0;
    int actual = solution.longestUnivaluePath(root);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testLongestUnivaluePath5() {
    Integer[] nums = {5, 5, 5, 1, 5, null, 5};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int expect = 4;
    int actual = solution.longestUnivaluePath(root);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testLongestUnivaluePath6() {
    Integer[] nums = {1, null, 1, 1, 1, 1, 1, 1};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    int expect = 4;
    int actual = solution.longestUnivaluePath(root);
    assertEquals(actual, expect);
  }
}
