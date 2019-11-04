package com.leetcode.snippets.a046permutations;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testPermute() {
    int[] nums = {1, 2, 3};
    List<List<Integer>> expect = Arrays.asList(
        Arrays.asList(1, 2, 3),
        Arrays.asList(1, 3, 2),
        Arrays.asList(2, 1, 3),
        Arrays.asList(2, 3, 1),
        Arrays.asList(3, 1, 2),
        Arrays.asList(3, 2, 1)
    );

    List<List<Integer>> actual = solution.permute(nums);
    assertEquals(new HashSet<>(actual), new HashSet<>(expect));
  }
}
