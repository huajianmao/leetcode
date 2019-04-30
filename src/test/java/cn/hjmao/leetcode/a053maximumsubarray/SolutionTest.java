package cn.hjmao.leetcode.a053maximumsubarray;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;


/**
 * Created by hjmao on 10/09/2018.
 */
public class SolutionTest {
  private Solution solution = new Solution();

  // FIXME: add test code here.
  @Test
  public void testExample() throws Exception {
    int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int expected = 6;

    assertEquals(this.solution.maxSubArray(nums), expected);
  }
}
