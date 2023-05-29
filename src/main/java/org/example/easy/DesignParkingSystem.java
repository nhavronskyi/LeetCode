package org.example.easy;

// https://leetcode.com/problems/design-parking-system/description/
public class DesignParkingSystem {
    private int big;
    private int medium;
    private int small;

    public DesignParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1 && big != 0) {
            big--;
            return true;
        } else if (carType == 2 && medium != 0) {
            medium--;
            return true;
        } else if (carType == 3 && small != 0) {
            small--;
            return true;
        } else {
            return false;
        }
    }
}
