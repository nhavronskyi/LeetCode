package org.example.easy;

public class AddBinary {
    public String addBinary(String a, String b) {
        String result = addBinaryHelper(a, b, a.length() - 1, b.length() - 1, 0, "");
        return new StringBuilder(result).reverse().toString();
    }

    private String addBinaryHelper(String a, String b, int aLength, int bLength, int carry, String result) {
        if (aLength < 0 && bLength < 0) {
            return carry != 0 ? result + carry : result;
        }

        if (aLength >= 0) {
            carry += a.charAt(aLength) - '0';
        }

        if (bLength >= 0) {
            carry += b.charAt(bLength) - '0';
        }

        return addBinaryHelper(a, b, --aLength, --bLength, carry / 2, result + carry % 2);
    }
}
