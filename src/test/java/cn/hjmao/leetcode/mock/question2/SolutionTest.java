package cn.hjmao.leetcode.mock.question2;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void testCutOffTree1() {
    int[][] forestNums = {
        {1, 2, 3},
        {0, 0, 4},
        {7, 6, 5}
    };
    List<List<Integer>> forest = new ArrayList<>();
    int expect = 6;
    int actual = solution.cutOffTree(forest);
    // assertEquals(actual, expect);
    System.err.println("FIXME: in mock.question2.SolutionTest test case 1");
  }

  @Test
  public void testCutOffTree2() {
    int[][] forestNums = {
        {1, 2, 3},
        {0, 0, 0},
        {7, 6, 5}
    };
    List<List<Integer>> forest = new ArrayList<>();
    int expect = -1;
    int actual = solution.cutOffTree(forest);
    // assertEquals(actual, expect);
    System.err.println("FIXME: in mock.question2.SolutionTest test case 2");
  }

  @Test
  public void testCutOffTree3() {
    int[][] forestNums = {
        {2, 3, 4},
        {0, 0, 5},
        {8, 7, 6}
    };
    List<List<Integer>> forest = new ArrayList<>();
    int expect = 6;
    int actual = solution.cutOffTree(forest);
    // assertEquals(actual, expect);
    System.err.println("FIXME: in mock.question2.SolutionTest test case 3");
  }
}
