from typing import List

import pytest

from src.solution.easy.april.average_salary_excluding_the_minimum_and_maximum_salary import average


@pytest.mark.parametrize("expected, list", [
    (2500, [4000, 3000, 1000, 2000]),
    (2000, [1000, 2000, 3000]),
])
def test_average(expected: float, list: List[int]) -> None:
    assert average(list) == expected


if __name__ == '__main__':
    pytest.main([])
