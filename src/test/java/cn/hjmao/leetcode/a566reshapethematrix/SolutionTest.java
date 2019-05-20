package cn.hjmao.leetcode.a566reshapethematrix;

import cn.hjmao.utils.AssertUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testMatrixReshape1() {
    int[][] nums = {{1, 2}, {3, 4}};
    int r = 1;
    int c = 4;
    int[][] expect = {{1, 2, 3, 4}};
    int[][] actual = solution.matrixReshape(nums, r, c);
    assertEquals(AssertUtils.int2dArrayToString(actual), AssertUtils.int2dArrayToString(expect));
  }

  @Test
  public void testMatrixReshape2() {
    int[][] nums = {{1, 2}, {3, 4}};
    int r = 2;
    int c = 4;
    int[][] expect = {{1, 2}, {3, 4}};
    int[][] actual = solution.matrixReshape(nums, r, c);
    assertEquals(AssertUtils.int2dArrayToString(actual), AssertUtils.int2dArrayToString(expect));
  }

  @Test
  public void testMatrixReshape3() {
    int[][] nums = {{1, 2, 3}, {3, 4, 5}};
    int r = 3;
    int c = 2;
    int[][] expect = {{1, 2}, {3, 3}, {4, 5}};
    int[][] actual = solution.matrixReshape(nums, r, c);
    assertEquals(AssertUtils.int2dArrayToString(actual), AssertUtils.int2dArrayToString(expect));
  }

  @Test
  public void testMatrixReshape4() {
    int[][] nums = {{1, 2, 3}, {3, 4, 5}};
    int r = 1;
    int c = 6;
    int[][] expect = {{1, 2, 3, 3, 4, 5}};
    int[][] actual = solution.matrixReshape(nums, r, c);
    assertEquals(AssertUtils.int2dArrayToString(actual), AssertUtils.int2dArrayToString(expect));
  }
}