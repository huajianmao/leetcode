package cn.hjmao.leetcode.a876middleofthelinkedlist;

import cn.hjmao.utils.list.ListNode;
import cn.hjmao.utils.list.ListNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testMiddleNode1() {
    int[] nums = {1, 2, 3, 4, 5};
    ListNode head = ListNodeUtils.createListFromArray(nums);
    ListNode expect = head.next.next;
    ListNode actual = solution.middleNode(head);
    assertEquals(actual, expect);
  }

  @Test
  public void testMiddleNode2() {
    int[] nums = {1, 2, 3, 4, 5, 6};
    ListNode head = ListNodeUtils.createListFromArray(nums);
    ListNode expect = head.next.next.next;
    ListNode actual = solution.middleNode(head);
    assertEquals(actual, expect);
  }

  @Test
  public void testMiddleNode3() {
    int[] nums = {1};
    ListNode head = ListNodeUtils.createListFromArray(nums);
    ListNode expect = head;
    ListNode actual = solution.middleNode(head);
    assertEquals(actual, expect);
  }
}