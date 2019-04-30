package cn.hjmao.leetcode.a005longestpalindromicsubstring;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by hjmao on 18/01/2017.
 */
public class SolutionTest {
  private Solution solution;

  @BeforeMethod
  public void setUp() throws Exception {
    this.solution = new Solution();
  }

  @Test
  public void testLongestPalindrome1() throws Exception {
    String s = "babad";
    String expected1 = "bab";
    String expected2 = "aba";

    String palindrome = this.solution.longestPalindrome(s);
    assertTrue(expected1.equals(palindrome) || expected2.equals(palindrome));
  }

  @Test
  public void testLongestPalindrome2() throws Exception {
    String s = "cbbd";
    String expected = "bb";

    assertEquals(this.solution.longestPalindrome(s), expected);
  }

  @Test
  public void testLongestPalindrome3() throws Exception {
    String s = new String(new char[1000]).replace("\0", "c");
    String expected = s;

    assertEquals(this.solution.longestPalindrome(s), expected);
  }

  @Test
  public void testLongestPalindromeMine1() throws Exception {
    String s = "c";
    String expected = "c";

    assertEquals(this.solution.longestPalindrome(s), expected);
  }

  @Test
  public void testLongestPalindromeMine2() throws Exception {
    String s = "aaaaaaaaaaaaa";
    String expected = "aaaaaaaaaaaaa";

    assertEquals(this.solution.longestPalindrome(s), expected);
  }

  @Test
  public void testLongestPalindromeMine3() throws Exception {
    String s = "abcdefgfedcba";
    String expected = "abcdefgfedcba";

    assertEquals(this.solution.longestPalindrome(s), expected);
  }

  @Test
  public void testLongestPalindromeMine4() throws Exception {
    String s = "abcdeffedcba";
    String expected = "abcdeffedcba";

    assertEquals(this.solution.longestPalindrome(s), expected);
  }
}