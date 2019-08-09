package cn.hjmao.leetcode.a893groupsofspecialequivalentstrings;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testNumSpecialEquivGroups1() {
    String[] a = {"a", "b", "c", "a", "c", "c"};
    int expect = 3;
    int actual = solution.numSpecialEquivGroups(a);
    assertEquals(actual, expect);
  }

  @Test
  public void testNumSpecialEquivGroups2() {
    String[] a = {"aa", "bb", "ab", "ba"};
    int expect = 4;
    int actual = solution.numSpecialEquivGroups(a);
    assertEquals(actual, expect);
  }

  @Test
  public void testNumSpecialEquivGroups3() {
    String[] a = {"abc", "acb", "bac", "bca", "cab", "cba"};
    int expect = 3;
    int actual = solution.numSpecialEquivGroups(a);
    assertEquals(actual, expect);
  }

  @Test
  public void testNumSpecialEquivGroups4() {
    String[] a = {"abcd", "cdab", "adcb", "cbad"};
    int expect = 1;
    int actual = solution.numSpecialEquivGroups(a);
    assertEquals(actual, expect);
  }
}