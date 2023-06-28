package org.example.easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        var strings = s.trim().split(" ");
        return strings[strings.length-1].length();
    }
}
