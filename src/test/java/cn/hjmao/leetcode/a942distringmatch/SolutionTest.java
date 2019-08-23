package cn.hjmao.leetcode.a942distringmatch;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testDiStringMatch1() {
    String s = "IDID";
    int[] actual = solution.diStringMatch(s);
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      helper(c, actual, i);
    }
  }

  @Test
  public void testDiStringMatch2() {
    String s = "III";
    int[] actual = solution.diStringMatch(s);
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      helper(c, actual, i);
    }
  }

  @Test
  public void testDiStringMatch3() {
    String s = "DDI";
    int[] actual = solution.diStringMatch(s);
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      helper(c, actual, i);
    }
  }

  @Test
  public void testDiStringMatch4() {
    String s = "D";
    int[] actual = solution.diStringMatch(s);
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      helper(c, actual, i);
    }
  }

  @Test
  public void testDiStringMatch5() {
    String s = "I";
    int[] actual = solution.diStringMatch(s);
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      helper(c, actual, i);
    }
  }

  private boolean helper(char c, int[] nums, int i) {
    if (c == 'I') {
      return nums[i] < nums[i + 1];
    } else {
      return nums[i] > nums[i + 1];
    }
  }
}