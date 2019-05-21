package cn.hjmao.leetcode.a202happynumber;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testIsHappy1() {
    int n = 19;
    boolean actual = solution.isHappy(n);
    assertTrue(actual);
  }

  @Test
  public void testIsHappy2() {
    int n = 2;
    boolean actual = solution.isHappy(n);
    assertFalse(actual);
  }
}
