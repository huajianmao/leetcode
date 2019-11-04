package com.leetcode.snippets.a038countandsay;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by hjmao on 28/02/2017.
 */
public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCountAndSay1() throws Exception {
    int n = 2;
    String expected = "11";
    String actual = this.solution.countAndSay(n);

    assertEquals(actual, expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCountAndSay2() throws Exception {
    int n = 3;
    String expected = "21";
    String actual = this.solution.countAndSay(n);

    assertEquals(actual, expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCountAndSay3() throws Exception {
    int n = 4;
    String expected = "1211";
    String actual = this.solution.countAndSay(n);

    assertEquals(actual, expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCountAndSay4() throws Exception {
    int n = 5;
    String expected = "111221";
    String actual = this.solution.countAndSay(n);

    assertEquals(actual, expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testCountAndSay5() throws Exception {
    int n = 6;
    String expected = "312211";
    String actual = this.solution.countAndSay(n);

    assertEquals(actual, expected);
  }
}
