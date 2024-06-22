def square_digits(num):
    s = str(num)
    res = ""
    for e in s:
        res += str(int(e) ** 2)
    return int(res)
