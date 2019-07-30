package cn.hjmao.leetcode.a860lemonadechange;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testLemonadeChange1() {
    int[] bills = {5, 5, 5, 10, 20};
    boolean actual = solution.lemonadeChange(bills);
    assertTrue(actual);
  }

  @Test
  public void testLemonadeChange2() {
    int[] bills = {5, 5, 10};
    boolean actual = solution.lemonadeChange(bills);
    assertTrue(actual);
  }

  @Test
  public void testLemonadeChange3() {
    int[] bills = {10, 10};
    boolean actual = solution.lemonadeChange(bills);
    assertFalse(actual);
  }

  @Test
  public void testLemonadeChange4() {
    int[] bills = {5, 5, 10, 10, 20};
    boolean actual = solution.lemonadeChange(bills);
    assertFalse(actual);
  }

  @Test
  public void testLemonadeChange5() {
    int[] bills = {5, 5, 5, 5, 20, 20, 5, 5, 20, 5};
    boolean actual = solution.lemonadeChange(bills);
    assertFalse(actual);
  }

  @Test
  public void testLemonadeChange6() {
    int[] bills = {5, 5, 5, 5, 10, 5, 10, 10, 10, 20};
    boolean actual = solution.lemonadeChange(bills);
    assertTrue(actual);
  }
}