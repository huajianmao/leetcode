package cn.hjmao.leetcode.a1013partitionarrayintothreepartswithequalsum;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testCanThreePartsEqualSum1() {
    int[] a = {0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1};
    boolean actual = solution.canThreePartsEqualSum(a);
    assertTrue(actual);
  }

  @Test
  public void testCanThreePartsEqualSum2() {
    int[] a = {0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1};
    boolean actual = solution.canThreePartsEqualSum(a);
    assertFalse(actual);
  }

  @Test
  public void testCanThreePartsEqualSum3() {
    int[] a = {3, 3, 6, 5, -2, 2, 5, 1, -9, 4};
    boolean actual = solution.canThreePartsEqualSum(a);
    assertTrue(actual);
  }

  @Test
  public void testCanThreePartsEqualSum4() {
    int[] a = {18, 12, -18, 18, -19, -1, 10, 10};
    boolean actual = solution.canThreePartsEqualSum(a);
    assertTrue(actual);
  }
}