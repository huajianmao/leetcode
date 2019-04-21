package cn.hjmao.leetcode.a232implementqueueusingstacks;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyQueueTest {

  @Test
  public void testCase1() {
    MyQueue obj = new MyQueue();
    int x = 3;
    obj.push(x);
    assertEquals(obj.peek(), x);
    assertEquals(obj.pop(), x);
    assertTrue(obj.empty());
  }
}