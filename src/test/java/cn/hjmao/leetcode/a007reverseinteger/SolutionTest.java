package cn.hjmao.leetcode.a007reverseinteger;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by hjmao on 17-1-19.
 */
public class SolutionTest {
  private Solution solution;

  @BeforeMethod
  public void setUp() throws Exception {
    this.solution = new Solution();
  }

  @Test
  public void testReverse1() throws Exception {
    int x = 123;
    int expected = 321;

    assertEquals(this.solution.reverse(x), expected);
  }

  @Test
  public void testReverse2() throws Exception {
    int x = -123;
    int expected = -321;

    assertEquals(this.solution.reverse(x), expected);
  }

  @Test
  public void testReverse3() throws Exception {
    int x = -12300;
    int expected = -321;

    assertEquals(this.solution.reverse(x), expected);
  }

  @Test
  public void testReverse4() throws Exception {
    int x = 100000003;
    int expected = 300000001;

    assertEquals(this.solution.reverse(x), expected);
  }

  @Test
  public void testReverse5() throws Exception {
    int x = 1000000003;
    int expected = 0;

    assertEquals(this.solution.reverse(x), expected);
  }

  @Test
  public void testReverse6() throws Exception {
    int x = -1000000003;
    int expected = 0;

    assertEquals(this.solution.reverse(x), expected);
  }

  @Test
  public void testReverse7() throws Exception {
    int x = -1563847412;
    int expected = 0;

    assertEquals(this.solution.reverse(x), expected);
  }
}
