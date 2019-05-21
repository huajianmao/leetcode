package cn.hjmao.leetcode.a141linkedlistcycle;

import cn.hjmao.utils.list.ListNode;
import cn.hjmao.utils.list.ListNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

  private Solution solution = new Solution();

  @Test
  public void testHasCycle1() {
    int[] array = {3, 2, 0, -4};
    int pos = 1;
    ListNode head = ListNodeUtils.createListFromArray(array, pos);
    boolean expect = true;
    boolean actual = solution.hasCycle(head);
    assertEquals(actual, expect);
  }

  @Test
  public void testHasCycle2() {
    int[] array = {1, 2};
    int pos = 0;
    ListNode head = ListNodeUtils.createListFromArray(array, pos);
    boolean expect = true;
    boolean actual = solution.hasCycle(head);
    assertEquals(actual, expect);
  }

  @Test
  public void testHasCycle3() {
    int[] array = {1};
    int pos = -1;
    ListNode head = ListNodeUtils.createListFromArray(array, pos);
    boolean expect = false;
    boolean actual = solution.hasCycle(head);
    assertEquals(actual, expect);
  }
}
