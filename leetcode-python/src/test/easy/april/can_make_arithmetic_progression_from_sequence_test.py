import unittest

from src.solution.easy.april.can_make_arithmetic_progression_from_sequence import can_make_arithmetic_progression


class Test(unittest.TestCase):

    def test_true(self):
        self.assertTrue(can_make_arithmetic_progression([3, 5, 1]))

    def test_false(self):
        self.assertFalse(can_make_arithmetic_progression([1, 2, 4]))


if __name__ == '__main__':
    unittest.main()
