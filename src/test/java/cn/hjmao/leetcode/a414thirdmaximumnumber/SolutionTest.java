package cn.hjmao.leetcode.a414thirdmaximumnumber;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testThirdMax1() {
    int[] nums = {3, 2, 1};
    int expect = 1;
    int actual = solution.thirdMax(nums);
    assertEquals(actual, expect);
  }

  @Test
  public void testThirdMax2() {
    int[] nums = {1, 2};
    int expect = 2;
    int actual = solution.thirdMax(nums);
    assertEquals(actual, expect);
  }

  @Test
  public void testThirdMax3() {
    int[] nums = {2, 2, 3, 1};
    int expect = 1;
    int actual = solution.thirdMax(nums);
    assertEquals(actual, expect);
  }

  @Test
  public void testThirdMax4() {
    int[] nums = {2, 2, 3};
    int expect = 3;
    int actual = solution.thirdMax(nums);
    assertEquals(actual, expect);
  }

  @Test
  public void testThirdMax5() {
    int[] nums = {5,2,4,1,3,6,0};
    int expect = 4;
    int actual = solution.thirdMax(nums);
    assertEquals(actual, expect);
  }
}