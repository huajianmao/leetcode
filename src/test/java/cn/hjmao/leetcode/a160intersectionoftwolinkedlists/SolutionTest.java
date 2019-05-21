package cn.hjmao.leetcode.a160intersectionoftwolinkedlists;

import cn.hjmao.utils.list.ListNode;
import cn.hjmao.utils.list.ListNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test
  public void testGetIntersectionNode() {
    int[] arrayCommon = {8, 4, 5};
    ListNode common = ListNodeUtils.createListFromArray(arrayCommon);
    int[] arrayA = {4, 1};
    ListNode headA = ListNodeUtils.createListFromArray(arrayA);
    headA.next.next = common;
    int[] arrayB = {5, 0, 1};
    ListNode headB = ListNodeUtils.createListFromArray(arrayB);
    headB.next.next.next = common;
    ListNode expect = common;
    ListNode actual = solution.getIntersectionNode(headA, headB);
    assertEquals(ListNodeUtils.listNodeToString(actual), ListNodeUtils.listNodeToString(expect));
  }
}
