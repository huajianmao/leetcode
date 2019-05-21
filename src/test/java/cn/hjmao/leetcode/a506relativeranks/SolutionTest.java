package cn.hjmao.leetcode.a506relativeranks;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testFindRelativeRanks1() {
    int[] nums = {5, 4, 3, 2, 1};
    String[] expect = {"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"};
    String[] actual = solution.findRelativeRanks(nums);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindRelativeRanks2() {
    int[] nums = {5};
    String[] expect = {"Gold Medal"};
    String[] actual = solution.findRelativeRanks(nums);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindRelativeRanks3() {
    int[] nums = {};
    String[] expect = {};
    String[] actual = solution.findRelativeRanks(nums);
    assertEquals(actual, expect);
  }
}
