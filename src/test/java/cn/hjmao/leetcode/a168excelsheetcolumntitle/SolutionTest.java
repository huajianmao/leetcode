package cn.hjmao.leetcode.a168excelsheetcolumntitle;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void testConvertToTitle1() {
    int n = 1;
    String expect = "A";
    String actual = solution.convertToTitle(n);
    assertEquals(actual, expect);
  }

  @Test
  public void testConvertToTitle2() {
    int n = 28;
    String expect = "AB";
    String actual = solution.convertToTitle(n);
    assertEquals(actual, expect);
  }

  @Test
  public void testConvertToTitle3() {
    int n = 701;
    String expect = "ZY";
    String actual = solution.convertToTitle(n);
    assertEquals(actual, expect);
  }
}
