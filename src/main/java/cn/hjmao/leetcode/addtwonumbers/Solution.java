package cn.hjmao.leetcode.addtwonumbers;

/**
 * Created by hjmao on 17/01/2017.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/add-two-numbers/
 *
 * Desc:
 * =====
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */

class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { val = x; }

  public boolean isSameAs(ListNode that) {
    if (this.val == that.val
        && ((this.next == null && this.next == null)
             || (this.next != null && this.next.isSameAs(that.next)))) {
      return true;
    } else {
      return false;
    }
  }
}

public class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode result = new ListNode(-1);
    ListNode p = l1;
    ListNode q = l2;
    ListNode curr = result;

    int carry = 0;
    while (p != null || q != null) {
      int x = (p != null) ? p.val : 0;
      int y = (q != null) ? q.val : 0;
      int sum = carry + x + y;
      carry = sum / 10;
      curr.next = new ListNode(sum % 10);
      curr = curr.next;
      if (p != null) {
        p = p.next;
      }
      if (q != null) {
        q = q.next;
      }
    }
    if (carry > 0) {
      curr.next = new ListNode(carry);
    }
    return result.next;
  }
}
