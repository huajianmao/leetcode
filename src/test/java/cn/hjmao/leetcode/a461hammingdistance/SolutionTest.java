package cn.hjmao.leetcode.a461hammingdistance;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by hjmao on 19/01/2017.
 */
public class SolutionTest {
  private Solution solution;

  @BeforeMethod
  public void setUp() throws Exception {
    this.solution = new Solution();
  }

  @Test
  public void testHammingDistance1() throws Exception {
    int x = 1;
    int y = 4;

    int expected = 2;
    assertEquals(this.solution.hammingDistance(x, y), expected);
  }

  @Test
  public void testHammingDistance2() throws Exception {
    int x = Integer.MAX_VALUE;
    int y = Integer.MAX_VALUE;

    int expected = 0;
    assertEquals(this.solution.hammingDistance(x, y), expected);
  }

  @Test
  public void testHammingDistance3() throws Exception {
    int x = Integer.MIN_VALUE;
    int y = Integer.MIN_VALUE;

    int expected = 0;
    assertEquals(this.solution.hammingDistance(x, y), expected);
  }
}
