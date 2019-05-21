package cn.hjmao.leetcode.a046permutations;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test
  public void testPermute() {
    int[] nums = {1, 2, 3};
    int[][] expect = {
      {1, 2, 3},
      {1, 3, 2},
      {2, 1, 3},
      {2, 3, 1},
      {3, 1, 2},
      {3, 2, 1}
    };

    List<List<Integer>> actual = solution.permute(nums);

  }
}
