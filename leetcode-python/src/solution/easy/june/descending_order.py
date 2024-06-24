def descending_order(num):
    num = sorted(str(num))

    res = 0
    i = len(num) - 1

    while i >= 0:
        res *= 10
        res += int(num[i])
        i -= 1

    return res
