package cn.hjmao.leetcode.a083removeduplicatesfromsortedlist;

import cn.hjmao.utils.list.ListNode;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 *
 * Desc:
 * =====
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 */

public class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;

        ListNode start = head;
        ListNode next = head.next;

        while (next != null) {
            if (start.val != next.val) {
                start = next;
                next = next.next;
            } else {
                while (next != null) {
                    next = next.next;
                    if (next == null || next.val != start.val) {
                        start.next = next;
                        start = next;
                        next = next == null ? null : next.next;
                        break;
                    }
                }
            }
        }
        return head;
    }
}
