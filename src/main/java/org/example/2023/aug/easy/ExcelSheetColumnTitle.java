package org.example.aug.easy;

public class ExcelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        for (; columnNumber-- > 0; columnNumber /= 26) {
            sb.append((char) (columnNumber % 26 + 'A'));
        }
        return sb.reverse().toString();
    }
}
