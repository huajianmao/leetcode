package com.leetcode.snippets.a405convertanumbertohexadecimal;

import org.testng.annotations.Test;

import java.util.Random;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testToHex1() {
    int num = 26;
    String expect = "1a";
    String actual = solution.toHex(num);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testToHex2() {
    int num = -1;
    String expect = "ffffffff";
    String actual = solution.toHex(num);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testToHex0() {
    int num = 0;
    String expect = "0";
    String actual = solution.toHex(num);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testToHex3() {
    Random random = new Random();
    for (int i = 0; i < 100; i++) {
      int num = random.nextInt();
      String expect = Integer.toHexString(num);
      String actual = solution.toHex(num);
      assertEquals(actual, expect);
    }
  }
}
