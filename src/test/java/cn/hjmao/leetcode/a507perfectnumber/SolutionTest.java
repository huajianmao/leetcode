package cn.hjmao.leetcode.a507perfectnumber;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testCheckPerfectNumber1() {
    int num = 28;
    boolean actual = solution.checkPerfectNumber(num);
    assertTrue(actual);
  }

  @Test
  public void testCheckPerfectNumber2() {
    int num = 100000000;
    boolean actual = solution.checkPerfectNumber(num);
    assertFalse(actual);
  }
}
