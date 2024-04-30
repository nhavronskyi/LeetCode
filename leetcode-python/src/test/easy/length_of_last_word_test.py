import pytest

from src.solution.easy.length_of_last_word import length_of_last_word


@pytest.mark.parametrize("exp, word", [
    [5, "Hello World"],
    [4, "   fly me   to   the moon  "],
    [6, "luffy is still joyboy"]
])
def test_length_of_last_word(exp: int, word: str) -> None:
    assert exp == length_of_last_word(word)


if __name__ == '__main__':
    pytest.main()
