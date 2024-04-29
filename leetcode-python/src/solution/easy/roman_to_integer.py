def roman_to_int(s: str) -> int:
    res = 0
    length = len(s)
    s += " "
    for i in range(length):
        roman = roman_symbol_calculator(s[i])
        next_roman = roman_symbol_calculator(s[i + 1])
        if roman < next_roman:
            res -= roman
        else:
            res += roman

    return res


def roman_symbol_calculator(roman: str) -> int:
    switch = {
        "I": 1,
        "V": 5,
        "X": 10,
        "L": 50,
        "C": 100,
        "D": 500,
        "M": 1000,
        " ": 0
    }
    return switch[roman]
