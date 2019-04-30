package cn.hjmao.leetcode.a039combinationsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/combination-sum
 *
 * Desc:
 * =====
 * Given a set of candidate numbers (C) (without duplicates) and a target number (T),
 * find all unique combinations in C where the candidate numbers sums to T.
 *
 * The same repeated number may be chosen from C unlimited number of times.
 *
 * Note:
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 *
 * For example, given candidate set [2, 3, 6, 7] and target 7,
 * A solution set is:
 * [
 *   [7],
 *   [2, 2, 3]
 * ]
 */

public class Solution {
  private List<List<Integer>> combinationSumInRange(int[] candidates, int target, int length) {
    List<List<Integer>> combinations = new ArrayList<>();

    if (length == 1) {
      if (target % candidates[0] == 0) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < target / candidates[0]; i++) {
          temp.add(candidates[0]);
        }
        combinations.add(temp);
      }
      return combinations;
    }

    if (candidates[length - 1] > target) {
      return combinationSumInRange(candidates, target, length - 1);
    } else {
      int thisOne = candidates[length - 1];

      if (thisOne == target) {
        List<Integer> temp = new ArrayList<>();
        temp.add(target);
        combinations.add(temp);
      } else {
        for (int i = 1; i < target / thisOne + 1; i++) {
          List<List<Integer>> temp = combinationSumInRange(candidates, target - thisOne * i, length);
          if (temp.size() > 0) {
            List<Integer> moreIntegers = new ArrayList<>();
            for (int j = 0; j < i; j++) {
              moreIntegers.add(thisOne);
            }
            for (List<Integer> available : temp) {
              available.addAll(moreIntegers);
              combinations.add(available);
            }
          }
        }
      }
      combinations.addAll(combinationSumInRange(candidates, target, length - 1));
    }

    return combinations;
  }

  public List<List<Integer>> combinationSumUgly(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> results = combinationSumInRange(candidates, target, candidates.length);
    List<List<Integer>> deduplicated = new ArrayList<>();
    Set<String> temp = new HashSet<>();
    for (List<Integer> result: results) {
      StringBuilder stringBuilder = new StringBuilder();
      for (Integer value: result) {
        stringBuilder.append(value);
        stringBuilder.append(",");
      }
      String thisKey = stringBuilder.toString();
      if (!temp.contains(thisKey)) {
        temp.add(thisKey);
        deduplicated.add(result);
      }
    }

    return deduplicated;
  }


  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> result = new ArrayList<>();
    dfs(result, new LinkedList<>(), candidates, target);
    return result;
  }

  private void dfs(List<List<Integer>> result, LinkedList<Integer> list, int[] arr, int target) {
    if (target == 0) {
      result.add(new LinkedList<>(list));
      return;
    }
    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] <= target) {
        list.addFirst(arr[i]);
        dfs(result, list, Arrays.copyOfRange(arr, 0, i + 1), target - arr[i]);
        list.removeFirst();
      }
    }
  }
}
