package cn.hjmao.leetcode.a572subtreeofanothertree;

import cn.hjmao.utils.tree.TreeNode;
import cn.hjmao.utils.tree.TreeNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testIsSubtree1() {
    Integer[] sNums = {3, 4, 5, 1, 2};
    Integer[] tNums = {4, 1, 2};
    TreeNode s = TreeNodeUtils.fromArray(sNums);
    TreeNode t = TreeNodeUtils.fromArray(tNums);
    boolean actual = solution.isSubtree(s, t);
    assertTrue(actual);
  }

  @Test
  public void testIsSubtree2() {
    Integer[] sNums = {3, 4, 5, 1, 2, null, null, 0};
    Integer[] tNums = {4, 1, 2};
    TreeNode s = TreeNodeUtils.fromArray(sNums);
    TreeNode t = TreeNodeUtils.fromArray(tNums);
    boolean actual = solution.isSubtree(s, t);
    assertFalse(actual);
  }
}
