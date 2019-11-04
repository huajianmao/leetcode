package com.leetcode.snippets.a257binarytreepaths;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testBinaryTreePaths1() {
    Integer[] nums = {1, 2, 3, null, 5};
    TreeNode root = TreeNodeUtils.fromArray(nums);
    String[] expectArray =  {"1->2->5", "1->3"};
    List<String> expect = Arrays.asList(expectArray);
    List<String> actual = solution.binaryTreePaths(root);
    assertEquals(actual, expect);
  }
}
