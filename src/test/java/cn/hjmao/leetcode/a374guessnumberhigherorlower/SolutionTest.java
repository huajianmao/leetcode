package cn.hjmao.leetcode.a374guessnumberhigherorlower;

import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.Assert.*;

public class SolutionTest {
  Solution solution = new Solution();
  Random r = new Random();

  @Test
  public void testGuess1() {
    int expect = r.nextInt(Integer.MAX_VALUE - 2) + 1;
    solution.pick(expect);
    assertEquals(0, solution.guess(expect));
    assertEquals(1, solution.guess(expect - 1));
    assertEquals(-1, solution.guess(expect + 1));
  }

  @Test
  public void testGuessNumber1() {
    int n = 10;
    int expect = 6;
    solution.pick(expect);
    int actual = solution.guessNumber(n);
    assertEquals(actual, expect);
  }

  @Test
  public void testGuessNumber2() {
    int n = 1774014697;
    int expect = r.nextInt(n);
    solution.pick(expect);
    int actual = solution.guessNumber(n);
    assertEquals(actual, expect);
  }

  @Test
  public void testGuessNumber3() {
    for (int i = 0; i < 10000; i++) {
      int n = r.nextInt(Integer.MAX_VALUE);
      int expect = r.nextInt(n);
      solution.pick(expect);
      int actual = solution.guessNumber(n);
      assertEquals(actual, expect);
    }
  }
}