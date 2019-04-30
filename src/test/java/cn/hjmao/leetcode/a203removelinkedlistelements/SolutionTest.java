package cn.hjmao.leetcode.a203removelinkedlistelements;

import cn.hjmao.utils.list.ListNode;
import cn.hjmao.utils.list.ListNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testRemoveElements1() {
    int[] nums = {1, 2, 6, 3, 4, 5, 6};
    ListNode head = ListNodeUtils.createListFromArray(nums);
    int val = 6;
    int[] expectNums = {1, 2, 3, 4, 5};
    ListNode expect = ListNodeUtils.createListFromArray(expectNums);
    ListNode actual = solution.removeElements(head, val);
    assertEquals(ListNodeUtils.listNodeToString(actual), ListNodeUtils.listNodeToString(expect));
  }

  @Test
  public void testRemoveElements2() {
    int[] nums = {6, 6, 6};
    ListNode head = ListNodeUtils.createListFromArray(nums);
    int val = 6;
    ListNode expect = null;
    ListNode actual = solution.removeElements(head, val);
    assertEquals(ListNodeUtils.listNodeToString(actual), ListNodeUtils.listNodeToString(expect));
  }
}
