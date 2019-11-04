package com.leetcode.snippets.a917reverseonlyletters;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testReverseOnlyLetters1() {
    String s = "ab-cd";
    String expect = "dc-ba";
    String actual = solution.reverseOnlyLetters(s);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testReverseOnlyLetters2() {
    String s = "a-bC-dEf-ghIj";
    String expect = "j-Ih-gfE-dCba";
    String actual = solution.reverseOnlyLetters(s);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testReverseOnlyLetters3() {
    String s = "Test1ng-Leet=code-Q!";
    String expect = "Qedo1ct-eeLg=ntse-T!";
    String actual = solution.reverseOnlyLetters(s);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testReverseOnlyLetters4() {
    String s = "ab";
    String expect = "ba";
    String actual = solution.reverseOnlyLetters(s);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testReverseOnlyLetters5() {
    String s = "";
    String expect = "";
    String actual = solution.reverseOnlyLetters(s);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testReverseOnlyLetters6() {
    String s = "-";
    String expect = "-";
    String actual = solution.reverseOnlyLetters(s);
    assertEquals(actual, expect);
  }
}
