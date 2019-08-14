package cn.hjmao.leetcode.a914xofakindinadeckofcards;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testHasGroupsSizeX1() {
    int[] deck = {1, 2, 3, 4, 4, 3, 2, 1};
    boolean actual = solution.hasGroupsSizeX(deck);
    assertTrue(actual);
  }

  @Test
  public void testHasGroupsSizeX2() {
    int[] deck = {1, 1, 1, 2, 2, 2, 3, 3};
    boolean actual = solution.hasGroupsSizeX(deck);
    assertFalse(actual);
  }

  @Test
  public void testHasGroupsSizeX3() {
    int[] deck = {1};
    boolean actual = solution.hasGroupsSizeX(deck);
    assertFalse(actual);
  }

  @Test
  public void testHasGroupsSizeX4() {
    int[] deck = {1, 1};
    boolean actual = solution.hasGroupsSizeX(deck);
    assertTrue(actual);
  }

  @Test
  public void testHasGroupsSizeX5() {
    int[] deck = {1, 1, 2, 2, 2, 2};
    boolean actual = solution.hasGroupsSizeX(deck);
    assertTrue(actual);
  }
}