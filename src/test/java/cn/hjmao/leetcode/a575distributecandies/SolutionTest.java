package cn.hjmao.leetcode.a575distributecandies;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testDistributeCandies1() {
    int[] candies = {1, 1, 2, 2, 3, 3};
    int expect = 3;
    int actual = solution.distributeCandies(candies);
    assertEquals(actual, expect);
  }

  @Test
  public void testDistributeCandies2() {
    int[] candies = {1, 1, 2, 3};
    int expect = 2;
    int actual = solution.distributeCandies(candies);
    assertEquals(actual, expect);
  }

  @Test
  public void testDistributeCandies3() {
    int[] candies = {1, 2, 4, 3};
    int expect = 2;
    int actual = solution.distributeCandies(candies);
    assertEquals(actual, expect);
  }
}
