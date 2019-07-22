package cn.hjmao.leetcode.a859buddystrings;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testBuddyStrings1() {
    String a = "ab";
    String b = "ba";
    boolean actual = solution.buddyStrings(a, b);
    assertTrue(actual);
  }

  @Test
  public void testBuddyStrings2() {
    String a = "ab";
    String b = "ab";
    boolean actual = solution.buddyStrings(a, b);
    assertFalse(actual);
  }

  @Test
  public void testBuddyStrings3() {
    String a = "aa";
    String b = "aa";
    boolean actual = solution.buddyStrings(a, b);
    assertTrue(actual);
  }

  @Test
  public void testBuddyStrings4() {
    String a = "aaaaaaabc";
    String b = "aaaaaaacb";
    boolean actual = solution.buddyStrings(a, b);
    assertTrue(actual);
  }

  @Test
  public void testBuddyStrings5() {
    String a = "";
    String b = "aa";
    boolean actual = solution.buddyStrings(a, b);
    assertFalse(actual);
  }
}
