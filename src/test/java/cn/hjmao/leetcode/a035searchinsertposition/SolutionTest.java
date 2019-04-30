package cn.hjmao.leetcode.a035searchinsertposition;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by hjmao on 17-2-22.
 */
public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testSearchInsert1() throws Exception {
    int[] nums = {1, 3, 5, 6};
    int target = 5;
    int expected = 2;
    int actual = this.solution.searchInsert(nums, target);

    assertEquals(actual, expected);
  }

  @Test
  public void testSearchInsert2() throws Exception {
    int[] nums = {1, 3, 5, 6};
    int target = 2;
    int expected = 1;
    int actual = this.solution.searchInsert(nums, target);

    assertEquals(actual, expected);
  }

  @Test
  public void testSearchInsert3() throws Exception {
    int[] nums = {1, 3, 5, 6};
    int target = 7;
    int expected = 4;
    int actual = this.solution.searchInsert(nums, target);

    assertEquals(actual, expected);
  }

  @Test
  public void testSearchInsert4() throws Exception {
    int[] nums = {1, 3, 5, 6};
    int target = 0;
    int expected = 0;
    int actual = this.solution.searchInsert(nums, target);

    assertEquals(actual, expected);
  }
}
