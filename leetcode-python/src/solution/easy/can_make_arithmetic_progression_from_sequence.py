from typing import List


def can_make_arithmetic_progression(arr: List[int]) -> bool:
    arr.sort()
    difference = arr[1] - arr[0]

    i = 2
    while i < len(arr):
        if arr[i] - arr[i - 1] != difference:
            return False
        i += 1

    return True
