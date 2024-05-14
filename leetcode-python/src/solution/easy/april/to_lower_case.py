def to_lower_case(s: str) -> str:
    res = ""
    for e in s:
        i = ord(e)
        res += chr(i + 32) if is_upper_case(e) else e

    return res


def is_upper_case(s: str) -> bool:
    return 65 <= ord(s) <= 90
