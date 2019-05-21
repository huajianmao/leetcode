package cn.hjmao.leetcode.a448findallnumbersdisappearedinanarray;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testFindDisappearedNumbers1() {
    int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
    List<Integer> expect = Arrays.asList(5, 6);
    List<Integer> actual = solution.findDisappearedNumbers(nums);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindDisappearedNumbers2() {
    int[] nums = {4, 3, 2, 4, 8, 2, 3, 1};
    List<Integer> expect = Arrays.asList(5, 6, 7);
    List<Integer> actual = solution.findDisappearedNumbers(nums);
    assertEquals(actual, expect);
  }
}
