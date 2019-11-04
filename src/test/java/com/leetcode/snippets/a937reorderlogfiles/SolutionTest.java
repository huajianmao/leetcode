package com.leetcode.snippets.a937reorderlogfiles;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testReorderLogFiles1() {
    String[] logs = {"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"};
    String[] expect = {"g1 act car", "a8 act zoo", "ab1 off key dog", "a1 9 2 3 1", "zo4 4 7"};
    String[] actual = solution.reorderLogFiles(logs);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testReorderLogFiles2() {
    String[] logs = {"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo", "a2 act car"};
    String[] expect = {"a2 act car", "g1 act car", "a8 act zoo", "ab1 off key dog", "a1 9 2 3 1", "zo4 4 7"};
    String[] actual = solution.reorderLogFiles(logs);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testReorderLogFiles3() {
    String[] logs = {"a1 9 2 3 1"};
    String[] expect = {"a1 9 2 3 1"};
    String[] actual = solution.reorderLogFiles(logs);
    assertEquals(actual, expect);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testReorderLogFiles4() {
    String[] logs = {"a1 a a a"};
    String[] expect = {"a1 a a a"};
    String[] actual = solution.reorderLogFiles(logs);
    assertEquals(actual, expect);
  }
}
