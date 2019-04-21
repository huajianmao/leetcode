package cn.hjmao.leetcode.a234palindromelinkedlist;

import cn.hjmao.utils.list.ListNode;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/palindrome-linked-list/
 *
 * Desc:
 * =====
 * Given a singly linked list, determine if it is a palindrome.
 *
 * Example 1:
 *
 * Input: 1->2
 * Output: false
 * Example 2:
 *
 * Input: 1->2->2->1
 * Output: true
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 */

public class Solution {
  public boolean isPalindrome(ListNode head) {
    // count the total length;
    int count = 0;
    ListNode temp = head;
    while (temp != null) {
      count++;
      temp = temp.next;
    }

    // skip the first half;
    temp = head;
    for (int i = 0; i < count / 2; i++) {
      temp = temp.next;
    }

    // reverse the last half;
    ListNode half2 = null;
    while (temp != null) {
      ListNode thisNode = temp;
      temp = temp.next;
      thisNode.next = half2;
      half2 = thisNode;
    }

    // compare the two halves.
    while (half2 != null) {
      if (half2.val != head.val) {
        return false;
      } else {
        half2 = half2.next;
        head = head.next;
      }
    }

    return true;
  }
}
