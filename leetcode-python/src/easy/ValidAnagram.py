class Solution:
    @staticmethod
    def isAnagram(s: str, t: str) -> bool:
        s_arr = [c for c in s]
        t_arr = [c for c in t]

        s_arr.sort()
        t_arr.sort()

        return s_arr == t_arr
