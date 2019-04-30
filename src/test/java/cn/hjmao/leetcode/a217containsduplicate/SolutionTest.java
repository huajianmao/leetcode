package cn.hjmao.leetcode.a217containsduplicate;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testContainsDuplicate1() {
    int[] nums = {1, 2, 3, 1};
    boolean actual = solution.containsDuplicate(nums);
    assertTrue(actual);
  }

  @Test
  public void testContainsDuplicate2() {
    int[] nums = {1, 2, 3, 4};
    boolean actual = solution.containsDuplicate(nums);
    assertFalse(actual);
  }

  @Test
  public void testContainsDuplicate3() {
    int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
    boolean actual = solution.containsDuplicate(nums);
    assertTrue(actual);
  }

  @Test
  public void testContainsDuplicate4() {
    int[] nums = {3, 3};
    boolean actual = solution.containsDuplicate(nums);
    assertTrue(actual);
  }
}
