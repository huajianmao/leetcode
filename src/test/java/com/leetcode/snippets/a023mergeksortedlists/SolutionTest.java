package com.leetcode.snippets.a023mergeksortedlists;

import cn.hjmao.utils.list.ListNode;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by hjmao on 17-2-18.
 */
public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testMergeKLists1() throws Exception {
    ListNode[] lists = {};
    ListNode expected = null;
    ListNode actual = this.solution.mergeKLists(lists);

    assertEquals(actual, expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testMergeKLists2() throws Exception {
    ListNode[] lists = {null};
    ListNode expected = null;
    ListNode actual = this.solution.mergeKLists(lists);

    assertEquals(actual, expected);
  }
}
