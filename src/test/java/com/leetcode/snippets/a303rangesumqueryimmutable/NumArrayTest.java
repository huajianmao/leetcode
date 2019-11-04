package com.leetcode.snippets.a303rangesumqueryimmutable;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NumArrayTest {

  @Test (enabled = NumArray.SOLUTION_DONE)
  public void testSumRange1() {
    int[] nums = {-2, 0, 3, -5, 2, -1};
    NumArray numArray = new NumArray(nums);
    assertEquals(numArray.sumRange(0, 2), 1);
    assertEquals(numArray.sumRange(2, 5), -1);
    assertEquals(numArray.sumRange(0, 5), -3);
  }

  @Test (enabled = NumArray.SOLUTION_DONE)
  public void testSumRange2() {
    // int[] nums = {};
    // NumArray numArray = new NumArray(nums);
  }
}
