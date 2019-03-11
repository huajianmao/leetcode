package cn.hjmao.leetcode.a088mergesortedarray;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testMerge() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        int[] expect = {1, 2, 2, 3, 5, 6};
        solution.merge(nums1, m, nums2, n);

        Object[] expectObject = {expect};
        Object[] actualObject = {nums1};

        assertTrue(Arrays.deepEquals(expectObject, actualObject));
    }
}