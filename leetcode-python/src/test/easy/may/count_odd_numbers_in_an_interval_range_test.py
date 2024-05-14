import pytest

from src.solution.easy.may.count_odd_numbers_in_an_interval_range import count_odds


@pytest.mark.parametrize("low, high, expected_count", [
    (3, 7, 3),
    (8, 10, 1)
])
def test_count_odd_numbers_in_an_interval(low: int, high: int, expected_count: int):
    assert count_odds(low, high) == expected_count


if __name__ == '__main__':
    pytest.main()
