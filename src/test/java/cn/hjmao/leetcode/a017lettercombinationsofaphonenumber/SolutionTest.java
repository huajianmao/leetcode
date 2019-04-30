package cn.hjmao.leetcode.a017lettercombinationsofaphonenumber;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by hjmao on 12/02/2017.
 */
public class SolutionTest {
  private Solution solution;

  private boolean areTwoListsEqual(List<String> actual, List<String> expected) {
    Set<String> actualSet = new HashSet<>(actual);
    Set<String> expectedSet = new HashSet<>(expected);
    return actualSet.size() == expectedSet.size() && actualSet.containsAll(expectedSet);
  }

  @BeforeMethod
  public void setUp() throws Exception {
    this.solution = new Solution();
  }

  @Test
  public void testLetterCombinations1() throws Exception {
    String digitals = "#3";
    List<String> expected = Arrays.asList("D", "E", "F");

    assert areTwoListsEqual(this.solution.letterCombinations(digitals), expected);
  }

  @Test
  public void testLetterCombinations2() throws Exception {
    String digitals = "23";
    List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");

    assert areTwoListsEqual(this.solution.letterCombinations(digitals), expected);
  }

  @Test
  public void testLetterCombinations3() throws Exception {
    String digitals = "*3";
    List<String> expected = Arrays.asList("+d", "+e", "+f");

    assert areTwoListsEqual(this.solution.letterCombinations(digitals), expected);
  }
}
