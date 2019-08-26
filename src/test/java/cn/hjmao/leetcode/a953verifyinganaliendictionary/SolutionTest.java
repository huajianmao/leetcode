package cn.hjmao.leetcode.a953verifyinganaliendictionary;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testIsAlienSorted1() {
    String[] words = {"hello", "leetcode"};
    String order = "hlabcdefgijkmnopqrstuvwxyz";
    boolean actual = solution.isAlienSorted(words, order);
    assertTrue(actual);
  }

  @Test
  public void testIsAlienSorted2() {
    String[] words = {"word", "world", "row"};
    String order = "worldabcefghijkmnpqstuvxyz";
    boolean actual = solution.isAlienSorted(words, order);
    assertFalse(actual);
  }

  @Test
  public void testIsAlienSorted3() {
    String[] words = {"apple", "app"};
    String order = "abcdefghijklmnopqrstuvwxyz";
    boolean actual = solution.isAlienSorted(words, order);
    assertFalse(actual);
  }

  @Test
  public void testIsAlienSorted4() {
    String[] words = {"red", "inci"};
    String order = "tcyklqfhoeapndgbimsujzvxwr";
    boolean actual = solution.isAlienSorted(words, order);
    assertFalse(actual);
  }

  @Test
  public void testIsAlienSorted5() {
    String[] words = {"fxasxpc", "dfbdrifhp", "nwzgs", "cmwqriv", "ebulyfyve",
                      "miracx", "sxckdwzv", "dtijzluhts", "wwbmnge", "qmjwymmyox"};
    String order = "zkgwaverfimqxbnctdplsjyohu";
    boolean actual = solution.isAlienSorted(words, order);
    assertFalse(actual);
  }
}