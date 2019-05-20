package cn.hjmao.utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by hjmao on 17-2-14.
 */
public class AssertUtils {

  // public static void assertEqualsOfTwoArrays(List<List<Integer>> actual, List<List<Integer>> expected) {
  //   if (areEqualsOfTwoArrays(actual, expected)) {
  //     assert true;
  //   } else {
  //     System.err.println("expected: " + expected);
  //     System.err.println("actual: " + actual);
  //     assert false;
  //   }
  // }

  private static String list2sortedStr(List<Integer> nums) {
    int[] actualInts = new int[nums.size()];
    for (int j = 0; j < nums.size(); j++) {
      actualInts[j] = nums.get(j);
    }
    Arrays.sort(actualInts);
    String actualSetStr = "";
    for (int j = 0; j < actualInts.length; j++) {
      actualSetStr = actualSetStr + "," + actualInts[j];
    }

    return actualSetStr;
  }

  public static boolean areEqualsOfTwoArrays(List<List<Integer>> actual, List<List<Integer>> expected) {
    if (actual != null && expected != null) {
      if (actual.size() != expected.size()) {
        return false;
      } else {
        Set<String> actualSet = new HashSet<>();
        Set<String> expectSet = new HashSet<>();
        for (int i = 0; i < actual.size(); i++) {
          List<Integer> actualElement = actual.get(i);
          String actualSetStr = list2sortedStr(actualElement);
          actualSet.add(actualSetStr);

          List<Integer> expectElement = expected.get(i);
          String expectSetStr = list2sortedStr(expectElement);
          expectSet.add(expectSetStr);
        }
        return actualSet.containsAll(expectSet) && expectSet.size() == actualSet.size();
      }
    } else if (actual == null && expected != null && expected.size() > 0) {
      return false;
    } else if (expected == null && actual != null && actual.size() > 0) {
      return false;
    } else {
      return actual == null && expected == null;
    }
  }

  public static String int2dArrayToString(int[][] array) {
    if (array == null) {
      return "null";
    }
    if (array.length == 0) {
      return "[]";
    }

    StringBuilder sb = new StringBuilder("[");
    for (int[] items : array) {
      sb.append("[");
      for (int item: items) {
        sb.append(Integer.toString(item));
        sb.append(",");
      }
      sb.setCharAt(sb.length() - 1, ']');
      sb.append(",");
    }

    sb.setCharAt(sb.length() - 1, ']');
    return sb.toString();
  }

  public static String intArrayToString(int[] array) {
    if (array == null) {
      return "null";
    }
    if (array.length == 0) {
      return "[]";
    }

    StringBuilder sb = new StringBuilder("[");
    for (int item: array) {
      sb.append(Integer.toString(item));
      sb.append(",");
    }

    sb.setCharAt(sb.length() - 1, ']');
    return sb.toString();
  }
}
