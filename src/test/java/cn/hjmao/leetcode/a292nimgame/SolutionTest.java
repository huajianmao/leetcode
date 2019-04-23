package cn.hjmao.leetcode.a292nimgame;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testCanWinNim1() {
    int n = 4;
    boolean actual = solution.canWinNim(n);
    assertFalse(actual);
  }

  @Test
  public void testCanWinNim2() {
    int n = 5;
    boolean actual = solution.canWinNim(n);
    assertTrue(actual);
  }

  @Test
  public void testCanWinNim3() {
    int n = 6;
    boolean actual = solution.canWinNim(n);
    assertTrue(actual);
  }

  @Test
  public void testCanWinNim4() {
    int n = 7;
    boolean actual = solution.canWinNim(n);
    assertTrue(actual);
  }

  @Test
  public void testCanWinNim5() {
    int n = 8;
    boolean actual = solution.canWinNim(n);
    assertFalse(actual);
  }

  @Test
  public void testCanWinNim6() {
    int n = 1348820612;
    boolean actual = solution.canWinNim(n);
    assertFalse(actual);
  }

  @Test
  public void testCanWinNim7() {
    int n = 1199886170;
    boolean actual = solution.canWinNim(n);
    assertTrue(actual);
  }
}