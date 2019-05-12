package cn.hjmao.leetcode.a521longestuncommonsubsequencei;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testFindLUSlength1() {
    String a = "aba";
    String b = "cdc";
    int expect = 3;
    int actual = solution.findLUSlength(a, b);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindLUSlength2() {
    String a = "aaa";
    String b = "aaa";
    int expect = -1;
    int actual = solution.findLUSlength(a, b);
    assertEquals(actual, expect);
  }
}