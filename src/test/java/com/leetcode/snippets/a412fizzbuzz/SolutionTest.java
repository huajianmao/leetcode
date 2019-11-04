package com.leetcode.snippets.a412fizzbuzz;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testFizzBuzz1() {
    int n = 15;
    String[] expect = {
        "1",
        "2",
        "Fizz",
        "4",
        "Buzz",
        "Fizz",
        "7",
        "8",
        "Fizz",
        "Buzz",
        "11",
        "Fizz",
        "13",
        "14",
        "FizzBuzz"
    };
    List<String> actual = solution.fizzBuzz(n);
    assertEquals(actual, Arrays.asList(expect));
  }
}
