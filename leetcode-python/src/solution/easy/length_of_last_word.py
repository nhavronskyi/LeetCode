def length_of_last_word(s: str) -> int:
    arr = s.strip().split(" ")
    return len(arr[- 1])
