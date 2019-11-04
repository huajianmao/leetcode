package com.leetcode.snippets.a933numberofrecentcalls;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RecentCounterTest {

  @Test (enabled = RecentCounter.SOLUTION_DONE)
  public void testPing1() {
    RecentCounter counter = new RecentCounter();
    int number = 0;
    number = counter.ping(1);
    assertEquals(number, 1);
    number = counter.ping(100);
    assertEquals(number, 2);
    number = counter.ping(3001);
    assertEquals(number, 3);
    number = counter.ping(3002);
    assertEquals(number, 3);
  }
}
