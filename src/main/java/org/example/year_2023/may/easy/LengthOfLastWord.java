package org.example.year_2023.may.easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        var strings = s.trim().split(" ");
        return strings[strings.length - 1].length();
    }
}
