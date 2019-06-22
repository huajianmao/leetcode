package cn.hjmao.leetcode.a707designlinkedlist;

import cn.hjmao.utils.list.ListNode;
import cn.hjmao.utils.list.ListNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

public class MyLinkedListTest {

  @Test
  public void testMyLinkedList1() {
    MyLinkedList linkedList = new MyLinkedList();
    assertNotNull(linkedList);
    linkedList.addAtHead(1);
    linkedList.addAtTail(3);
    linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
    assertEquals(linkedList.get(1), 2);            // returns 2
    linkedList.deleteAtIndex(1);  // now the linked list is 1->3
    assertEquals(linkedList.get(1), 3);            // returns 3
    assertEquals(linkedList.get(1000), -1);
  }

  @Test
  public void testMyLinkedList2() {
    MyLinkedList linkedList = new MyLinkedList();
    assertNotNull(linkedList);
    linkedList.addAtIndex(0, 1);
    linkedList.addAtIndex(0, 2);
    linkedList.addAtIndex(0, 3);  // linked list becomes 3->2->1
    int[] nums = {3, 2, 1};
    ListNode expect = ListNodeUtils.createListFromArray(nums);
    assertEquals(ListNodeUtils.listNodeToString(linkedList.head), ListNodeUtils.listNodeToString(expect));
    linkedList.addAtTail(4);

    int[] numsAdded = {3, 2, 1, 4};
    expect = ListNodeUtils.createListFromArray(numsAdded);
    assertEquals(ListNodeUtils.listNodeToString(linkedList.head), ListNodeUtils.listNodeToString(expect));
  }

  @Test
  public void testMyLinkedList3() {
    MyLinkedList linkedList = new MyLinkedList();
    assertNotNull(linkedList);
    linkedList.addAtTail(1);
    assertEquals(linkedList.get(0), 1);
    linkedList.addAtTail(1);
    linkedList.addAtTail(1);
    linkedList.addAtTail(1);
    linkedList.addAtTail(1);
    linkedList.addAtTail(1);
    linkedList.addAtIndex(3,2);
    assertEquals(linkedList.get(3), 2);
    linkedList.deleteAtIndex(3);
    assertEquals(linkedList.get(3), 1);
  }

  @Test
  public void testMyLinkedList4() {
    MyLinkedList linkedList = new MyLinkedList();
    linkedList.addAtHead(1);
    linkedList.addAtIndex(1, 2);
    assertEquals(linkedList.get(1), 2);
    assertEquals(linkedList.get(0), 1);
    assertEquals(linkedList.get(2), -1);
  }

  @Test
  public void testMyLinkedList5() {
    MyLinkedList linkedList = new MyLinkedList();
    linkedList.addAtHead(1);
    linkedList.deleteAtIndex(0);
    assertEquals(linkedList.length, 0);
    assertNull(linkedList.head);
    assertNull(linkedList.tail);
  }
}