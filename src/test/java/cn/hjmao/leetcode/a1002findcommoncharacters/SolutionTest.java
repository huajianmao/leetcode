package cn.hjmao.leetcode.a1002findcommoncharacters;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testCommonChars1() {
    String[] a = {"bella", "label", "roller"};
    List<String> expect = Arrays.asList(new String[]{"e", "l", "l"});
    List<String> actual = solution.commonChars(a);
    assertEquals(actual, expect);
  }

  @Test
  public void testCommonChars21() {
    String[] a = {"cool","lock","cook"};
    List<String> expect = Arrays.asList(new String[]{"c","o"});
    List<String> actual = solution.commonChars(a);
    assertEquals(actual, expect);
  }
}