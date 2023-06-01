package org.example.easy;

public class SmallestEvenMultiple {
    public int solution(int n) {
        int i = 2;
        while(true){
            if(i % 2 == 0 && i % n == 0){
                return i;
            }
            i++;
        }
    }
}
