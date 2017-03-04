package cn.hjmao.leetcode.a040combinationsum2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/combination-sum-ii
 *
 * Desc:
 * =====
 * Given a collection of candidate numbers (C) and a target number (T),
 * find all unique combinations in C where the candidate numbers sums to T.
 *
 * Each number in C may only be used once in the combination.
 *
 * Note:
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
 *
 * For example, given candidate set [10, 1, 2, 7, 6, 1, 5] and target 8,
 * A solution set is:
 * [
 *   [1, 7],
 *   [1, 2, 5],
 *   [2, 6],
 *   [1, 1, 6]
 * ]
 */

public class Solution {
  private List<List<Integer>> combinate(int[] candidates, int target, int length) {
    List<List<Integer>> combinations = new ArrayList<>();

    List<List<Integer>> hasMeLists = new ArrayList<>();
    if (target == candidates[length - 1]) {
      hasMeLists.add(new ArrayList<>());
    } else if (candidates[length - 1] < target) {
      if (length > 1) {
        hasMeLists = combinate(candidates, target - candidates[length - 1], length - 1);
      }
    }
    for (List<Integer> listHasMe: hasMeLists) {
      listHasMe.add(candidates[length - 1]);
      combinations.add(listHasMe);
    }

    while (length > 1 && candidates[length - 1] == candidates[length - 2]) {
      length--;
    }
    if (length > 1) {
      List<List<Integer>> listNotHasMe = combinate(candidates, target, length - 1);
      combinations.addAll(listNotHasMe);
    }

    return combinations;
  }

  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    Arrays.sort(candidates);
    return combinate(candidates, target, candidates.length);
  }
}
