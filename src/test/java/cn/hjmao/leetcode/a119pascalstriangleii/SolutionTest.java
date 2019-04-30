package cn.hjmao.leetcode.a119pascalstriangleii;

import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void testGetRow0() {
        int rowIndex = 0;
        Integer[] expected = {1};
        List<Integer> expect = Arrays.asList(expected);
        List<Integer> actual = solution.getRow(rowIndex);
        assertEquals(actual, expect);
    }

    @Test
    public void testGetRow3() {
        int rowIndex = 3;
        Integer[] expected = {1, 3, 3, 1};
        List<Integer> expect = Arrays.asList(expected);
        List<Integer> actual = solution.getRow(rowIndex);
        assertEquals(actual, expect);
    }
}
