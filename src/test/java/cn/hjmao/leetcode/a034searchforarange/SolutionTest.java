package cn.hjmao.leetcode.a034searchforarange;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by hjmao on 17-2-27.
 */
public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testSearchRange1() throws Exception {
    int[] nums = {5, 7, 7, 8, 8, 10};
    int target = 8;
    int[] expected = {3, 4};
    int[] actual = this.solution.searchRange(nums, target);

    assertEquals(actual, expected);
  }

  @Test
  public void testSearchRange2() throws Exception {
    int[] nums = {};
    int target = 8;
    int[] expected = {-1, -1};
    int[] actual = this.solution.searchRange(nums, target);

    assertEquals(actual, expected);
  }

  @Test
  public void testSearchRange3() throws Exception {
    int[] nums = {0};
    int target = 8;
    int[] expected = {-1, -1};
    int[] actual = this.solution.searchRange(nums, target);

    assertEquals(actual, expected);
  }

  @Test
  public void testSearchRange4() throws Exception {
    int[] nums = {8};
    int target = 8;
    int[] expected = {0, 0};
    int[] actual = this.solution.searchRange(nums, target);

    assertEquals(actual, expected);
  }

  @Test
  public void testSearchRange5() throws Exception {
    int[] nums = {8, 8};
    int target = 8;
    int[] expected = {0, 1};
    int[] actual = this.solution.searchRange(nums, target);

    assertEquals(actual, expected);
  }

  @Test
  public void testSearchRange6() throws Exception {
    int[] nums = {8, 8};
    int target = 9;
    int[] expected = {-1, -1};
    int[] actual = this.solution.searchRange(nums, target);

    assertEquals(actual, expected);
  }
}