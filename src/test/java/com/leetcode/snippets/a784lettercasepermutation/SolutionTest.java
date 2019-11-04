package com.leetcode.snippets.a784lettercasepermutation;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testLetterCasePermutation1() {
    String s = "a1b2";
    List<String> expect = Arrays.asList("a1b2", "a1B2", "A1b2", "A1B2");
    List<String> actual = solution.letterCasePermutation(s);
    assertEquals(new HashSet<>(actual), new HashSet<>(expect));
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testLetterCasePermutation2() {
    String s = "3z4";
    List<String> expect = Arrays.asList("3z4", "3Z4");
    List<String> actual = solution.letterCasePermutation(s);
    assertEquals(new HashSet<>(actual), new HashSet<>(expect));
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testLetterCasePermutation3() {
    String s = "12345";
    List<String> expect = Arrays.asList("12345");
    List<String> actual = solution.letterCasePermutation(s);
    assertEquals(new HashSet<>(actual), new HashSet<>(expect));
  }
}
