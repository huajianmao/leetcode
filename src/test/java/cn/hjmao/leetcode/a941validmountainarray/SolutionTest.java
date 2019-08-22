package cn.hjmao.leetcode.a941validmountainarray;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testValidMountainArray1() {
    int[] a = {2, 1};
    boolean actual = solution.validMountainArray(a);
    assertFalse(actual);
  }

  @Test
  public void testValidMountainArray2() {
    int[] a = {3, 5, 5};
    boolean actual = solution.validMountainArray(a);
    assertFalse(actual);
  }

  @Test
  public void testValidMountainArray3() {
    int[] a = {0, 3, 2, 1};
    boolean actual = solution.validMountainArray(a);
    assertTrue(actual);
  }

  @Test
  public void testValidMountainArray4() {
    int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    boolean actual = solution.validMountainArray(a);
    assertFalse(actual);
  }
}