package cn.hjmao.leetcode.a693binarynumberwithalternatingbits;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testHasAlternatingBits1() {
    int n = 5;
    boolean actual = solution.hasAlternatingBits(n);
    assertTrue(actual);
  }

  @Test
  public void testHasAlternatingBits2() {
    int n = 7;
    boolean actual = solution.hasAlternatingBits(n);
    assertFalse(actual);
  }

  @Test
  public void testHasAlternatingBits3() {
    int n = 11;
    boolean actual = solution.hasAlternatingBits(n);
    assertFalse(actual);
  }

  @Test
  public void testHasAlternatingBits4() {
    int n = 10;
    boolean actual = solution.hasAlternatingBits(n);
    assertTrue(actual);
  }

  @Test
  public void testHasAlternatingBits5() {
    int n = Integer.MAX_VALUE;
    boolean actual = solution.hasAlternatingBits(n);
    assertFalse(actual);
  }
}