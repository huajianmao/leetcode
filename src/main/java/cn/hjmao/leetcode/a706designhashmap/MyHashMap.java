package cn.hjmao.leetcode.a706designhashmap;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/design-hashmap/
 *
 * Desc:
 * =====
 * Design a HashMap without using any built-in hash table libraries.
 *
 * To be specific, your design should include these functions:
 *
 * put(key, value) : Insert a (key, value) pair into the HashMap.
 *                   If the value already exists in the HashMap, update the value.
 * get(key): Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
 * remove(key) : Remove the mapping for the value key if this map contains the mapping for the key.
 *
 * Example:
 *
 * MyHashMap hashMap = new MyHashMap();
 * hashMap.put(1, 1);
 * hashMap.put(2, 2);
 * hashMap.get(1);            // returns 1
 * hashMap.get(3);            // returns -1 (not found)
 * hashMap.put(2, 1);          // update the existing value
 * hashMap.get(2);            // returns 1
 * hashMap.remove(2);          // remove the mapping for 2
 * hashMap.get(2);            // returns -1 (not found)
 *
 * Note:
 *
 * All keys and values will be in the range of [0, 1000000].
 * The number of operations will be in the range of [1, 10000].
 * Please do not use the built-in HashMap library.
 */

class MyHashMap {
  private Pair[][] queues;

  /**
   * Initialize your data structure here.
   */
  public MyHashMap() {
    queues = new Pair[1000][1001];
  }

  /**
   * value will always be non-negative.
   */
  public void put(int key, int value) {
    int[] index = hash(key);
    if (queues[index[0]][index[1]] == null) {
      queues[index[0]][index[1]] = new Pair(key, value);
    } else {
      queues[index[0]][index[1]].value = value;
    }
  }

  /**
   * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
   */
  public int get(int key) {
    int[] index = hash(key);
    if (queues[index[0]][index[1]] == null) {
      return -1;
    } else {
      return queues[index[0]][index[1]].value;
    }
  }

  /**
   * Removes the mapping of the specified value key if this map contains a mapping for the key.
   */
  public void remove(int key) {
    int[] index = hash(key);
    if (queues[index[0]][index[1]] != null) {
      queues[index[0]][index[1]] = null;
    }
  }

  private int[] hash(int key) {
    int[] index = new int[2];

    index[0] = key / 1001;
    index[1] = key % 1001;

    return index;
  }

  class Pair {
    Pair(int key, int value) {
      this.key = key;
      this.value = value;
    }

    int key;
    int value;
  }
}
