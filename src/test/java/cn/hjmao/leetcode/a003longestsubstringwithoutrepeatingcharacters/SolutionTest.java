package cn.hjmao.leetcode.a003longestsubstringwithoutrepeatingcharacters;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by hjmao on 17-2-7.
 */
public class SolutionTest {
  private Solution solution;

  @BeforeMethod
  public void setUp() throws Exception {
    this.solution = new Solution();
  }

  @Test
  public void testLengthOfLongestSubstring1() throws Exception {
    String s = "abcabcbb";
    int expected = 3;
    assertEquals(this.solution.lengthOfLongestSubstring(s), expected);
  }

  @Test
  public void testLengthOfLongestSubstring2() throws Exception {
    String s = "bbbbb";
    int expected = 1;
    assertEquals(this.solution.lengthOfLongestSubstring(s), expected);
  }

  @Test
  public void testLengthOfLongestSubstring3() throws Exception {
    String s = "pwwkew";
    int expected = 3;
    assertEquals(this.solution.lengthOfLongestSubstring(s), expected);
  }
}
