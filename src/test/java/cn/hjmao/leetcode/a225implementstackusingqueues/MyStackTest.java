package cn.hjmao.leetcode.a225implementstackusingqueues;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyStackTest {

  @Test
  public void testMyStack1() {
    MyStack obj = new MyStack();
    obj.push(1);
    obj.push(2);
    assertEquals(obj.top(), 2);
    assertEquals(obj.pop(), 2);
    assertFalse(obj.empty());
  }
}