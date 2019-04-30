package cn.hjmao.leetcode.a412fizzbuzz;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
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
