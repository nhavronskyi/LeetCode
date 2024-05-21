def add_binary(a: str, b: str) -> str:
    res = ''
    a_len = len(a) - 1
    b_len = len(b) - 1
    carry = 0
    while a_len >= 0 or b_len >= 0 or carry > 0:
        if a_len >= 0:
            carry += int(a[a_len])
            a_len -= 1
        if b_len >= 0:
            carry += int(b[b_len])
            b_len -= 1

        res = str(carry % 2) + res
        carry //= 2

    return res
