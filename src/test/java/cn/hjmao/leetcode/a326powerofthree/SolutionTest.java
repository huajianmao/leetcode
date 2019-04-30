package cn.hjmao.leetcode.a326powerofthree;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testIsPowerOfThree1() {
    int n = 27;
    boolean actual = solution.isPowerOfThree(n);
    assertTrue(actual);
  }

  @Test
  public void testIsPowerOfThree2() {
    int n = 0;
    boolean actual = solution.isPowerOfThree(n);
    assertFalse(actual);
  }

  @Test
  public void testIsPowerOfThree3() {
    int n = 9;
    boolean actual = solution.isPowerOfThree(n);
    assertTrue(actual);
  }

  @Test
  public void testIsPowerOfThree4() {
    int n = 45;
    boolean actual = solution.isPowerOfThree(n);
    assertFalse(actual);
  }

  @Test
  public void testIsPowerOfThree5() {
    int n = (int) Math.pow(3, 4);
    boolean actual = solution.isPowerOfThree(n);
    assertTrue(actual);
  }
}
