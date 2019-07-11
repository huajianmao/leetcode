package cn.hjmao.leetcode.a806numberoflinestowritestring;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testNumberOfLines1() {
    int[] widths = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                    10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                    10, 10, 10, 10, 10, 10};
    String s = "abcdefghijklmnopqrstuvwxyz";
    int[] expect = {3, 60};
    int[] actual = solution.numberOfLines(widths, s);
    assertEquals(actual, expect);
  }

  @Test
  public void testNumberOfLines2() {
    int[] widths = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                    10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                    10, 10, 10, 10, 10, 10};
    String s = "bbbcccdddaaa";
    int[] expect = {2, 4};
    int[] actual = solution.numberOfLines(widths, s);
    assertEquals(actual, expect);
  }
}