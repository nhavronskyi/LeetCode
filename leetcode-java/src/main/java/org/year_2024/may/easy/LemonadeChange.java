package org.year_2024.may.easy;

public class LemonadeChange {
    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int bill : bills) {
            switch (bill) {
                case 5 -> five++;
                case 10 -> ten++;
            }

            if (bill > 5) {
                int change = bill - 5;

                switch (change) {
                    case 5 -> five--;
                    case 15 -> {
                        if (five > 0 && ten > 0) {
                            five--;
                            ten--;
                        } else {
                            five -= 3;
                        }
                    }
                }

                if (five < 0 || ten < 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
