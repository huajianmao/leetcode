package cn.hjmao.leetcode.a021mergetwosortedlists;

import cn.hjmao.utils.list.ListNode;
import cn.hjmao.utils.list.ListNodeUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by hjmao on 15/02/2017.
 */
public class SolutionTest {
  private Solution solution;

  @BeforeMethod
  public void setUp() throws Exception {
    this.solution = new Solution();
  }

  @Test
  public void testMergeTwoLists1() throws Exception {
    int[] l1Array = {1, 2, 3, 4, 5};
    int[] l2Array = {1, 3, 4, 5};
    ListNode l1 = ListNodeUtils.createListFromArray(l1Array);
    ListNode l2 = ListNodeUtils.createListFromArray(l2Array);

    int[] expectedArray = {1, 1, 2, 3, 3, 4, 4, 5, 5};
    ListNode expected = ListNodeUtils.createListFromArray(expectedArray);

    ListNode actual = this.solution.mergeTwoLists(l1, l2);

    assertEquals(ListNodeUtils.equals(actual, expected), true);
  }
}