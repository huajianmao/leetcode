package cn.hjmao.leetcode.a633sumofsquarenumbers;

import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testJudgeSquareSum1() {
    int c = 5;
    boolean actual = solution.judgeSquareSum(c);
    assertTrue(actual);
  }

  @Test
  public void testJudgeSquareSum2() {
    int c = 3;
    boolean actual = solution.judgeSquareSum(c);
    assertFalse(actual);
  }

  @Test
  public void testJudgeSquareSum3() {
    Random random = new Random();
    for (int i = 0; i < 1000; i++) {
      int a = random.nextInt((int) Math.sqrt(Integer.MAX_VALUE / 2));
      int b = random.nextInt((int) Math.sqrt(Integer.MAX_VALUE / 2));
      int c = a * a + b * b;
      boolean actual = solution.judgeSquareSum(c);
      assertTrue(actual);
    }
  }

  @Test
  public void testJudgeSquareSum4() {
    int c = 0;
    boolean actual = solution.judgeSquareSum(c);
    assertTrue(actual);
  }

  @Test
  public void testJudgeSquareSum5() {
    int c = 1;
    boolean actual = solution.judgeSquareSum(c);
    assertTrue(actual);
  }

  @Test
  public void testJudgeSquareSum6() {
    int c = 2;
    boolean actual = solution.judgeSquareSum(c);
    assertTrue(actual);
  }

  @Test
  public void testJudgeSquareSum7() {
    int c = Integer.MAX_VALUE;
    boolean actual = solution.judgeSquareSum(c);
    assertFalse(actual);
  }
}