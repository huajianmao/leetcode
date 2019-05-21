package cn.hjmao.leetcode.a345reversevowelsofastring;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testReverseVowels1() {
    String s = "hello";
    String expect = "holle";
    String actual = solution.reverseVowels(s);
    assertEquals(actual, expect);
  }

  @Test
  public void testReverseVowels2() {
    String s = "leetcode";
    String expect = "leotcede";
    String actual = solution.reverseVowels(s);
    assertEquals(actual, expect);
  }

  @Test
  public void testReverseVowels3() {
    String s = "OE";
    String expect = "EO";
    String actual = solution.reverseVowels(s);
    assertEquals(actual, expect);
  }

  @Test
  public void testReverseVowels4() {
    String s = "cd";
    String expect = "cd";
    String actual = solution.reverseVowels(s);
    assertEquals(actual, expect);
  }

  @Test
  public void testReverseVowels5() {
    String s = " ";
    String expect = " ";
    String actual = solution.reverseVowels(s);
    assertEquals(actual, expect);
  }
}
