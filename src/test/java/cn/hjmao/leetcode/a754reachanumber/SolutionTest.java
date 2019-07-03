package cn.hjmao.leetcode.a754reachanumber;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testReachNumber1() {
    int target = 3;
    int expect = 2;
    int actual = solution.reachNumber(target);
    assertEquals(actual, expect);
  }

  @Test
  public void testReachNumber2() {
    int target = 2;
    int expect = 3;
    int actual = solution.reachNumber(target);
    assertEquals(actual, expect);
  }

  @Test
  public void testReachNumber3() {
    int target = 1;
    int expect = 1;
    int actual = solution.reachNumber(target);
    assertEquals(actual, expect);
  }

  @Test
  public void testReachNumber4() {
    int target = 4;
    int expect = 3;
    int actual = solution.reachNumber(target);
    assertEquals(actual, expect);
  }

  @Test
  public void testReachNumber5() {
    int target = 5;
    int expect = 5;
    int actual = solution.reachNumber(target);
    assertEquals(actual, expect);
  }

  @Test
  public void testReachNumber6() {
    int target = 6;
    int expect = 3;
    int actual = solution.reachNumber(target);
    assertEquals(actual, expect);
  }

  @Test
  public void testReachNumber7() {
    int target = 7;
    int expect = 5;
    int actual = solution.reachNumber(target);
    assertEquals(actual, expect);
  }

  @Test
  public void testReachNumber8() {
    int target = 12;
    int expect = 7;
    int actual = solution.reachNumber(target);
    assertEquals(actual, expect);
  }

  @Test
  public void testReachNumber9() {
    int target = 17;
    int expect = 6;
    int actual = solution.reachNumber(target);
    assertEquals(actual, expect);
  }
}