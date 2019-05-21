package cn.hjmao.leetcode.a110balancedbinarytree;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testIsBalanced0() {
    Integer[] array = {1};
    TreeNode root = TreeNodeUtils.fromArray(array);
    boolean expect = true;
    boolean actual = solution.isBalanced(root);

    assertEquals(actual, expect);
  }

  @Test
  public void testIsBalanced1() {
    Integer[] array = {3, 9, 20, null, null, 15, 7};
    TreeNode root = TreeNodeUtils.fromArray(array);
    boolean expect = true;
    boolean actual = solution.isBalanced(root);

    assertEquals(actual, expect);
  }

  @Test
  public void testIsBalanced2() {
    Integer[] array = {1, 2, 2, 3, 3, null, null, 4, 4};
    TreeNode root = TreeNodeUtils.fromArray(array);
    boolean expect = false;
    boolean actual = solution.isBalanced(root);

    assertEquals(actual, expect);
  }

  @Test
  public void testIsBalanced3() {
    Integer[] array = {1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, null, null, 5, 5};
    TreeNode root = TreeNodeUtils.fromArray(array);
    boolean expect = false;
    boolean actual = solution.isBalanced(root);

    assertEquals(actual, expect);
  }

  @Test
  public void testIsBalanced4() {
    Integer[] array = {1, 2, 2, 3, null, null, 3, 4, null, null, 4};
    TreeNode root = TreeNodeUtils.fromArray(array);
    boolean expect = false;
    boolean actual = solution.isBalanced(root);

    assertEquals(actual, expect);
  }
}
