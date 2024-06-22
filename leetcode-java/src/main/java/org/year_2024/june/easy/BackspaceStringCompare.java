package org.year_2024.june.easy;

import java.util.Stack;

public class BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        var ss = pushToStack(s);
        var st = pushToStack(t);

        if (ss.size() != st.size()) {
            return false;
        }


        while (!ss.isEmpty() && !st.isEmpty()) {
            if (ss.pop() != st.pop()) {
                return false;
            }
        }
        return true;
    }

    private static Stack<Character> pushToStack(String s) {
        Stack<Character> ss = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!ss.isEmpty()) {
                    ss.pop();
                }
            } else {
                ss.push(c);
            }
        }

        return ss;
    }
}
