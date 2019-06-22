package cn.hjmao.leetcode.a707designlinkedlist;

import cn.hjmao.utils.list.ListNode;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/design-linked-list/
 *
 * Desc:
 * =====
 * Design your implementation of the linked list.
 * You can choose to use the singly linked list or the doubly linked list.
 * A node in a singly linked list should have two attributes: val and next.
 * val is the value of the current node, and next is a pointer/reference to the next node.
 * If you want to use the doubly linked list,
 * you will need one more attribute prev to indicate the previous node in the linked list.
 * Assume all nodes in the linked list are 0-indexed.
 *
 * Implement these functions in your linked list class:
 *
 * get(index) : Get the value of the index-th node in the linked list. If the index is invalid, return -1.
 * addAtHead(val) : Add a node of value val before the first element of the linked list.
 *                  After the insertion, the new node will be the first node of the linked list.
 * addAtTail(val) : Append a node of value val to the last element of the linked list.
 * addAtIndex(index, val) : Add a node of value val before the index-th node in the linked list.
 *                          If index equals to the length of linked list,
 *                          the node will be appended to the end of linked list.
 *                          If index is greater than the length, the node will not be inserted.
 * deleteAtIndex(index) : Delete the index-th node in the linked list, if the index is valid.
 *
 * Example:
 *
 * MyLinkedList linkedList = new MyLinkedList();
 * linkedList.addAtHead(1);
 * linkedList.addAtTail(3);
 * linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
 * linkedList.get(1);            // returns 2
 * linkedList.deleteAtIndex(1);  // now the linked list is 1->3
 * linkedList.get(1);            // returns 3
 * Note:
 *
 * All values will be in the range of [1, 1000].
 * The number of operations will be in the range of [1, 1000].
 * Please do not use the built-in LinkedList library.
 */

class MyLinkedList {
  ListNode head;
  ListNode tail;
  int length = 0;

  /**
   * Initialize your data structure here.
   */
  public MyLinkedList() {

  }

  /**
   * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
   */
  public int get(int index) {
    ListNode point = head;
    for (int i = 0; i < index; i++) {
      if (point == null) {
        break;
      } else {
        point = point.next;
      }
    }
    if (point == null) {
      return -1;
    } else {
      return point.val;
    }
  }

  /**
   * Add a node of value val before the first element of the linked list.
   * After the insertion, the new node will be the first node of the linked list.
   */
  public void addAtHead(int val) {
    ListNode node = new ListNode(val);
    node.next = head;
    head = node;
    if (tail == null) {
      tail = head;
    }
    length++;
  }

  /**
   * Append a node of value val to the last element of the linked list.
   */
  public void addAtTail(int val) {
    ListNode node = new ListNode(val);

    if (tail == null) {
      head = node;
      tail = node;
    } else {
      tail.next = node;
      tail = node;
    }
    length++;
  }

  /**
   * Add a node of value val before the index-th node in the linked list.
   * If index equals to the length of linked list, the node will be appended to the end of linked list.
   * If index is greater than the length, the node will not be inserted.
   */
  public void addAtIndex(int index, int val) {
    ListNode node = new ListNode(val);
    if (index == length) {
      addAtTail(val);
    } else if (index == 0) {
      addAtHead(val);
    } else if (index > 0 && index < length) {
      ListNode point = head;
      for (int i = 0; i < index - 1; i++) {
        point = point.next;
      }
      node.next = point.next;
      point.next = node;
      length++;
    }
  }

  /**
   * Delete the index-th node in the linked list, if the index is valid.
   */
  public void deleteAtIndex(int index) {
    if (index >= 0 && index < length) {
      ListNode point = head;
      for (int i = 0; i < index - 1; i++) {
        point = point.next;
      }
      if (point.next == null) {
        head = null;
        tail = null;
      } else {
        point.next = point.next.next;
      }
      length--;
    }
  }
}
