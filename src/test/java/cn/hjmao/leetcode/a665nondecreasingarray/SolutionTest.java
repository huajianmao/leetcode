package cn.hjmao.leetcode.a665nondecreasingarray;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testCheckPossibility1() {
    int[] nums = {4, 2, 3};
    boolean actual = solution.checkPossibility(nums);
    assertTrue(actual);
  }

  @Test
  public void testCheckPossibility2() {
    int[] nums = {4, 2, 1};
    boolean actual = solution.checkPossibility(nums);
    assertFalse(actual);
  }

  @Test
  public void testCheckPossibility3() {
    int[] nums = {4};
    boolean actual = solution.checkPossibility(nums);
    assertTrue(actual);
  }

  @Test
  public void testCheckPossibility4() {
    int[] nums = {4, 3};
    boolean actual = solution.checkPossibility(nums);
    assertTrue(actual);
  }
}