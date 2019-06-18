package cn.hjmao.leetcode.a705designhashset;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/design-hashset/
 *
 * Desc:
 * =====
 * Design a HashSet without using any built-in hash table libraries.
 *
 * To be specific, your design should include these functions:
 *
 * add(value): Insert a value into the HashSet.
 * contains(value) : Return whether the value exists in the HashSet or not.
 * remove(value): Remove a value in the HashSet. If the value does not exist in the HashSet, do nothing.
 *
 * Example:
 *
 * MyHashSet hashSet = new MyHashSet();
 * hashSet.add(1);
 * hashSet.add(2);
 * hashSet.contains(1);    // returns true
 * hashSet.contains(3);    // returns false (not found)
 * hashSet.add(2);
 * hashSet.contains(2);    // returns true
 * hashSet.remove(2);
 * hashSet.contains(2);    // returns false (already removed)
 *
 * Note:
 *
 * All values will be in the range of [0, 1000000].
 * The number of operations will be in the range of [1, 10000].
 * Please do not use the built-in HashSet library..
 */

class MyHashSet {
  private boolean[][] occurs;

  /**
   * Initialize your data structure here.
   */
  public MyHashSet() {
    occurs = new boolean[1000][1001];
  }

  public void add(int key) {
    int[] index = hash(key);
    occurs[index[0]][index[1]] = true;
  }

  public void remove(int key) {
    int[] index = hash(key);
    occurs[index[0]][index[1]] = false;
  }

  /**
   * Returns true if this set contains the specified element.
   */
  public boolean contains(int key) {
    int[] index = hash(key);
    return occurs[index[0]][index[1]];
  }

  private int[] hash(int key) {
    int[] index = new int[2];

    index[0] = key / 1001;
    index[1] = key % 1001;

    return index;
  }
}
