package cn.hjmao.leetcode.a929uniqueemailaddresses;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testNumUniqueEmails1() {
    String[] emails = {"test.email+alex@leetcode.com",
                       "test.e.mail+bob.cathy@leetcode.com",
                       "testemail+david@lee.tcode.com"};
    int expect = 2;
    int actual = solution.numUniqueEmails(emails);
    assertEquals(actual, expect);
  }

  @Test
  public void testNumUniqueEmails2() {
    String[] emails = {"test.email@leetcode.com",
                       "test.e.mail+bob.cathy@leetcode.com",
                       "testemail+david@lee.tcode.com"};
    int expect = 2;
    int actual = solution.numUniqueEmails(emails);
    assertEquals(actual, expect);
  }
}