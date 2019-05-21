package cn.hjmao.leetcode.a485maxconsecutiveones;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testFindMaxConsecutiveOnes1() {
    int[] nums = {1, 1, 0, 1, 1, 1};
    int expect = 3;
    int actual = solution.findMaxConsecutiveOnes(nums);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindMaxConsecutiveOnes2() {
    int[] nums = {0, 0, 0};
    int expect = 0;
    int actual = solution.findMaxConsecutiveOnes(nums);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindMaxConsecutiveOnes3() {
    int[] nums = {0, 0, 0, 1};
    int expect = 1;
    int actual = solution.findMaxConsecutiveOnes(nums);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindMaxConsecutiveOnes4() {
    int[] nums = {1, 0, 0, 0};
    int expect = 1;
    int actual = solution.findMaxConsecutiveOnes(nums);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindMaxConsecutiveOnes5() {
    int[] nums = {1, 0, 0, 0, 1};
    int expect = 1;
    int actual = solution.findMaxConsecutiveOnes(nums);
    assertEquals(actual, expect);
  }
}
