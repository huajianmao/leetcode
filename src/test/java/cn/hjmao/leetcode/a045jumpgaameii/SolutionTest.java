package cn.hjmao.leetcode.a045jumpgaameii;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test
  public void testJump() {
    int[] nums = {2, 3, 1, 1, 4};
    int expect = 2;

    int actual = solution.jump(nums);
    assertEquals(actual, expect);
  }
}
