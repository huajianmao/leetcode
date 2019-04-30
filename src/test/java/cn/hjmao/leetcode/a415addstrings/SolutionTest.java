package cn.hjmao.leetcode.a415addstrings;

import org.testng.annotations.Test;

import java.math.BigInteger;
import java.util.Random;

import static org.testng.Assert.assertEquals;

public class SolutionTest {
  Solution solution = new Solution();

  @Test
  public void testAddStrings1() {
    String num1 = "123";
    String num2 = "567";
    String expect = "690";
    String actual = solution.addStrings("" + num1, "" + num2);
    assertEquals(actual, expect);
  }

  @Test
  public void testAddStrings2() {
    for (int i = 0; i < 1000; i++) {
      BigInteger num1 = nextBigInteger(5100);
      BigInteger num2 = nextBigInteger(5100);
      String expect = num1.add(num2).toString();
      String actual = solution.addStrings("" + num1, "" + num2);
      assertEquals(actual, expect);
    }
  }

  private BigInteger nextBigInteger(int length) {
    Random random = new Random();
    return new BigInteger(length, random);
  }
}
