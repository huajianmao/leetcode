package cn.hjmao.leetcode.a066plusone;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertTrue;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testPlusOne1() {
        int[] digits = {1, 2, 3};
        int[] expect = {1, 2, 4};
        int[] actual = solution.plusOne(digits);

        Object[] expectObject = {expect};
        Object[] actualObject = {actual};

        assertTrue(Arrays.deepEquals(expectObject, actualObject));
    }

    @Test
    public void testPlusOne2() {
        int[] digits = {4, 3, 2, 1};
        int[] expect = {4, 3, 2, 2};
        int[] actual = solution.plusOne(digits);

        Object[] expectObject = {expect};
        Object[] actualObject = {actual};

        assertTrue(Arrays.deepEquals(expectObject, actualObject));
    }

    @Test
    public void testPlusOne3() {
        int[] digits = {4, 3, 2, 9};
        int[] expect = {4, 3, 3, 0};
        int[] actual = solution.plusOne(digits);

        Object[] expectObject = {expect};
        Object[] actualObject = {actual};

        assertTrue(Arrays.deepEquals(expectObject, actualObject));
    }

    @Test
    public void testPlusOne4() {
        int[] digits = {9, 9};
        int[] expect = {1, 0, 0};
        int[] actual = solution.plusOne(digits);

        Object[] expectObject = {expect};
        Object[] actualObject = {actual};

        assertTrue(Arrays.deepEquals(expectObject, actualObject));
    }
}
