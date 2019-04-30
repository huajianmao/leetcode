package cn.hjmao.leetcode.mock.question1;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testMostCommonWord1() {
    String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
    String[] banned = {"hit"};
    String expect = "ball";
    String actual = solution.mostCommonWord(paragraph, banned);
    assertEquals(actual, expect);
  }

  @Test
  public void testMostCommonWord2() {
    String paragraph = "a.";
    String[] banned = {};
    String expect = "a";
    String actual = solution.mostCommonWord(paragraph, banned);
    assertEquals(actual, expect);
  }

  @Test
  public void testMostCommonWord3() {
    String paragraph = "Bob. hIt, baLl";
    String[] banned = {"bob", "hit"};
    String expect = "ball";
    String actual = solution.mostCommonWord(paragraph, banned);
    assertEquals(actual, expect);
  }
}
