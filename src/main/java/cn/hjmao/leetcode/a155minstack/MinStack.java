package cn.hjmao.leetcode.a155minstack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/min-stack/
 *
 * Desc:
 * =====
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 *
 *
 * Example:
 *
 * MinStack minValueStack = new MinStack();
 * minValueStack.push(-2);
 * minValueStack.push(0);
 * minValueStack.push(-3);
 * minValueStack.getMin();   --> Returns -3.
 * minValueStack.pop();
 * minValueStack.top();      --> Returns 0.
 * minValueStack.getMin();   --> Returns -2.
 */

public class MinStack {
  private Deque<Integer> stack = new LinkedList<>();
  private Deque<Integer> minValueStack = new LinkedList<>();

  public void push(int x) {
    stack.push(x);
    if (minValueStack.isEmpty()) {
      minValueStack.push(x);
    } else {
      int minTop = minValueStack.peek();
      if (x < minTop) {
        minValueStack.push(x);
      } else {
        minValueStack.push(minTop);
      }
    }
  }

  public void pop() {
    stack.pop();
    minValueStack.pop();
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return minValueStack.peek();
  }
}
