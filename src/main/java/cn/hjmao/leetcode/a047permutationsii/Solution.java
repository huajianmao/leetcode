package cn.hjmao.leetcode.a047permutationsii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hjmao.
 * <p>
 * URL:
 * =====
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.
 * <p>
 * Example:
 * <p>
 * Input: [1,1,2]
 * Output:
 * [
 * [1,1,2],
 * [1,2,1],
 * [2,1,1]
 * ]
 */

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null) {
            return result;
        }
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        permuteHelper(nums, used, new ArrayList<>(), result);
        return result;
    }

    private void permuteHelper(int[] nums, boolean[] used, List<Integer> runList, List<List<Integer>> result) {
        if (runList.size() == nums.length) {
            result.add(new ArrayList<>(runList));
            return;
        }

        for (int i = 0; i < nums.length;) {
            if (!used[i]) {
                used[i] = true;
                runList.add(nums[i]);
                permuteHelper(nums, used, runList, result);
                used[i] = false;
                runList.remove(runList.size() - 1);
                i++;
                while (i < nums.length && nums[i] == nums[i - 1]) {
                    i++;
                }
            } else {
                i++;
            }
        }
    }
}
