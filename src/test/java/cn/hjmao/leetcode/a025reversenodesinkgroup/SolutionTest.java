package cn.hjmao.leetcode.a025reversenodesinkgroup;

import cn.hjmao.utils.list.ListNode;
import cn.hjmao.utils.list.ListNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by hjmao on 17-2-19.
 */
public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testReverseKGroup1() throws Exception {
    int[] listNums = {1, 2, 3, 4, 5};
    ListNode head = ListNodeUtils.createListFromArray(listNums);
    int k = 2;

    int[] expectedNums = {2, 1, 4, 3, 5};
    ListNode expected = ListNodeUtils.createListFromArray(expectedNums);

    ListNode actual = this.solution.reverseKGroup(head, k);

    assertEquals(ListNodeUtils.equals(actual, expected), true);
  }

  @Test
  public void testReverseKGroup2() throws Exception {
    int[] listNums = {1, 2, 3, 4, 5};
    ListNode head = ListNodeUtils.createListFromArray(listNums);
    int k = 3;

    int[] expectedNums = {3, 2, 1, 4, 5};
    ListNode expected = ListNodeUtils.createListFromArray(expectedNums);

    ListNode actual = this.solution.reverseKGroup(head, k);

    assertEquals(ListNodeUtils.equals(actual, expected), true);
  }

  @Test
  public void testReverseKGroup3() throws Exception {
    int[] listNums = {1};
    ListNode head = ListNodeUtils.createListFromArray(listNums);
    int k = 2;

    int[] expectedNums = {1};
    ListNode expected = ListNodeUtils.createListFromArray(expectedNums);

    ListNode actual = this.solution.reverseKGroup(head, k);

    assertEquals(ListNodeUtils.equals(actual, expected), true);
  }

  @Test
  public void testReverseKGroup4() throws Exception {
    int[] listNums = {1};
    ListNode head = ListNodeUtils.createListFromArray(listNums);
    int k = 1;

    int[] expectedNums = {1};
    ListNode expected = ListNodeUtils.createListFromArray(expectedNums);

    ListNode actual = this.solution.reverseKGroup(head, k);

    assertEquals(ListNodeUtils.equals(actual, expected), true);
  }
}
