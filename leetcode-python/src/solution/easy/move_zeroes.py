from typing import List


class Solution:
    @staticmethod
    def moveZeroes(nums: List[int]) -> None:
        for i in nums:
            if i == 0:
                nums.remove(i)
                nums.append(i)
