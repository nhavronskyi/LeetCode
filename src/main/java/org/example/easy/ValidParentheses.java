package org.example.easy;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char brace : s.toCharArray()) {
            switch (brace) {
                case '(', '[', '{', '<' -> stack.push(brace);
                case ')', ']', '}', '>' -> {
                    if (stack.empty()) {
                        return false;
                    }
                    char top = stack.pop();
                    if ((brace == ')' && top != '(') ||
                            (brace == ']' && top != '[') ||
                            (brace == '}' && top != '{') ||
                            (brace == '>' && top != '<')) {
                        return false;
                    }
                }
            }
        }
        return stack.size() == 0;
    }
}
