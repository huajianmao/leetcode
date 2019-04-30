package cn.hjmao.leetcode.a070climbingstairs;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testClimbStairs() {
        int n = 2;
        int expected = 2;

        int actual = solution.climbStairs(n);
        assertEquals(actual, expected);
    }

    @Test
    public void testClimbStairs2() {
        int n = 3;
        int expected = 3;

        int actual = solution.climbStairs(n);
        assertEquals(actual, expected);
    }

    @Test
    public void testClimbStairs35() {
        int n = 35;
        int expected = 14930352;

        int actual = solution.climbStairs(n);
        assertEquals(actual, expected);
    }
}
