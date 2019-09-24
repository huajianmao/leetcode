# -*- coding: utf-8 -*-

from src.solutions.a0001twosum import Solution
import unittest

class TestSolution(unittest.TestCase):
    solution = Solution()

    def test_twoSum1(self):
        nums = [2, 7, 11, 15]
        target = 9
        expect = [0, 1]
        actual = self.solution.twoSum(nums, target)
        self.assertEqual(expect, actual)

if __name__ == "__main__":
    unittest.main()
