package cn.hjmao.leetcode.a058lengthoflastword;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testLengthOfLastWord1() {
        String s = "Hello World";
        int expected = 5;
        int actual = solution.lengthOfLastWord(s);

        assertEquals(actual, expected);
    }

    @Test
    public void testLengthOfLastWordWithBlankString() {
        String s = "";
        int expected = 0;
        int actual = solution.lengthOfLastWord(s);

        assertEquals(actual, expected);
    }

    @Test
    public void testLengthOfLastWordWithSpaceString() {
        String s = " ";
        int expected = 0;
        int actual = solution.lengthOfLastWord(s);

        assertEquals(actual, expected);
    }

    @Test
    public void testLengthOfLastWordWithTwoSpacesString() {
        String s = " ";
        int expected = 0;
        int actual = solution.lengthOfLastWord(s);

        assertEquals(actual, expected);
    }

    @Test
    public void testLengthOfLastWordWithLastSpaceString() {
        String s = "Hello ";
        int expected = 5;
        int actual = solution.lengthOfLastWord(s);

        assertEquals(actual, expected);
    }

    @Test
    public void testLengthOfLastWordWithAString() {
        String s = "a ";
        int expected = 1;
        int actual = solution.lengthOfLastWord(s);

        assertEquals(actual, expected);
    }

    @Test
    public void testLengthOfLastWordWithBlankPrefixString() {
        String s = " a";
        int expected = 1;
        int actual = solution.lengthOfLastWord(s);

        assertEquals(actual, expected);
    }
}