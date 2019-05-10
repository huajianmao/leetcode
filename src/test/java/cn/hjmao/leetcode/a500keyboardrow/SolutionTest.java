package cn.hjmao.leetcode.a500keyboardrow;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testFindWords1() {
    String[] words = {"Hello", "Alaska", "Dad", "Peace"};
    String[] expect = {"Alaska", "Dad"};
    String[] actual = solution.findWords(words);
    assertEquals(actual, expect);
  }
}