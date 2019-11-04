package com.leetcode.snippets.a811subdomainvisitcount;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSubdomainVisits1() {
    String[] cpdomains = {"9001 discuss.leetcode.com"};
    List<String> expect = Arrays.asList("9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com");
    List<String> actual = solution.subdomainVisits(cpdomains);
    assertEquals(new HashSet<>(actual), new HashSet<>(expect));
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testSubdomainVisits2() {
    String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
    List<String> expect = Arrays.asList(
        "901 mail.com", "50 yahoo.com",
        "900 google.mail.com",
        "5 wiki.org",
        "5 org",
        "1 intel.mail.com",
        "951 com");
    List<String> actual = solution.subdomainVisits(cpdomains);
    assertEquals(new HashSet<>(actual), new HashSet<>(expect));
  }
}
