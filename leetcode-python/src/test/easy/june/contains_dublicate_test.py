import unittest

from src.solution.easy.june.contains_dublicate import contains_duplicate


class MyTestCase(unittest.TestCase):
    def test_true(self):
        t = [
            [1, 2, 3, 1],
            [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
        ]

        for e in t:
            self.assertTrue(contains_duplicate(e))

    def test_false(self):
        t = [
            [1, 2, 3, 4]
        ]

        for e in t:
            self.assertFalse(contains_duplicate(e))


if __name__ == '__main__':
    unittest.main()
