package cn.hjmao.leetcode.a944deletecolumnstomakesorted;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testMinDeletionSize1() {
    String[] a = {"cba", "daf", "ghi"};
    int expect = 1;
    int actual = solution.minDeletionSize(a);
    assertEquals(actual, expect);
  }

  @Test
  public void testMinDeletionSize2() {
    String[] a = {"a", "b"};
    int expect = 0;
    int actual = solution.minDeletionSize(a);
    assertEquals(actual, expect);
  }

  @Test
  public void testMinDeletionSize3() {
    String[] a = {"zyx", "wvu", "tsr"};
    int expect = 3;
    int actual = solution.minDeletionSize(a);
    assertEquals(actual, expect);
  }

  @Test
  public void testMinDeletionSize4() {
    String[] a = {"z", "w", "t"};
    int expect = 1;
    int actual = solution.minDeletionSize(a);
    assertEquals(actual, expect);
  }

  @Test
  public void testMinDeletionSize5() {
    String[] a = {"x", "y", "z"};
    int expect = 0;
    int actual = solution.minDeletionSize(a);
    assertEquals(actual, expect);
  }

  @Test
  public void testMinDeletionSize6() {
    String[] a = {"x", "x", "x"};
    int expect = 0;
    int actual = solution.minDeletionSize(a);
    assertEquals(actual, expect);
  }

  @Test
  public void testMinDeletionSize7() {
    String[] a = {"x"};
    int expect = 0;
    int actual = solution.minDeletionSize(a);
    assertEquals(actual, expect);
  }
}