package cn.hjmao.leetcode.a160intersectionoftwolinkedlists;

import cn.hjmao.utils.list.ListNode;
import cn.hjmao.utils.list.ListNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test
  public void testGetIntersectionNode() {
    int[] arrayA = {4, 1, 8, 4, 5};
    ListNode headA = ListNodeUtils.createListFromArray(arrayA);
    int[] arrayB = {5, 0, 1, 8, 4, 5};
    ListNode headB = ListNodeUtils.createListFromArray(arrayB);

    solution.getIntersectionNode(headA, headB);
  }
}
