package cn.hjmao.leetcode.a083removeduplicatesfromsortedlist;

import cn.hjmao.utils.AssertUtils;
import cn.hjmao.utils.list.ListNode;
import cn.hjmao.utils.list.ListNodeUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void testDeleteDuplicates1() throws Exception {
        ListNode head = null;
        ListNode expected = null;
        ListNode actual = this.solution.deleteDuplicates(head);

        assertEquals(actual, expected);
    }

    @Test
    public void testDeleteDuplicates2() {
        int[] headArray = {1, 1, 2};
        ListNode head = ListNodeUtils.createListFromArray(headArray);

        int[] expectedArray = {1, 2};
        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);

        ListNode actual = this.solution.deleteDuplicates(head);

        assertTrue(ListNodeUtils.equals(actual, expected));
    }

    @Test
    public void testDeleteDuplicates3() {
        int[] headArray = {1, 1, 2, 2};
        ListNode head = ListNodeUtils.createListFromArray(headArray);

        int[] expectedArray = {1, 2};
        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);

        ListNode actual = this.solution.deleteDuplicates(head);

        assertTrue(ListNodeUtils.equals(actual, expected));
    }

    @Test
    public void testDeleteDuplicates4() {
        int[] headArray = {1, 1, 2, 3, 3};
        ListNode head = ListNodeUtils.createListFromArray(headArray);

        int[] expectedArray = {1, 2, 3};
        ListNode expected = ListNodeUtils.createListFromArray(expectedArray);

        ListNode actual = this.solution.deleteDuplicates(head);

        assertTrue(ListNodeUtils.equals(actual, expected));
    }
}