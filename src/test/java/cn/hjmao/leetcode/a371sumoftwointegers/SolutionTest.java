package cn.hjmao.leetcode.a371sumoftwointegers;

import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testGetSum1() {
    Random r = new Random();
    for (int i = 0; i < 10000; i++) {
      int a = r.nextInt();
      int b = r.nextInt();
      assertEquals(solution.getSum(a, b), a + b);
    }
  }
}
