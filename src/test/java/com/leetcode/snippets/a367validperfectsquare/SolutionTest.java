package com.leetcode.snippets.a367validperfectsquare;

import org.testng.annotations.Test;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsPerfectSquare1() {
    int num = 16;
    boolean actual = solution.isPerfectSquare(num);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsPerfectSquare7() {
    int num = 5;
    boolean actual = solution.isPerfectSquare(num);
    assertFalse(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsPerfectSquare2() {
    int num = 14;
    boolean actual = solution.isPerfectSquare(num);
    assertFalse(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsPerfectSquare3() {
    int num = 1;
    boolean actual = solution.isPerfectSquare(num);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsPerfectSquare4() {
    int num = 4;
    boolean actual = solution.isPerfectSquare(num);
    assertTrue(actual);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsPerfectSquare5() {
    Random r = new Random();
    for (int i = 0; i < 10; i++) {
      int value = r.nextInt((int) Math.sqrt(Integer.MAX_VALUE));
      assertTrue(solution.isPerfectSquare(value * value));
    }
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsPerfectSquare6() {
    Random r = new Random();
    for (int i = 0; i < 10; i++) {
      int value = r.nextInt((int) Math.sqrt(Integer.MAX_VALUE));
      assertFalse(solution.isPerfectSquare(value * value - 2));
    }
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testIsPerfectSquare8() {
    ThreadLocalRandom r = ThreadLocalRandom.current();
    for (int i = 0; i < 1000; i++) {
      int num = r.nextInt(1, (int) Math.sqrt(Integer.MAX_VALUE));
      int sqrt = (int) Math.sqrt(num);
      if (sqrt * sqrt == num) {
        assertTrue(solution.isPerfectSquare(num));
      } else {
        assertFalse(solution.isPerfectSquare(num));
      }
    }
  }
}
