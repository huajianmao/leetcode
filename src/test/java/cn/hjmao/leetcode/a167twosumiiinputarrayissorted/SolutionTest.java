package cn.hjmao.leetcode.a167twosumiiinputarrayissorted;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void testTwoSum1() {
    int[] numbers = {2, 7, 11, 15};
    int target = 9;

    int[] expected = {1, 2};
    int[] actual = solution.twoSum(numbers, target);
    assertEquals(actual, expected);
  }
}
