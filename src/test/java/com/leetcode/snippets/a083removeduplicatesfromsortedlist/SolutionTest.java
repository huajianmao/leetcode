package com.leetcode.snippets.a083removeduplicatesfromsortedlist;

import cn.hjmao.utils.list.ListNode;
import cn.hjmao.utils.list.ListNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testDeleteDuplicates1() throws Exception {
    ListNode head = null;
    ListNode expected = null;
    ListNode actual = this.solution.deleteDuplicates(head);

    assertEquals(actual, expected);
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testDeleteDuplicates2() {
    int[] headArray = {1, 1, 2};
    ListNode head = ListNodeUtils.createListFromArray(headArray);

    int[] expectedArray = {1, 2};
    ListNode expected = ListNodeUtils.createListFromArray(expectedArray);

    ListNode actual = this.solution.deleteDuplicates(head);

    assertTrue(ListNodeUtils.equals(actual, expected));
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testDeleteDuplicates3() {
    int[] headArray = {1, 1, 2, 2};
    ListNode head = ListNodeUtils.createListFromArray(headArray);

    int[] expectedArray = {1, 2};
    ListNode expected = ListNodeUtils.createListFromArray(expectedArray);

    ListNode actual = this.solution.deleteDuplicates(head);

    assertTrue(ListNodeUtils.equals(actual, expected));
  }

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testDeleteDuplicates4() {
    int[] headArray = {1, 1, 2, 3, 3};
    ListNode head = ListNodeUtils.createListFromArray(headArray);

    int[] expectedArray = {1, 2, 3};
    ListNode expected = ListNodeUtils.createListFromArray(expectedArray);

    ListNode actual = this.solution.deleteDuplicates(head);

    assertTrue(ListNodeUtils.equals(actual, expected));
  }
}
