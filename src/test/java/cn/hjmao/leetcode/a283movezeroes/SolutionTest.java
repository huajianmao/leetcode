package cn.hjmao.leetcode.a283movezeroes;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testMoveZeroes1() {
    int[] nums = {0, 1, 0, 3, 12};
    int[] expect = {1, 3, 12, 0, 0};
    solution.moveZeroes(nums);
    assertEquals(nums, expect);
  }

  @Test
  public void testMoveZeroes2() {
    int[] nums = {1};
    int[] expect = {1};
    solution.moveZeroes(nums);
    assertEquals(nums, expect);
  }
}
