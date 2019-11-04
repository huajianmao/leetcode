package com.leetcode.snippets.a1009complementofbase10integer;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testBitwiseComplement1() {
    int n = 5;
    int expect = 2;
    int actual = solution.bitwiseComplement(n);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testBitwiseComplement2() {
    int n = 7;
    int expect = 0;
    int actual = solution.bitwiseComplement(n);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testBitwiseComplement3() {
    int n = 10;
    int expect = 5;
    int actual = solution.bitwiseComplement(n);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testBitwiseComplement4() {
    int n = 0;
    int expect = 1;
    int actual = solution.bitwiseComplement(n);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testBitwiseComplement5() {
    int n = 1;
    int expect = 0;
    int actual = solution.bitwiseComplement(n);
    assertEquals(actual, expect);
  }
}
