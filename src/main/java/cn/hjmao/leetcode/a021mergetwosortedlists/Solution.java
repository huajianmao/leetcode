package cn.hjmao.leetcode.a021mergetwosortedlists;

import cn.hjmao.utils.list.ListNode;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/merge-two-sorted-lists/
 *
 * Desc:
 * =====
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 */

public class Solution {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode merged;

    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }

    if (l1.val < l2.val) {
      merged = l1;
      l1.next = mergeTwoLists(l1.next, l2);
    } else {
      merged = l2;
      l2.next = mergeTwoLists(l1, l2.next);
    }

    return merged;
  }
}
