class Solution:
    @staticmethod
    def merge_alternately(word1: str, word2: str) -> str:
        res = ""
        for i in range(min(len(word1), len(word2))):
            res += word1[i] + word2[i]
        if len(word1) > len(word2):
            word1, word2 = word2, word1
        return res + word2[len(word1):len(word2)]
