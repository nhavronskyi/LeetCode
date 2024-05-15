from typing import List


def average(salary: List[int]) -> float:
    sorted_salary = sorted(salary)

    res = sum(sorted_salary[1:-1])
    return res / len(sorted_salary[1:-1])
