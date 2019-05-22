package cn.hjmao.leetcode.a594longestharmonioussubsequence;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testFindLHS1() {
    int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
    int expect = 5;
    int actual = solution.findLHS(nums);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindLHS2() {
    int[] nums = null;
    int expect = 0;
    int actual = solution.findLHS(nums);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindLHS3() {
    int[] nums = {};
    int expect = 0;
    int actual = solution.findLHS(nums);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindLHS4() {
    int[] nums = {1};
    int expect = 0;
    int actual = solution.findLHS(nums);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindLHS5() {
    int[] nums = {1, 2};
    int expect = 2;
    int actual = solution.findLHS(nums);
    assertEquals(actual, expect);
  }
}