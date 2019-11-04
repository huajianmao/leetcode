package com.leetcode.snippets.a237deletenodeinalinkedlist;

import cn.hjmao.utils.list.ListNode;
import cn.hjmao.utils.list.ListNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test (enabled = Solution.SOLUTION_DONE)
  public void testDeleteNode() {
    int[] nums = {4, 5, 1, 9};
    ListNode list = ListNodeUtils.createListFromArray(nums);
    int[] expectNums = {4, 1, 9};
    ListNode expect = ListNodeUtils.createListFromArray(expectNums);

    ListNode node = list.next;
    solution.deleteNode(node);
    assertEquals(ListNodeUtils.listNodeToString(list), ListNodeUtils.listNodeToString(expect));
  }
}
