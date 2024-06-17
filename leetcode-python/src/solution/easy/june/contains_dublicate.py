from typing import List


def contains_duplicate(nums: List[int]) -> bool:
    s = set()
    for num in nums:
        s.add(num)
    return len(s) != len(nums)
