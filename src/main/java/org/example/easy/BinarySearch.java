package org.example.easy;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int binarySearch = Collections.binarySearch(Arrays.stream(nums).boxed().toList(), target);
        return binarySearch < 0 ? -1 : binarySearch;
    }

    public int myBinarySearch(int[] nums, int target) {
        return myBSearch(nums, target, 0,nums.length - 1);
    }

    private int myBSearch(int[] nums, int target, int smallest, int biggest) {
        if(smallest <= biggest){
            int middle = smallest + (biggest - smallest)/2;
            if(nums[middle] == target){
                return middle;
            }else if(nums[middle] < target){
                return myBSearch(nums,target,middle+1, biggest);
            }
            else{
                return myBSearch(nums,target,smallest, middle-1);
            }
        }
        return -1;
    }
}
