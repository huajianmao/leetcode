package com.leetcode.snippets.a706designhashmap;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MyHashMapTest {

  @Test (enabled = MyHashMap.SOLUTION_DONE)
  public void testMyHashMap() {
    MyHashMap hashMap = new MyHashMap();
    hashMap.put(1, 1);
    hashMap.put(2, 2);
    assertEquals(hashMap.get(1), 1);             // returns 1
    assertEquals(hashMap.get(3), -1);            // returns -1 (not found)
    hashMap.put(2, 1);                                    // update the existing value
    assertEquals(hashMap.get(2), 1);             // returns 1
    hashMap.remove(2);                               // remove the mapping for 2
    assertEquals(hashMap.get(2), -1);            // returns -1 (not found)
  }
}
