package cn.hjmao.leetcode.a387firstuniquecharacterinastring;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testFirstUniqChar1() {
    String s = "leetcode";
    int expect = 0;
    int actual = solution.firstUniqChar(s);
    assertEquals(actual, expect);
  }

  @Test
  public void testFirstUniqChar2() {
    String s = "loveleetcode";
    int expect = 2;
    int actual = solution.firstUniqChar(s);
    assertEquals(actual, expect);
  }
}
