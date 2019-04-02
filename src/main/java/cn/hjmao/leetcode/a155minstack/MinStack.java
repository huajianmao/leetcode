package cn.hjmao.leetcode.a155minstack;

import java.util.Stack;

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
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 */

public class MinStack {
  private Stack<Integer> stack = new Stack<>();
  private Stack<Integer> minStack = new Stack<>();

  public MinStack() {
  }

  public void push(int x) {
    stack.push(x);
    if (minStack.empty()) {
      minStack.push(x);
    } else {
      int minTop = minStack.peek();
      if (x < minTop) {
        minStack.push(x);
      } else {
        minStack.push(minTop);
      }
    }
  }

  public void pop() {
    stack.pop();
    minStack.pop();
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return minStack.peek();
  }
}
