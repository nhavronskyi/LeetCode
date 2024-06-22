import unittest

from src.solution.easy.june.highest_and_lowest import high_and_low


class MyTestCase(unittest.TestCase):
    def test_something(self):
        args = [
            ["5 1", "1 2 3 4 5"],
            ["5 -3", "1 2 -3 4 5"],
            ["9 -5", "1 9 3 4 -5"],
            ["42 -9", "8 3 -5 42 -1 0 0 -9 4 7 4 -4"]
        ]
        for arg in args:
            self.assertEqual(arg[0], high_and_low(arg[1]))


if __name__ == '__main__':
    unittest.main()
