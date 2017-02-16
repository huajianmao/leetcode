package cn.hjmao.leetcode.a019removenthnodefromendoflist;

import cn.hjmao.utils.list.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 *
 * Desc:
 * =====
 * Given a linked list, remove the nth node from the end of list and return its head.
 *
 * For example,
 *
 * Given linked list: 1->2->3->4->5, and n = 2.
 *
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 *
 * Note:
 * Given n will always be valid.
 * Try to do this in one pass.
 */

public class Solution {
  public ListNode brutalforce(ListNode head, int n) {
    List<ListNode> nodes = new ArrayList<>();

    while (head != null) {
      nodes.add(head);
      head = head.next;
    }

    if (n == nodes.size()) {
      head = nodes.get(0).next;
    } else {
      head = nodes.get(nodes.size() - n - 1);
      head.next = head.next.next;
      head = nodes.get(0);
    }

    return head;
  }

  /**
   * By TMS@Leetcode
   *
   * https://discuss.leetcode.com/topic/7031/simple-java-solution-in-one-pass/2
   *
   * A one pass solution can be done using pointers. Move one pointer fast --> n+1 places forward,
   * to maintain a gap of n between the two pointers and then move both at the same speed.
   * Finally, when the fast pointer reaches the end,
   * the slow pointer will be n+1 places behind - just the right spot for it to be able to skip the next node.
   *
   * Since the question gives that n is valid, not too many checks have to be put in place. Otherwise,
   * this would be necessary.
   */
  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode start = new ListNode(0);
    ListNode slow = start;
    ListNode fast = start;
    slow.next = head;

    // Move fast in front so that the gap between slow and fast becomes n
    for (int i = 1; i <= n + 1; i++) {
      fast = fast.next;
    }

    // Move fast to the end, maintaining the gap
    while (fast != null) {
      slow = slow.next;
      fast = fast.next;
    }

    // Skip the desired node
    slow.next = slow.next.next;
    return start.next;
  }
}
