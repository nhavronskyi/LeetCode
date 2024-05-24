package org.year_2024.may.medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MultiplyStrings {
    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }


        int[] result = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';
                int mul = a * b;

                int sum = mul + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        return Arrays.stream(result)
                .dropWhile(x -> x == 0)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());
    }
}
