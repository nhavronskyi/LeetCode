package org.example.easy;

import java.util.Stack;

public class ReverseVowelsOfAString {
    public static String reverseVowels(String s) {
        Stack<Character> stack = new Stack<>();
        s.chars()
                .filter(c -> lowerCase(c) || upperCase(c))
                .mapToObj(c -> (char) c)
                .forEach(stack::push);

        StringBuilder stringBuilder = new StringBuilder();

        s.chars()
                .mapToObj(c -> (char) c)
                .forEach(c -> stringBuilder.append(lowerCase(c) || upperCase(c) ? stack.pop() : c));

        return stringBuilder.toString();
    }

    private static boolean lowerCase(int c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    private static boolean upperCase(int c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
