package cn.hjmao.leetcode.a234palindromelinkedlist;

import cn.hjmao.utils.list.ListNode;
import cn.hjmao.utils.list.ListNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testIsPalindrome1() {
    int[] nums = {1, 2};
    ListNode head = ListNodeUtils.createListFromArray(nums);
    boolean actual = solution.isPalindrome(head);
    assertFalse(actual);
  }

  @Test
  public void testIsPalindrome2() {
    int[] nums = {1, 2, 2, 1};
    ListNode head = ListNodeUtils.createListFromArray(nums);
    boolean actual = solution.isPalindrome(head);
    assertTrue(actual);
  }

  @Test
  public void testIsPalindrome3() {
    int[] nums = {1, 2, 1};
    ListNode head = ListNodeUtils.createListFromArray(nums);
    boolean actual = solution.isPalindrome(head);
    assertTrue(actual);
  }

  @Test
  public void testIsPalindrome4() {
    int[] nums = {1};
    ListNode head = ListNodeUtils.createListFromArray(nums);
    boolean actual = solution.isPalindrome(head);
    assertTrue(actual);
  }
}
