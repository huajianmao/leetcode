package cn.hjmao.leetcode.a383ransomnote;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testCanConstruct1() {
    String ransomNote = "a";
    String magazine = "b";
    boolean actual = solution.canConstruct(ransomNote, magazine);
    assertFalse(actual);
  }

  @Test
  public void testCanConstruct2() {
    String ransomNote = "aa";
    String magazine = "ab";
    boolean actual = solution.canConstruct(ransomNote, magazine);
    assertFalse(actual);
  }

  @Test
  public void testCanConstruct3() {
    String ransomNote = "aa";
    String magazine = "aab";
    boolean actual = solution.canConstruct(ransomNote, magazine);
    assertTrue(actual);
  }

  @Test
  public void testCanConstruct4() {
    String ransomNote = "";
    String magazine = "b";
    boolean actual = solution.canConstruct(ransomNote, magazine);
    assertTrue(actual);
  }

  @Test
  public void testCanConstruct6() {
    String ransomNote = "a";
    String magazine = "";
    boolean actual = solution.canConstruct(ransomNote, magazine);
    assertFalse(actual);
  }
}
