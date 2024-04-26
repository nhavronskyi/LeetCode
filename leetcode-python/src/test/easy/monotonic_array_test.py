from typing import List

import pytest

from src.solution.easy.monotonic_array import is_monotonic


@pytest.mark.parametrize("nums", [
    ([1, 2, 2, 3]),
    ([6, 5, 4, 4]),
    ([1, 1, 0])
])
def test_true(nums: List[int]):
    assert is_monotonic(nums) is True


@pytest.mark.parametrize("nums", [
    ([1, 3, 2]),
    ([5, 3, 2, 4, 1])
])
def test_false(nums: List[int]):
    assert is_monotonic(nums) is False


if __name__ == '__main__':
    pytest.main()
