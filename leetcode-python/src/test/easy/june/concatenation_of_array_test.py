import unittest

from src.solution.easy.june.concatenation_of_array import ConcatenationOfArray


class MyTestCase(unittest.TestCase):
    def test_something(self):
        con = ConcatenationOfArray()

        args = [
            [[1, 2, 1, 1, 2, 1], [1, 2, 1]],
            [[1, 3, 2, 1, 1, 3, 2, 1], [1, 3, 2, 1]]
        ]
        for arg in args:
            self.assertEqual(arg[0], con.get_concatenation(arg[1]))


if __name__ == '__main__':
    unittest.main()
