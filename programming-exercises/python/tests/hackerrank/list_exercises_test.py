import unittest

from hackerrank.lists_exercises import find_the_second_largest_number, sum_them_all, find_the_diagonal_difference


class ListExercisesTestCase(unittest.TestCase):
    def test_find_the_second_largest_number(self):
        self.assertEqual(find_the_second_largest_number([2, 3, 6, 6, 5]), 5)
        self.assertEqual(find_the_second_largest_number([1, 2]), 1)

    def test_sum_them_all(self):
        self.assertEqual(sum_them_all([1, 2, 3, 4, 5]), 15)
        self.assertEqual(sum_them_all([1000000001, 1000000002, 1000000003, 1000000004, 1000000005]), 5000000015)

    def test_find_the_diagonal_difference(self):
        self.assertEqual(find_the_diagonal_difference([[4, 5], [8, 9]]), 0)
        self.assertEqual(find_the_diagonal_difference([[4, 8], [8, 9]]), 3)
        self.assertEqual(find_the_diagonal_difference([[11, 2, 4], [4, 5, 6], [10, 8, -12]]), 15)
