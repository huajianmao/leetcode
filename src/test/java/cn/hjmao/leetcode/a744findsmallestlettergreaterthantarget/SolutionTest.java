package cn.hjmao.leetcode.a744findsmallestlettergreaterthantarget;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testNextGreatestLetter1() {
    char[] letters = {'c', 'f', 'j'};
    char target = 'a';
    char expect = 'c';
    char actual = solution.nextGreatestLetter(letters, target);
    assertEquals(actual, expect);
  }

  @Test
  public void testNextGreatestLetter2() {
    char[] letters = {'c', 'f', 'j'};
    char target = 'c';
    char expect = 'f';
    char actual = solution.nextGreatestLetter(letters, target);
    assertEquals(actual, expect);
  }

  @Test
  public void testNextGreatestLetter3() {
    char[] letters = {'c', 'f', 'j'};
    char target = 'd';
    char expect = 'f';
    char actual = solution.nextGreatestLetter(letters, target);
    assertEquals(actual, expect);
  }

  @Test
  public void testNextGreatestLetter4() {
    char[] letters = {'c', 'f', 'j'};
    char target = 'g';
    char expect = 'j';
    char actual = solution.nextGreatestLetter(letters, target);
    assertEquals(actual, expect);
  }

  @Test
  public void testNextGreatestLetter5() {
    char[] letters = {'c', 'f', 'j'};
    char target = 'j';
    char expect = 'c';
    char actual = solution.nextGreatestLetter(letters, target);
    assertEquals(actual, expect);
  }

  @Test
  public void testNextGreatestLetter6() {
    char[] letters = {'c', 'f', 'j'};
    char target = 'k';
    char expect = 'c';
    char actual = solution.nextGreatestLetter(letters, target);
    assertEquals(actual, expect);
  }
}