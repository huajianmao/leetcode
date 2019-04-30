package cn.hjmao.leetcode.a232implementqueueusingstacks;

import java.util.Stack;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/implement-queue-using-stacks/
 *
 * Desc:
 * =====
 * Implement the following operations of a queue using stacks.
 *
 * push(x) -- Push element x to the back of queue.
 * pop() -- Removes the element from in front of queue.
 * peek() -- Get the front element.
 * empty() -- Return whether the queue is empty.
 * Example:
 *
 * MyQueue queue = new MyQueue();
 *
 * queue.push(1);
 * queue.push(2);
 * queue.peek();  // returns 1
 * queue.pop();   // returns 1
 * queue.empty(); // returns false
 * Notes:
 *
 * You must use only standard operations of a stack
 * -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
 * Depending on your language, stack may not be supported natively.
 * You may simulate a stack by using a list or deque (double-ended queue),
 * as long as you use only standard operations of a stack.
 * You may assume that all operations are valid
 * (for example, no pop or peek operations will be called on an empty queue).
 */

public class MyQueue {
  /** Initialize your data structure here. */
  Stack<Integer> reversed = new Stack<>();
  Stack<Integer> input = new Stack<>();

  public MyQueue() {

  }

  /** Push element x to the back of queue. */
  public void push(int x) {
    input.push(x);
  }

  /** Removes the element from in front of queue and returns that element. */
  public int pop() {
    if (reversed.isEmpty()) {
      while (!input.isEmpty()) {
        reversed.push(input.pop());
      }
    }
    return reversed.pop();
  }

  /** Get the front element. */
  public int peek() {
    if (reversed.isEmpty()) {
      while (!input.isEmpty()) {
        reversed.push(input.pop());
      }
    }
    return reversed.peek();
  }

  /** Returns whether the queue is empty. */
  public boolean empty() {
    return reversed.isEmpty() && input.isEmpty();
  }
}
