# -*- coding: utf-8 -*-

from src.solutions.a0000blank import Solution
import unittest

class TestSolution(unittest.TestCase):
    solution = Solution()

    def test_method(self):
        expect = 0
        actual = self.solution.method()
        self.assertEqual(expect, actual)

if __name__ == "__main__":
    unittest.main()
