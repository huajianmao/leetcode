package cn.hjmao.leetcode.a231poweroftwo;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testIsPowerOfTwo1() {
    int n = 1;
    boolean actual = solution.isPowerOfTwo(n);
    assertTrue(actual);
  }

  @Test
  public void testIsPowerOfTwo2() {
    int n = 16;
    boolean actual = solution.isPowerOfTwo(n);
    assertTrue(actual);
  }

  @Test
  public void testIsPowerOfTwo3() {
    int n = 218;
    boolean actual = solution.isPowerOfTwo(n);
    assertFalse(actual);
  }

  @Test
  public void testIsPowerOfTwo4() {
    int n = 0;
    boolean actual = solution.isPowerOfTwo(n);
    assertFalse(actual);
  }

  @Test
  public void testIsPowerOfTwo5() {
    int n = -2147483648;
    boolean actual = solution.isPowerOfTwo(n);
    assertFalse(actual);
  }
}