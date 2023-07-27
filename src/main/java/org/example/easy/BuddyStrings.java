package org.example.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BuddyStrings {
    public static boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        } else if (s.equals(goal)) {
            Set<String> temp = new HashSet<>(Arrays.asList(s.split("")));
            return temp.size() < goal.length();
        } else {

            int firstDiff = -1;
            int secondDiff = -1;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    if (firstDiff == -1) {
                        firstDiff = i;
                    } else if (secondDiff == -1) {
                        secondDiff = i;
                    } else {
                        return false;
                    }
                }
            }

            return secondDiff != -1 &&
                    s.charAt(firstDiff) == goal.charAt(secondDiff) &&
                    s.charAt(secondDiff) == goal.charAt(firstDiff);
        }
    }
}
