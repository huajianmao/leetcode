package cn.hjmao.leetcode.a290wordpattern;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testWordPattern1() {
    String pattern = "abba";
    String str = "dog cat cat dog";
    boolean actual = solution.wordPattern(pattern, str);
    assertTrue(actual);
  }

  @Test
  public void testWordPattern2() {
    String pattern = "abba";
    String str = "dog cat cat fish";
    boolean actual = solution.wordPattern(pattern, str);
    assertFalse(actual);
  }

  @Test
  public void testWordPattern3() {
    String pattern = "aaaa";
    String str = "dog cat cat dog";
    boolean actual = solution.wordPattern(pattern, str);
    assertFalse(actual);
  }

  @Test
  public void testWordPattern4() {
    String pattern = "abba";
    String str = "dog dog dog dog";
    boolean actual = solution.wordPattern(pattern, str);
    assertFalse(actual);
  }
}
