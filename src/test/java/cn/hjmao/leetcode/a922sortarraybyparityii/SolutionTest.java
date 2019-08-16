package cn.hjmao.leetcode.a922sortarraybyparityii;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertTrue;

public class SolutionTest {
  private Solution solution = new Solution();

  @Test
  public void testSortArrayByParityII1() {
    int[] a = {4, 2, 5, 7};
    int[] expect = {4, 5, 2, 7};
    int[] actual = solution.sortArrayByParityII(a);
    assertTrue(mapEqual(array2Map(actual), array2Map(expect)));
    for (int i = 0; i < actual.length; i++) {
      assertTrue(i % 2 == actual[i] % 2);
    }
  }

  @Test
  public void testSortArrayByParityII2() {
    int[] a = {2, 3};
    int[] expect = {2, 3};
    int[] actual = solution.sortArrayByParityII(a);
    assertTrue(mapEqual(array2Map(actual), array2Map(expect)));
    for (int i = 0; i < actual.length; i++) {
      assertTrue(i % 2 == actual[i] % 2);
    }
  }

  private Map<Integer, Integer> array2Map(int[] array) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num: array) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    return map;
  }

  private boolean mapEqual(Map<Integer, Integer> map1, Map<Integer, Integer> map2) {
    if (map1 == null && map2 == null) {
      return true;
    } else if (map1 != null && map2 != null && map1.keySet().equals(map2.keySet())) {
      for (int num: map1.keySet()) {
        if (map1.get(num) != map2.get(num)) {
          return false;
        }
      }
      return true;
    } else {
      return false;
    }
  }
}