package cn.hjmao.leetcode.a705designhashset;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

public class MyHashSetTest {

  @Test
  public void testMyHashSet() {
    MyHashSet hashSet = new MyHashSet();
    assertNotNull(hashSet);
    hashSet.add(1);
    hashSet.add(2);
    assertTrue(hashSet.contains(1));    // returns true
    assertFalse(hashSet.contains(3));    // returns false (not found)
    hashSet.add(2);
    assertTrue(hashSet.contains(2));    // returns true
    hashSet.remove(2);
    assertFalse(hashSet.contains(2));    // returns false (already removed)
    assertFalse(hashSet.contains(1000000));    // returns false
    hashSet.add(1000000);
    assertTrue(hashSet.contains(1000000));    // returns true
    assertFalse(hashSet.contains(0));    // returns false
    hashSet.add(0);
    assertTrue(hashSet.contains(0));    // returns true
  }
}