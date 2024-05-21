import pytest

from src.solution.easy.may.add_binary import add_binary


@pytest.mark.parametrize("expected, a, b", [
    ("100", "11", "1"),
    ("10101", "1010", "1011")
])
def test_add_binary(expected: str, a: str, b: str):
    assert add_binary(a, b) == expected


if __name__ == '__main__':
    pytest.main()
