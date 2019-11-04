package com.leetcode.snippets.a155minstack;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MinStackTest {

  @Test (enabled = MinStack.SOLUTION_DONE)
  public void testPush() {
    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    assertEquals(minStack.getMin(), -3);
    minStack.pop();
    assertEquals(minStack.top(), 0);
    assertEquals(minStack.getMin(), -2);
  }
}
