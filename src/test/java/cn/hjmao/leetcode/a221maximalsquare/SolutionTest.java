package cn.hjmao.leetcode.a221maximalsquare;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void testMaximalSquare() {
        char[][] matrix = {
                {1, 0, 1, 0, 0},
                {1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 0, 0, 1, 0}};
        int expected = 4;

        assertEquals(solution.maximalSquare(matrix), expected);
    }
}