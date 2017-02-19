package cn.hjmao.leetcode.a024swapnodesinpairs;

import cn.hjmao.utils.list.ListNode;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/swap-nodes-in-pairs/?tab=Description
 *
 * Desc:
 * =====
 * Given a linked list, swap every two adjacent nodes and return its head.
 *
 * For example,
 *
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 *
 * Your algorithm should use only constant space.
 * You may not modify the values in the list, only nodes itself can be changed.
 */

public class Solution {
  public ListNode swapPairs(ListNode head) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;

    ListNode prev = dummy;
    while (head != null) {
      if (head.next != null) {
        ListNode newHead = head.next.next;
        ListNode newPrev = head;
        prev.next = head.next;
        head.next.next = head;
        head = newHead;
        prev = newPrev;
        prev.next = head;
      } else {
        prev.next = head;
        break;
      }
    }

    return dummy.next;
  }
}
