import pytest

from src.solution.easy.april.to_lower_case import to_lower_case


@pytest.mark.parametrize(
    "input, expected", [
        ("Hello", "hello"),
        ("here", "here"),
        ("LOVELY", "lovely"),
        ("al&phaBET", "al&phabet")
    ]
)
def test_to_lower_case(input, expected):
    assert to_lower_case(input) == expected


if __name__ == '__main__':
    pytest.main()
