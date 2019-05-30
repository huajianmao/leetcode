package cn.hjmao.leetcode.a628maximumproductofthreenumbers;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testMaximumProduct1() {
    int[] nums = {1, 2, 3};
    int expect = 6;
    int actual = solution.maximumProduct(nums);
    assertEquals(actual, expect);
  }

  @Test
  public void testMaximumProduct2() {
    int[] nums = {1, 2, 3, 4};
    int expect = 24;
    int actual = solution.maximumProduct(nums);
    assertEquals(actual, expect);
  }

  @Test
  public void testMaximumProduct3() {
    int[] nums = {-10, -2, 3, 4};
    int expect = 80;
    int actual = solution.maximumProduct(nums);
    assertEquals(actual, expect);
  }
}