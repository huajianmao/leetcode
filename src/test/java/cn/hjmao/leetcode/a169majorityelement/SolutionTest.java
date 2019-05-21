package cn.hjmao.leetcode.a169majorityelement;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test
  public void testMajorityElement1() {
    int[] nums = {3, 2, 3};
    int expect = 3;

    int actual = solution.majorityElement(nums);
    assertEquals(actual, expect);
  }

  @Test
  public void testMajorityElement2() {
    int[] nums = {2, 2, 1, 1, 1, 2, 2};
    int expect = 2;

    int actual = solution.majorityElement(nums);
    assertEquals(actual, expect);
  }
}
