package cn.hjmao.leetcode.a137singlenumberii;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testSingleNumber1() {
    int[] nums = {2, 2, 3, 2};
    int expect = 3;
    int actual = solution.singleNumber(nums);
    assertEquals(actual, expect);
  }

  @Test
  public void testSingleNumber2() {
    int[] nums = {0, 1, 0, 1, 0, 1, 99};
    int expect = 99;
    int actual = solution.singleNumber(nums);
    assertEquals(actual, expect);
  }
}
