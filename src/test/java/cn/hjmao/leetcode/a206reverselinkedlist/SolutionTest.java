package cn.hjmao.leetcode.a206reverselinkedlist;

import cn.hjmao.utils.list.ListNode;
import cn.hjmao.utils.list.ListNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testReverseList1() {
    int[] nums = {1, 2, 3, 4, 5};
    ListNode head = ListNodeUtils.createListFromArray(nums);
    int[] expectNums = {5, 4, 3, 2, 1};
    ListNode expect = ListNodeUtils.createListFromArray(expectNums);
    ListNode actual = solution.reverseList(head);
    assertEquals(ListNodeUtils.listNodeToString(actual), ListNodeUtils.listNodeToString(expect));
  }
}
