package cn.hjmao.leetcode.a020validparentheses;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by hjmao on 15/02/2017.
 */
public class SolutionTest {
  private Solution solution;

  @BeforeMethod
  public void setUp() throws Exception {
    this.solution = new Solution();
  }

  @Test
  public void testIsValid1() throws Exception {
    String s = "";
    boolean expected = true;
    boolean actual = this.solution.isValid(s);

    assertEquals(actual, expected);
  }

  @Test
  public void testIsValid2() throws Exception {
    String s = "(";
    boolean expected = false;
    boolean actual = this.solution.isValid(s);

    assertEquals(actual, expected);
  }

  @Test
  public void testIsValid3() throws Exception {
    String s = "()";
    boolean expected = true;
    boolean actual = this.solution.isValid(s);

    assertEquals(actual, expected);
  }

  @Test
  public void testIsValid4() throws Exception {
    String s = "[]";
    boolean expected = true;
    boolean actual = this.solution.isValid(s);

    assertEquals(actual, expected);
  }

  @Test
  public void testIsValid5() throws Exception {
    String s = "(())[]";
    boolean expected = true;
    boolean actual = this.solution.isValid(s);

    assertEquals(actual, expected);
  }

  @Test
  public void testIsValid6() throws Exception {
    String s = "]";
    boolean expected = false;
    boolean actual = this.solution.isValid(s);

    assertEquals(actual, expected);
  }
}
