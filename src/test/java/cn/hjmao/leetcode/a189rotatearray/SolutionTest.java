package cn.hjmao.leetcode.a189rotatearray;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testRotate1() {
    int[] nums = {1, 2, 3, 4, 5, 6, 7};
    int k = 3;

    int[] expect = {5, 6, 7, 1, 2, 3, 4};
    solution.rotate(nums, k);
    assertEquals(nums, expect);
  }

  @Test
  public void testRotate2() {
    int[] nums = {-1, -100, 3, 99};
    int k = 2;

    int[] expect = {3, 99, -1, -100};
    solution.rotate(nums, k);
    assertEquals(nums, expect);
  }
}