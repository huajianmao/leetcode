package cn.hjmao.leetcode.a884uncommonwordsfromtwosentences;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testUncommonFromSentences1() {
    String a = "this apple is sweet";
    String b = "this apple is sour";
    String[] expect = {"sweet", "sour"};
    String[] actual = solution.uncommonFromSentences(a, b);
    assertNotNull(actual);
    assertEquals(actual.length, expect.length);
    assertEquals(new HashSet<String>(Arrays.asList(actual)), new HashSet<String>(Arrays.asList(expect)));
  }

  @Test
  public void testUncommonFromSentences2() {
    String a = "apple apple";
    String b = "banana";
    String[] expect = {"banana"};
    String[] actual = solution.uncommonFromSentences(a, b);
    assertNotNull(actual);
    assertEquals(actual.length, expect.length);
    assertEquals(new HashSet<String>(Arrays.asList(actual)), new HashSet<String>(Arrays.asList(expect)));
  }

  @Test
  public void testUncommonFromSentences3() {
    String a = "apple apple";
    String b = "apple banana";
    String[] expect = {"banana"};
    String[] actual = solution.uncommonFromSentences(a, b);
    assertNotNull(actual);
    assertEquals(actual.length, expect.length);
    assertEquals(new HashSet<String>(Arrays.asList(actual)), new HashSet<String>(Arrays.asList(expect)));
  }
}