package cn.hjmao.leetcode.a019removenthnodefromendoflist;

import cn.hjmao.utils.list.ListNode;
import cn.hjmao.utils.list.ListNodeUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by hjmao on 17-2-15.
 */
public class SolutionTest {
  private Solution solution;

  @BeforeMethod
  public void setUp() throws Exception {
    this.solution = new Solution();
  }

  private ListNode createListFromArray(int[] nums) {
    ListNode head = null;

    for (int i = nums.length - 1; i >= 0; i--) {
      ListNode temp = new ListNode(nums[i]);
      temp.next = head;
      head = temp;
    }

    return head;
  }

  @Test
  public void testRemoveNthFromEnd1() throws Exception {
    int[] values = {1};
    ListNode head = createListFromArray(values);
    int n = 1;

    ListNode expected = null;

    ListNode actual = this.solution.removeNthFromEnd(head, n);
    assertEquals(ListNodeUtils.equals(actual, expected), true);
  }

  @Test
  public void testRemoveNthFromEnd2() throws Exception {
    int[] values = {1, 2, 3, 4, 5};
    ListNode head = createListFromArray(values);
    int n = 5;

    int[] expectedValues = {2, 3, 4, 5};
    ListNode expected = createListFromArray(expectedValues);

    ListNode actual = this.solution.removeNthFromEnd(head, n);
    assertEquals(ListNodeUtils.equals(actual, expected), true);
  }

  @Test
  public void testRemoveNthFromEnd3() throws Exception {
    int[] values = {1, 2, 3, 4, 5};
    ListNode head = createListFromArray(values);
    int n = 1;

    int[] expectedValues = {1, 2, 3, 4};
    ListNode expected = createListFromArray(expectedValues);

    ListNode actual = this.solution.removeNthFromEnd(head, n);
    assertEquals(ListNodeUtils.equals(actual, expected), true);
  }
}
