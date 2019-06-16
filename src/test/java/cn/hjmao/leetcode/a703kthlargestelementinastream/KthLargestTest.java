package cn.hjmao.leetcode.a703kthlargestelementinastream;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KthLargestTest {

  @Test
  public void testAdd1() {
    int k = 3;
    int[] nums = {4, 5, 8, 2};
    KthLargest obj = new KthLargest(k, nums);
    assertEquals(obj.add(3), 4);
    assertEquals(obj.add(5), 5);
    assertEquals(obj.add(10), 5);
    assertEquals(obj.add(9), 8);
    assertEquals(obj.add(4), 8);
  }

  @Test
  public void testAdd2() {
    int k = 1;
    int[] nums = {};
    KthLargest obj = new KthLargest(k, nums);
    assertEquals(obj.add(-3), -3);
    assertEquals(obj.add(-2), -2);
    assertEquals(obj.add(-4), -2);
    assertEquals(obj.add(0), 0);
    assertEquals(obj.add(4), 4);
  }
}