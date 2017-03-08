package cn.hjmao.leetcode.a532kdiffpairsinanarray;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by hjmao on 17-3-8.
 */
public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testFindPairs1() throws Exception {
    int[] nums = {3, 1, 4, 1, 5};
    int k = 2;
    int expected = 2;
    int actual = this.solution.findPairs(nums, k);

    assertEquals(actual, expected);
  }

  @Test
  public void testFindPairs2() throws Exception {
    int[] nums = {1, 2, 3, 4, 5};
    int k = 1;
    int expected = 4;
    int actual = this.solution.findPairs(nums, k);

    assertEquals(actual, expected);
  }

  @Test
  public void testFindPairs3() throws Exception {
    int[] nums = {1, 3, 1, 5, 4};
    int k = 0;
    int expected = 1;
    int actual = this.solution.findPairs(nums, k);

    assertEquals(actual, expected);
  }

  @Test
  public void testFindPairs4() throws Exception {
    int[] nums = {1, 2, 3, 4, 5};
    int k = -1;
    int expected = 0;
    int actual = this.solution.findPairs(nums, k);

    assertEquals(actual, expected);
  }

  @Test
  public void testFindPairs5() throws Exception {
    int[] nums = {1, 1, 1, 1, 1};
    int k = 0;
    int expected = 1;
    int actual = this.solution.findPairs(nums, k);

    assertEquals(actual, expected);
  }

  @Test
  public void testFindPairs6() throws Exception {
    int[] nums = {6, 3, 5, 7, 2, 3, 3, 8, 2, 4};
    int k = 2;
    int expected = 5;
    int actual = this.solution.findPairs(nums, k);

    assertEquals(actual, expected);
  }
}