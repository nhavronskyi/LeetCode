import pytest

from src.solution.easy.roman_to_integer import roman_to_int


@pytest.mark.parametrize("value, expected", [
    ["III", 3],
    ["LVIII", 58],
    ["IX", 9],
    ["XIX", 19],
    ["MCMXCIV", 1994]
])
def test_roman_to_int(value, expected):
    assert roman_to_int(value) == expected


if __name__ == '__main__':
    pytest.main()
