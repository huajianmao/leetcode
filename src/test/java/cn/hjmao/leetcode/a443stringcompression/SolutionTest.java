package cn.hjmao.leetcode.a443stringcompression;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testCompress1() {
    char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
    char[] expect = {'a', '2', 'b', '2', 'c', '3'};
    int actual = solution.compress(chars);
    assertEquals(actual, expect.length);
    for (int i = 0; i < expect.length; i++) {
      assertEquals(chars[i], expect[i]);
    }
  }

  @Test
  public void testCompress2() {
    char[] chars = {'a'};
    char[] expect = {'a'};
    int actual = solution.compress(chars);
    assertEquals(actual, expect.length);
    for (int i = 0; i < expect.length; i++) {
      assertEquals(chars[i], expect[i]);
    }
  }

  @Test
  public void testCompress3() {
    char[] chars = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
    char[] expect = {'a', 'b', '1', '2'};
    int actual = solution.compress(chars);
    assertEquals(actual, expect.length);
    for (int i = 0; i < expect.length; i++) {
      assertEquals(chars[i], expect[i]);
    }
  }
}
