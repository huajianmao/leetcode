package cn.hjmao.leetcode.a997findthetownjudge;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testFindJudge1() {
    int n = 2;
    int[][] trust = {{1, 2}};
    int expect = 2;
    int actual = solution.findJudge(n, trust);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindJudge2() {
    int n = 3;
    int[][] trust = {{1, 3}, {2, 3}};
    int expect = 3;
    int actual = solution.findJudge(n, trust);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindJudge3() {
    int n = 3;
    int[][] trust = {{1, 3}, {2, 3}, {3, 1}};
    int expect = -1;
    int actual = solution.findJudge(n, trust);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindJudge4() {
    int n = 3;
    int[][] trust = {{1, 2}, {2, 3}};
    int expect = -1;
    int actual = solution.findJudge(n, trust);
    assertEquals(actual, expect);
  }

  @Test
  public void testFindJudge5() {
    int n = 4;
    int[][] trust = {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
    int expect = 3;
    int actual = solution.findJudge(n, trust);
    assertEquals(actual, expect);
  }
}