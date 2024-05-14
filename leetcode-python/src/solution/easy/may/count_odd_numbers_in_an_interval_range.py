def count_odds(low: int, high: int) -> int:
    counter = 0
    for num in range(low, high + 1):
        if num % 2 == 1:
            counter += 1
    return counter
