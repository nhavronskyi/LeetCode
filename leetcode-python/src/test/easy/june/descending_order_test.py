import unittest

from src.solution.easy.june.descending_order import descending_order

class Test(unittest.TestCase):
    def test_sorted(self):
        arr = [
            [0, 0],
            [51, 15],
            [987654321, 123456789],
            [44321, 43412]
        ]
        for e in arr:
            self.assertEqual(e[0], descending_order(e[1]))

if __name__ == '__main__':
    unittest.main()
