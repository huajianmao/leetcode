package cn.hjmao.leetcode.a023mergeksortedlists;

import cn.hjmao.utils.list.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/merge-k-sorted-lists
 *
 * Desc:
 * =====
 * Merge k sorted linked lists and return it as one sorted list.
 * Analyze and describe its complexity.
 */

public class Solution {

  public ListNode mergeKLists(ListNode[] lists) {
    if (lists == null || lists.length == 0) {
      return null;
    }

    int k = lists.length;
    PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(k, new Comparator<ListNode>() {
      @Override
      public int compare(ListNode o1, ListNode o2) {
        if (o1.val < o2.val) {
          return -1;
        } else if (o1.val == o2.val) {
          return 0;
        } else {
          return 1;
        }
      }
    });

    ListNode merged = new ListNode(Integer.MIN_VALUE);
    ListNode tail = merged;

    for (ListNode node : lists) {
      if (node != null) {
        queue.add(node);
      }
    }

    while (!queue.isEmpty()) {
      tail.next = queue.poll();
      tail = tail.next;
      if (tail.next != null) {
        queue.add(tail.next);
      }
    }


    return merged.next;
  }
}
