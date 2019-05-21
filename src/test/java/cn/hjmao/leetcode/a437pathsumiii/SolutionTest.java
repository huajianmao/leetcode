package cn.hjmao.leetcode.a437pathsumiii;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testPathSum1() {
    Integer[] treeValues = {10, 5, -3, 3, 2, null, 11, 3, -2, null, 1};
    TreeNode root = TreeNodeUtils.fromArray(treeValues);
    int sum = 8;
    int expect = 3;
    int actual = solution.pathSum(root, sum);
    assertEquals(actual, expect);
  }
}
