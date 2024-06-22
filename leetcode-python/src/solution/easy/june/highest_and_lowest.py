def high_and_low(numbers):
    arr = str(numbers).split(" ")
    min_value = int(arr[0])
    max_value = int(arr[0])

    for e in arr:
        e = int(e)
        if e < min_value:
            min_value = e
        if e > max_value:
            max_value = e

    return "{} {}".format(max_value, min_value)
