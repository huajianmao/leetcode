# -*- coding: utf-8 -*-

################################################
#
# URL:
# =====
# https://leetcode.com/problems/two-sum/
#
# DESC:
# =====
# Given an array of integers, return indices of the two numbers such that they add up to a specific target.
# 
# You may assume that each input would have exactly one solution, and you may not use the same element twice.
# 
# Example:
# 
# Given nums = [2, 7, 11, 15], target = 9,
# 
# Because nums[0] + nums[1] = 2 + 7 = 9,
# return [0, 1].
################################################

from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict = {}
        for index, num in enumerate(nums):
            pair = target - num
            if pair in dict:
                return [dict[pair], index]
            else:
                dict[num] = index
