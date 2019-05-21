package cn.hjmao.leetcode.a455assigncookies;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testFindContentChildren1() {
    int[] g = {1, 2, 3};
    int[] s = {1, 1};
    int expect = 1;
    int actual = solution.findContentChildren(g, s);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindContentChildren2() {
    int[] g = {1, 2};
    int[] s = {1, 2, 3};
    int expect = 2;
    int actual = solution.findContentChildren(g, s);
    assertEquals(actual, expect);
  }
}
