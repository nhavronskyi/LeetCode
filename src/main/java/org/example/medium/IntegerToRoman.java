package org.example.medium;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        Map<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        StringBuilder str = new StringBuilder();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (num >= entry.getKey()) {
                while (num >= entry.getKey()) {
                    num -= entry.getKey();
                    str.append(entry.getValue());
                }
            }
        }

        return str.toString();
    }
}
