package cn.hjmao.leetcode.a438findallanagramsinastring;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testFindAnagrams1() {
    String s = "cbaebabacd";
    String p = "abc";
    List<Integer> expect = Arrays.asList(0, 6);
    List<Integer> actual = solution.findAnagrams(s, p);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindAnagrams2() {
    String s = "abab";
    String p = "ab";
    List<Integer> expect = Arrays.asList(0, 1, 2);
    List<Integer> actual = solution.findAnagrams(s, p);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindAnagrams3() {
    String s = "aa";
    String p = "bb";
    List<Integer> expect = Arrays.asList();
    List<Integer> actual = solution.findAnagrams(s, p);
    assertEquals(actual, expect);
  }
}