package cn.hjmao.leetcode.a949largesttimeforgivendigits;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testLargestTimeFromDigits1() {
    int[] a = {1, 2, 3, 4};
    String expect = "23:41";
    String actual = solution.largestTimeFromDigits(a);
    assertEquals(actual, expect);
  }

  @Test
  public void testLargestTimeFromDigits2() {
    int[] a = {5, 5, 5, 5};
    String expect = "";
    String actual = solution.largestTimeFromDigits(a);
    assertEquals(actual, expect);
  }

  @Test
  public void testLargestTimeFromDigits3() {
    int[] a = {0, 4, 0, 0};
    String expect = "04:00";
    String actual = solution.largestTimeFromDigits(a);
    assertEquals(actual, expect);
  }
}
