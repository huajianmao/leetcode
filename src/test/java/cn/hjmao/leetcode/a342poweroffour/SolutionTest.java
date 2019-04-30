package cn.hjmao.leetcode.a342poweroffour;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testIsPowerOfFour1() {
    int n = 1;
    boolean actual = solution.isPowerOfFour(n);
    assertTrue(actual);
  }

  @Test
  public void testIsPowerOfFour2() {
    int n = 2;
    boolean actual = solution.isPowerOfFour(n);
    assertFalse(actual);
  }

  @Test
  public void testIsPowerOfFour3() {
    int n = 4;
    boolean actual = solution.isPowerOfFour(n);
    assertTrue(actual);
  }

  @Test
  public void testIsPowerOfFour4() {
    int n = 8;
    boolean actual = solution.isPowerOfFour(n);
    assertFalse(actual);
  }

  @Test
  public void testIsPowerOfFour5() {
    int n = 16;
    boolean actual = solution.isPowerOfFour(n);
    assertTrue(actual);
  }
}
