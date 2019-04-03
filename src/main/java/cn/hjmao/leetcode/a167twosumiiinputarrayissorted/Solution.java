package cn.hjmao.leetcode.a167twosumiiinputarrayissorted;

/**
 * Created by hjmao.
 *
 * URL:
 * =====
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 *
 * Desc:
 * =====
 * Given an array of integers that is already sorted in ascending order,
 * find two numbers such that they add up to a specific target number.
 *
 * The function twoSum should return indices of the two numbers
 * such that they add up to the target, where index1 must be less than index2.
 *
 * Note:
 *
 * Your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution
 * and you may not use the same element twice.
 * Example:
 *
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */

public class Solution {

  public int[] twoSum(int[] numbers, int target) {
    int index1 = 1;
    int index2 = numbers.length;

    while (index1 < index2) {
      if (numbers[index1 - 1] + numbers[index2 - 1] > target) {
        index2--;
      } else if (numbers[index1 - 1] + numbers[index2 - 1] < target) {
        index1++;
      } else {
        break;
      }
    }

    return new int[] {index1, index2};

//    int[] indices = new int[2];
//    indices[0] = 1;
//    indices[1] = numbers.length;
//
//    while (indices[0] < indices[1]) {
//      if (numbers[indices[0] - 1] + numbers[indices[1] - 1] > target) {
//        indices[1] = indices[1] - 1;
//      } else if (numbers[indices[0] - 1] + numbers[indices[1] - 1] < target) {
//        indices[0] = indices[0] + 1;
//      } else {
//        break;
//      }
//    }
//
//    return indices;
  }
}
