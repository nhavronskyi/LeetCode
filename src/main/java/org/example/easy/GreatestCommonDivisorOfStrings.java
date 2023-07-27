package org.example.easy;

public class GreatestCommonDivisorOfStrings {
    public static String gcdOfStrings(String str1, String str2) {
        return str2.length() > str1.length() ? gcdOfStrings(str2, str1) :
                str2.equals(str1) ? str1 :
                        str1.startsWith(str2) ? gcdOfStrings(str1.substring(str2.length()), str2) :
                                "";
    }
}
