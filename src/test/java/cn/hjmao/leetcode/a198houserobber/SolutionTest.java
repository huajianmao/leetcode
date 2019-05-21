package cn.hjmao.leetcode.a198houserobber;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testRob1() {
    int[] nums = {1, 2, 3, 1};
    int expect = 4;
    int actual = solution.rob(nums);
    assertEquals(actual, expect);
  }

  @Test
  public void testRob2() {
    int[] nums = {2, 7, 9, 3, 1};
    int expect = 12;
    int actual = solution.rob(nums);
    assertEquals(actual, expect);
  }

  @Test
  public void testRob3() {
    int[] nums = {2, 1, 1, 2};
    int expect = 4;
    int actual = solution.rob(nums);
    assertEquals(actual, expect);
  }
}
