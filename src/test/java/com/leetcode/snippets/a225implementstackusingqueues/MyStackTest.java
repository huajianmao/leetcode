package com.leetcode.snippets.a225implementstackusingqueues;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class MyStackTest {

  @Test (enabled = MyStack.SOLUTION_DONE)
  public void testMyStack1() {
    MyStack obj = new MyStack();
    obj.push(1);
    obj.push(2);
    assertEquals(obj.top(), 2);
    assertEquals(obj.pop(), 2);
    assertFalse(obj.empty());
  }
}
