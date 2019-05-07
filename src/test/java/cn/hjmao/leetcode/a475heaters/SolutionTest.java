package cn.hjmao.leetcode.a475heaters;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testFindRadius1() {
    int[] houses = {1, 2, 3};
    int[] heaters = {2};
    int expect = 1;
    int actual = solution.findRadius(houses, heaters);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindRadius2() {
    int[] houses = {1, 2, 3, 4};
    int[] heaters = {1, 4};
    int expect = 1;
    int actual = solution.findRadius(houses, heaters);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindRadius3() {
    int[] houses = {1, 2, 3, 40};
    int[] heaters = {1, 4};
    int expect = 36;
    int actual = solution.findRadius(houses, heaters);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindRadius4() {
    int[] houses = {1, 2, 3, 5, 15};
    int[] heaters = {2, 30};
    int expect = 13;
    int actual = solution.findRadius(houses, heaters);
    assertEquals(actual, expect);
  }
}