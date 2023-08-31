package org.example.july.db;

public class ReverseString {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            var temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            ++left;
            --right;
        }
    }
}
