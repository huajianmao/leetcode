package cn.hjmao.leetcode.a482licensekeyformatting;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testLicenseKeyFormatting1() {
    String s = "5F3Z-2e-9-w";
    int k = 4;
    String expect = "5F3Z-2E9W";
    String actual = solution.licenseKeyFormatting(s, k);
    assertEquals(actual, expect);
  }

  @Test
  public void testLicenseKeyFormatting2() {
    String s = "2-5g-3-J";
    int k = 2;
    String expect = "2-5G-3J";
    String actual = solution.licenseKeyFormatting(s, k);
    assertEquals(actual, expect);
  }

  @Test
  public void testLicenseKeyFormatting3() {
    String s = "";
    int k = 2;
    String expect = "";
    String actual = solution.licenseKeyFormatting(s, k);
    assertEquals(actual, expect);
  }

  @Test
  public void testLicenseKeyFormatting4() {
    String s = "a";
    int k = 1;
    String expect = "A";
    String actual = solution.licenseKeyFormatting(s, k);
    assertEquals(actual, expect);
  }

  @Test
  public void testLicenseKeyFormatting5() {
    String s = "5F3Z-2e-9-w";
    int k = 1;
    String expect = "5-F-3-Z-2-E-9-W";
    String actual = solution.licenseKeyFormatting(s, k);
    assertEquals(actual, expect);
  }

  @Test
  public void testLicenseKeyFormatting6() {
    String s = "--a-a-a-a--";
    int k = 2;
    String expect = "AA-AA";
    String actual = solution.licenseKeyFormatting(s, k);
    assertEquals(actual, expect);
  }
}
