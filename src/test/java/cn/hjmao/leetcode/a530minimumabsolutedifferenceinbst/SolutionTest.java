package cn.hjmao.leetcode.a530minimumabsolutedifferenceinbst;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testGetMinimumDifference1() {
    Integer[] tree = {1, null, 3, 2, null};
    TreeNode root = TreeNodeUtils.fromArray(tree);
    int expect = 1;
    int actual = solution.getMinimumDifference(root);
    assertEquals(actual, expect);
  }

  @Test
  public void testGetMinimumDifference2() {
    Integer[] tree = {3, 1, 4, 0, 3};
    TreeNode root = TreeNodeUtils.fromArray(tree);
    int expect = 0;
    int actual = solution.getMinimumDifference(root);
    assertEquals(actual, expect);
  }

  @Test
  public void testGetMinimumDifference3() {
    Integer[] tree = {0, null, 2236, 1277, 2776, 519};
    TreeNode root = TreeNodeUtils.fromArray(tree);
    int expect = 519;
    int actual = solution.getMinimumDifference(root);
    assertEquals(actual, expect);
  }
}
