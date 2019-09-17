package cn.hjmao.leetcode.a1047removealladjacentduplicatesinstring;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testRemoveDuplicates1() {
    String s = "abbaca";
    String expect = "ca";
    String actual = solution.removeDuplicates(s);
    assertEquals(actual, expect);
  }
}