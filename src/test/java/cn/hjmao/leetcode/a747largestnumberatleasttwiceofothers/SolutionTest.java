package cn.hjmao.leetcode.a747largestnumberatleasttwiceofothers;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testDominantIndex1() {
    int[] nums = {3, 6, 1, 0};
    int expect = 1;
    int actual = solution.dominantIndex(nums);
    assertEquals(actual, expect);
  }

  @Test
  public void testDominantIndex2() {
    int[] nums = {1, 2, 3, 4};
    int expect = -1;
    int actual = solution.dominantIndex(nums);
    assertEquals(actual, expect);
  }

  @Test
  public void testDominantIndex3() {
    int[] nums = {1};
    int expect = 0;
    int actual = solution.dominantIndex(nums);
    assertEquals(actual, expect);
  }

  @Test
  public void testDominantIndex4() {
    int[] nums = {1, 2};
    int expect = 1;
    int actual = solution.dominantIndex(nums);
    assertEquals(actual, expect);
  }

  @Test
  public void testDominantIndex5() {
    int[] nums = {2, 2};
    int expect = -1;
    int actual = solution.dominantIndex(nums);
    assertEquals(actual, expect);
  }
}