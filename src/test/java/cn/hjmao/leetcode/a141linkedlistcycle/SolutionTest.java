package cn.hjmao.leetcode.a141linkedlistcycle;

import cn.hjmao.utils.list.ListNode;
import cn.hjmao.utils.list.ListNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

  @Test
  public void testHasCycle() {
    int[] array = {3,2,0,-4};
    ListNode head = ListNodeUtils.createListFromArray(array);
  }
}