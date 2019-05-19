package cn.hjmao.leetcode.a561arraypartitioni;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testArrayPairSum1() {
    int[] nums = {1, 4, 3, 2};
    int expect = 4;
    int actual = solution.arrayPairSum(nums);
    assertEquals(actual, expect);
  }
}