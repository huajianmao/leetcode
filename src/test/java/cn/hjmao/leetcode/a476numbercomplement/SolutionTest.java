package cn.hjmao.leetcode.a476numbercomplement;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by hjmao on 22/01/2017.
 */
public class SolutionTest {
  private Solution solution;

  @BeforeMethod
  public void setUp() throws Exception {
    this.solution = new Solution();
  }

  @Test
  public void testFindComplement1() throws Exception {
    int num = 5;
    int expected = 2;
    assertEquals(this.solution.findComplement(num), expected);
  }

  @Test
  public void testFindComplement2() throws Exception {
    int num = 1;
    int expected = 0;
    assertEquals(this.solution.findComplement(num), expected);
  }

  @Test
  public void testFindComplement3() throws Exception {
    int num = Integer.MAX_VALUE;
    int expected = 0;
    assertEquals(this.solution.findComplement(num), expected);
  }

  @Test
  public void testFindComplement4() throws Exception {
    int num = Integer.MAX_VALUE - 1;
    int expected = 1;
    assertEquals(this.solution.findComplement(num), expected);
  }
}
