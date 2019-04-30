package cn.hjmao.leetcode.a024swapnodesinpairs;

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
  public void testSwapPairs1() throws Exception {
    ListNode head = new ListNode(1);
    ListNode expected = new ListNode(1);
    ListNode actual = this.solution.swapPairs(head);


    assertEquals(ListNodeUtils.equals(actual, expected), true);
  }

  @Test
  public void testSwapPairs2() throws Exception {
    ListNode head = null;
    ListNode expected = null;
    ListNode actual = this.solution.swapPairs(head);


    assertEquals(ListNodeUtils.equals(actual, expected), true);
  }

  @Test
  public void testSwapPairs3() throws Exception {
    int[] headInts = {1, 2, 3, 4};
    int[] resultInts = {2, 1, 4, 3};
    ListNode head = ListNodeUtils.createListFromArray(headInts);
    ListNode expected = ListNodeUtils.createListFromArray(resultInts);
    ListNode actual = this.solution.swapPairs(head);


    assertEquals(ListNodeUtils.equals(actual, expected), true);
  }

  @Test
  public void testSwapPairs4() throws Exception {
    int[] headInts = {1, 2, 3};
    int[] resultInts = {2, 1, 3};
    ListNode head = ListNodeUtils.createListFromArray(headInts);
    ListNode expected = ListNodeUtils.createListFromArray(resultInts);
    ListNode actual = this.solution.swapPairs(head);


    assertEquals(ListNodeUtils.equals(actual, expected), true);
  }

  @Test
  public void testSwapPairs5() throws Exception {
    int[] headInts = {1, 2, 3, 4, 5};
    int[] resultInts = {2, 1, 4, 3, 5};
    ListNode head = ListNodeUtils.createListFromArray(headInts);
    ListNode expected = ListNodeUtils.createListFromArray(resultInts);
    ListNode actual = this.solution.swapPairs(head);


    assertEquals(ListNodeUtils.equals(actual, expected), true);
  }
}
