package org.example.year_2023.aug.easy;

public class ExcelSheetColumnNumber {
    public static int titleToNumber(String columnTitle) {
        return columnTitle.chars()
                .map(c -> c - 'A' + 1)
                .reduce(0, (result, digit) -> result * 26 + digit);
    }
}
