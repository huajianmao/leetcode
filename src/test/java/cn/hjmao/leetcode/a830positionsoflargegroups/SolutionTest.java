package cn.hjmao.leetcode.a830positionsoflargegroups;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testLargeGroupPositions1() {
    String s = "abbxxxxzzy";
    List<List<Integer>> expect = Arrays.asList(Arrays.asList(3, 6));
    List<List<Integer>> actual = solution.largeGroupPositions(s);
    assertEquals(actual, expect);
  }

  @Test
  public void testLargeGroupPositions2() {
    String s = "abc";
    List<List<Integer>> expect = new ArrayList<>();
    List<List<Integer>> actual = solution.largeGroupPositions(s);
    assertEquals(actual, expect);
  }

  @Test
  public void testLargeGroupPositions3() {
    String s = "abcdddeeeeaabbbcd";
    List<List<Integer>> expect = Arrays.asList(Arrays.asList(3, 5), Arrays.asList(6, 9), Arrays.asList(12, 14));
    List<List<Integer>> actual = solution.largeGroupPositions(s);
    assertEquals(actual, expect);
  }

  @Test
  public void testLargeGroupPositions4() {
    String s = "aaa";
    List<List<Integer>> expect = Arrays.asList(Arrays.asList(0, 2));
    List<List<Integer>> actual = solution.largeGroupPositions(s);
    assertEquals(actual, expect);
  }

  @Test
  public void testLargeGroupPositions5() {
    String s = "baaa";
    List<List<Integer>> expect = Arrays.asList(Arrays.asList(1, 3));
    List<List<Integer>> actual = solution.largeGroupPositions(s);
    assertEquals(actual, expect);
  }

  @Test
  public void testLargeGroupPositions6() {
    String s = "abab";
    List<List<Integer>> expect = new ArrayList<>();
    List<List<Integer>> actual = solution.largeGroupPositions(s);
    assertEquals(actual, expect);
  }
}