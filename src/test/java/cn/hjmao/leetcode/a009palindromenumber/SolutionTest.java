package cn.hjmao.leetcode.a009palindromenumber;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by hjmao on 19/01/2017.
 */
public class SolutionTest {
  private Solution solution;

  @BeforeMethod
  public void setUp() throws Exception {
    this.solution = new Solution();
  }

  @Test
  public void testIsPalindrome0() throws Exception {
    int x = 0;
    boolean expected = true;

    assertEquals(this.solution.isPalindrome(x), expected);
  }

  @Test
  public void testIsPalindrome1() throws Exception {
    int x = 1;
    boolean expected = true;

    assertEquals(this.solution.isPalindrome(x), expected);
  }

  @Test
  public void testIsPalindrome2() throws Exception {
    int x = 12321;
    boolean expected = true;

    assertEquals(this.solution.isPalindrome(x), expected);
  }

  @Test
  public void testIsPalindrome3() throws Exception {
    int x = 123321;
    boolean expected = true;

    assertEquals(this.solution.isPalindrome(x), expected);
  }

  @Test
  public void testIsPalindrome4() throws Exception {
    int x = -123321;
    boolean expected = false;

    assertEquals(this.solution.isPalindrome(x), expected);
  }

  @Test
  public void testIsPalindrome5() throws Exception {
    int x = -12321;
    boolean expected = false;

    assertEquals(this.solution.isPalindrome(x), expected);
  }

  @Test
  public void testIsPalindrome6() throws Exception {
    int x = -2147447412;
    boolean expected = false;

    assertEquals(this.solution.isPalindrome(x), expected);
  }

  @Test
  public void testIsPalindrome7() throws Exception {
    int x = 20;
    boolean expected = false;

    assertEquals(this.solution.isPalindrome(x), expected);
  }
}