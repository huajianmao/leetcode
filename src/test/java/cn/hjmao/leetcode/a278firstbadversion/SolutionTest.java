package cn.hjmao.leetcode.a278firstbadversion;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testFirstBadVersion1() {
    int n = 5;
    int expect = 4;
    solution.setFirst(expect);
    int actual = solution.firstBadVersion(n);
    assertEquals(actual, expect);
  }

  @Test
  public void testFirstBadVersion2() {
    int n = 2126753390;
    int expect = 1702766719;
    solution.setFirst(expect);
    int actual = solution.firstBadVersion(n);
    assertEquals(actual, expect);
  }
}