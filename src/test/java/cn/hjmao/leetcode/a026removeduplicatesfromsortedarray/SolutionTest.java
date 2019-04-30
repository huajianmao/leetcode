package cn.hjmao.leetcode.a026removeduplicatesfromsortedarray;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by hjmao on 16/02/2017.
 */
public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testRemoveDuplicates1() throws Exception {
    int[] nums = {1, 1, 2};
    int expected = 2;

    int actual = this.solution.removeDuplicates(nums);
    assertEquals(actual, expected);
  }

  @Test
  public void testRemoveDuplicates2() throws Exception {
    int[] nums = {1};
    int expected = 1;

    int actual = this.solution.removeDuplicates(nums);
    assertEquals(actual, expected);
  }

  @Test
  public void testRemoveDuplicates3() throws Exception {
    int[] nums = {};
    int expected = 0;

    int actual = this.solution.removeDuplicates(nums);
    assertEquals(actual, expected);
  }
}
