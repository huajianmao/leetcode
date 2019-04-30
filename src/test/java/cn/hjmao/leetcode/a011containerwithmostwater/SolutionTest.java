package cn.hjmao.leetcode.a011containerwithmostwater;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by hjmao on 07/02/2017.
 */
public class SolutionTest {
  private Solution solution;

  @BeforeMethod
  public void setUp() throws Exception {
    this.solution = new Solution();
  }

  @Test
  public void testMaxArea1() throws Exception {
    int[] height = {1, 2};
    int expected = 1;

    assertEquals(this.solution.maxArea(height), expected);
  }

  @Test
  public void testMaxArea2() throws Exception {
    int[] height = {1, 2, 1};
    int expected = 2;

    assertEquals(this.solution.maxArea(height), expected);
  }

  @Test
  public void testMaxArea3() throws Exception {
    int[] height = new int[15000];
    for (int i = 0; i < 15000; i++) {
      height[i] = 15000 - i;
    }
    int expected = 56250000;

    assertEquals(this.solution.maxArea(height), expected);
  }
}
