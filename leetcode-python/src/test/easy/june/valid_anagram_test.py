import unittest

from src.solution.easy.june.valid_anagram import ValidAnagram as va


class MyTestCase(unittest.TestCase):
    def test_anagram(self):
        self.assertTrue(va.is_anagram("anagram", "nagaram"))

    def test_not_anagram(self):
        self.assertFalse(va.is_anagram("rat", "cat"))


if __name__ == '__main__':
    unittest.main()
