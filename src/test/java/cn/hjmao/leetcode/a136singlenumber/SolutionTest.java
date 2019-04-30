package cn.hjmao.leetcode.a136singlenumber;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testSingleNumber1() {
        int[] nums = {2, 2, 1};
        int expect = 1;
        int actual = solution.singleNumber(nums);
        assertEquals(actual, expect);
    }

    @Test
    public void testSingleNumber2() {
        int[] nums = {4, 1, 2, 1, 2};
        int expect = 4;
        int actual = solution.singleNumber(nums);
        assertEquals(actual, expect);
    }
}
