package cn.hjmao.leetcode.a720longestwordindictionary;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testLongestWord1() {
    String[] words = {"w","wo","wor","worl", "world"};
    String expect = "world";
    String actual = solution.longestWord(words);
    assertEquals(actual, expect);
  }

  @Test
  public void testLongestWord2() {
    String[] words = {"a", "banana", "app", "apz", "appl", "ap", "apply", "apple"};
    String expect = "apple";
    String actual = solution.longestWord(words);
    assertEquals(actual, expect);
  }

  @Test
  public void testLongestWord3() {
    String[] words = {"w", "yz"};
    String expect = "w";
    String actual = solution.longestWord(words);
    assertEquals(actual, expect);
  }
}