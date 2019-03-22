package cn.hjmao.leetcode.a046permutations;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/permutations/
 *
 * Desc:
 * =====
 * Given a collection of distinct integers, return all possible permutations.
 *
 * Example:
 *
 * Input: [1,2,3]
 * Output:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 */

public class Solution {
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      if (result.size() == 0) {
        List<Integer> thisOne = new ArrayList<>();
        thisOne.add(nums[i]);
        result.add(thisOne);
      } else {
        List<List<Integer>> temp = new ArrayList<>();
        for (int j = 0; j < result.size(); j++) {
          for (int k = 0; k <= i; k++) {
            List<Integer> resultJ = result.get(j);
            List<Integer> copied = new ArrayList<>();
            for (int q = 0; q < resultJ.size(); q++) {
              copied.add(resultJ.get(q));
            }
            copied.add(k, nums[i]);
            temp.add(copied);
          }
        }
        result = temp;
      }
    }

    return result;
  }

  public List<List<Integer>> permute1(int[] nums) {
    return helper(nums, nums.length);
  }

  private List<List<Integer>> helper(int[] nums, int count) {
    List<List<Integer>> result = new ArrayList<>();
    if (count <= 0) {
      return result;
    } else if (count == 1) {
      List<Integer> item = new ArrayList<>();
      item.add(nums[0]);
      result.add(item);
      return result;
    } else {
      for (int i = 0; i < count; i++) {
        int thisValue = nums[i];
        nums[i] = nums[count - 1];
        List<List<Integer>> sub = helper(nums, count - 1);
        for (int j = 0; j < sub.size(); j++) {
          List<Integer> item = sub.get(j);
          item.add(0, thisValue);
          result.add(item);
        }
        nums[i] = thisValue;
      }
      return result;
    }
  }
}
