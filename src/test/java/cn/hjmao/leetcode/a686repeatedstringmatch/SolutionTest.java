package cn.hjmao.leetcode.a686repeatedstringmatch;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testRepeatedStringMatch1() {
    String a = "abcd";
    String b = "cdabcdab";
    int expect = 3;
    int actual = solution.repeatedStringMatch(a, b);
    assertEquals(actual, expect);
  }

  @Test
  public void testRepeatedStringMatch2() {
    String a = "a";
    String b = "aa";
    int expect = 2;
    int actual = solution.repeatedStringMatch(a, b);
    assertEquals(actual, expect);
  }

  @Test
  public void testRepeatedStringMatch3() {
    String a = "a";
    String b = "aaaa";
    int expect = 4;
    int actual = solution.repeatedStringMatch(a, b);
    assertEquals(actual, expect);
  }

  @Test
  public void testRepeatedStringMatch4() {
    String a = "b";
    String b = "aaaa";
    int expect = -1;
    int actual = solution.repeatedStringMatch(a, b);
    assertEquals(actual, expect);
  }

  @Test
  public void testRepeatedStringMatch5() {
    String a = "cdabdab";
    String b = "abcd";
    int expect = 2;
    int actual = solution.repeatedStringMatch(a, b);
    assertEquals(actual, expect);
  }

  @Test
  public void testRepeatedStringMatch6() {
    String a = "abccb";
    String b = "cbabccb";
    int expect = 2;
    int actual = solution.repeatedStringMatch(a, b);
    assertEquals(actual, expect);
  }
}