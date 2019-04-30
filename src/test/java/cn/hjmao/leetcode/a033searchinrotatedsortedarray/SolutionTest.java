package cn.hjmao.leetcode.a033searchinrotatedsortedarray;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by hjmao on 26/02/2017.
 */
public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testSearch1() throws Exception {
    int[] nums = {4, 5, 6, 7, 0, 1, 2};
    int target = 4;
    int expected = 0;
    int actual = this.solution.search(nums, target);

    assertEquals(actual, expected);
  }

  @Test
  public void testSearch2() throws Exception {
    int[] nums = {4, 5, 6, 7, 0, 1, 2};
    int target = 5;
    int expected = 1;
    int actual = this.solution.search(nums, target);

    assertEquals(actual, expected);
  }

  @Test
  public void testSearch3() throws Exception {
    int[] nums = {4, 5, 6, 7, 0, 1, 2};
    int target = 7;
    int expected = 3;
    int actual = this.solution.search(nums, target);

    assertEquals(actual, expected);
  }

  @Test
  public void testSearch4() throws Exception {
    int[] nums = {4, 5, 6, 7, 0, 1, 2};
    int target = 0;
    int expected = 4;
    int actual = this.solution.search(nums, target);

    assertEquals(actual, expected);
  }

  @Test
  public void testSearch5() throws Exception {
    int[] nums = {4, 5, 6, 7, 0, 1, 2};
    int target = 1;
    int expected = 5;
    int actual = this.solution.search(nums, target);

    assertEquals(actual, expected);
  }

  @Test
  public void testSearch6() throws Exception {
    int[] nums = {4, 5, 6, 7, 0, 1, 2};
    int target = 2;
    int expected = 6;
    int actual = this.solution.search(nums, target);

    assertEquals(actual, expected);
  }

  @Test
  public void testSearch7() throws Exception {
    int[] nums = {3, 1};
    int target = 4;
    int expected = -1;
    int actual = this.solution.search(nums, target);

    assertEquals(actual, expected);
  }

  @Test
  public void testSearch8() throws Exception {
    int[] nums = {};
    int target = 5;
    int expected = -1;
    int actual = this.solution.search(nums, target);

    assertEquals(actual, expected);
  }

  @Test
  public void testSearch9() throws Exception {
    int[] nums = {1};
    int target = 0;
    int expected = -1;
    int actual = this.solution.search(nums, target);

    assertEquals(actual, expected);
  }

  @Test
  public void testSearch10() throws Exception {
    int[] nums = {4, 5, 6, 7, 8, 1, 2, 3};
    int target = 8;
    int expected = 4;
    int actual = this.solution.search(nums, target);

    assertEquals(actual, expected);
  }

  @Test
  public void testSearch11() throws Exception {
    int[] nums = {5, 1, 3};
    int target = 3;
    int expected = 2;
    int actual = this.solution.search(nums, target);

    assertEquals(actual, expected);
  }
}
