package cn.hjmao.leetcode.a067addbinary;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testAddBinary1() {
        String a = "11";
        String b = "1";
        String expcted = "100";

        String actual = solution.addBinary(a, b);

        assertEquals(actual, expcted);
    }

    @Test
    public void testAddBinary2() {
        String a = "1010";
        String b = "1011";
        String expcted = "10101";

        String actual = solution.addBinary(a, b);

        assertEquals(actual, expcted);
    }
}
