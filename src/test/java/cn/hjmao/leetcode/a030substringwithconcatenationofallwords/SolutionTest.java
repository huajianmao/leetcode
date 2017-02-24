package cn.hjmao.leetcode.a030substringwithconcatenationofallwords;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by hjmao on 17-2-24.
 */
public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testFindSubstring1() throws Exception {
    String s = "barfoothefoobarman";
    String[] words = {"foo", "bar"};
    List<Integer> expected = Arrays.asList(0, 9);
    List<Integer> actual = this.solution.findSubstring(s, words);

    assertEquals(actual.size(), expected.size());
    assertEquals(new HashSet<>(actual), new HashSet<>(expected));
  }

  @Test
  public void testFindSubstring2() throws Exception {
    String s = "barfoothefoobarfoo";
    String[] words = {"foo", "bar"};
    List<Integer> expected = Arrays.asList(0, 9, 12);
    List<Integer> actual = this.solution.findSubstring(s, words);

    assertEquals(actual.size(), expected.size());
    assertEquals(new HashSet<>(actual), new HashSet<>(expected));
  }

  @Test
  public void testFindSubstring3() throws Exception {
    String s = "barfoobarthefoobarfoo";
    String[] words = {"foo", "bar", "bar"};
    List<Integer> expected = Arrays.asList(0);
    List<Integer> actual = this.solution.findSubstring(s, words);

    assertEquals(actual.size(), expected.size());
    assertEquals(new HashSet<>(actual), new HashSet<>(expected));
  }
}