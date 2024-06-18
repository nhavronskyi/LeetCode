class ValidAnagram:
    @staticmethod
    def is_anagram(s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        letters = {}
        for i in range(len(s)):
            s_arg = s[i]
            t_arg = t[i]
            ValidAnagram.__anagram_helper(letters, s_arg, 1)
            ValidAnagram.__anagram_helper(letters, t_arg, -1)

        for val in letters.values():
            if val > 0:
                return False
        return True

    @staticmethod
    def __anagram_helper(letters, arg, num):
        if arg in letters:
            letters[arg] += num
        else:
            letters.update({arg: num})
