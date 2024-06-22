import unittest

from src.solution.easy.june.square_every_digit import square_digits


class MyTestCase(unittest.TestCase):
    def test_something(self):
        t = [
            [0, 0],
            [811181, 9119]
        ]
        for e in t:
            self.assertEqual(e[0], square_digits(e[1]))


if __name__ == '__main__':
    unittest.main()
