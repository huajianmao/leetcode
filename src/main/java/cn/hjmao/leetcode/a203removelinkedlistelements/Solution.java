package cn.hjmao.leetcode.a203removelinkedlistelements;

import cn.hjmao.utils.list.ListNode;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/remove-linked-list-elements/
 *
 * Desc:
 * =====
 * Remove all elements from a linked list of integers that have value val.
 *
 * Example:
 *
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 */

public class Solution {
  public ListNode removeElements(ListNode head, int val) {
    while (head != null && head.val == val) {
      head = head.next;
    }
    if (head == null) {
      return null;
    }
    ListNode prev = head;
    ListNode current = head.next;

    while (current != null) {
      if (current.val == val) {
        prev.next = current.next;
      } else {
        prev = current;
      }
      current = current.next;
    }
    return head;
  }
}
