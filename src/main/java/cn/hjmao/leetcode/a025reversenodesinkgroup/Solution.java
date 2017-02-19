package cn.hjmao.leetcode.a025reversenodesinkgroup;

import cn.hjmao.utils.list.ListNode;

import java.util.Stack;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/reverse-nodes-in-k-group/?tab=Description
 *
 * Desc:
 * =====
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
 *
 * k is a positive integer and is less than or equal to the length of the linked list.
 * If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
 * You may not alter the values in the nodes, only nodes itself may be changed.
 * Only constant memory is allowed.
 *
 * For example,
 *
 * Given this linked list: 1->2->3->4->5
 * For k = 2, you should return: 2->1->4->3->5
 * For k = 3, you should return: 3->2->1->4->5
 */

public class Solution {
  public ListNode reverseKGroup(ListNode head, int k) {
    ListNode dummy = new ListNode(0);
    ListNode last = dummy;
    Stack<ListNode> stack = new Stack<>();

    while (head != null) {
      stack.add(head);
      head = head.next;

      if (stack.size() == k) {
        while (!stack.empty()) {
          last.next = stack.pop();
          last = last.next;
          last.next = null;
        }
      }
    }

    while (!stack.empty()) {
      ListNode thisNode = stack.pop();
      thisNode.next = last.next;
      last.next = thisNode;
    }

    return dummy.next;
  }
}
