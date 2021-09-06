package com.algorithms.arrays;

import java.util.Arrays;

public class TwoNumberSum {

    public static int[] twoNumberSum(int[] array, int targetSum) {

        int left = 0;
        int right = array.length - 1;

        Arrays.sort(array);

        while(left < right){
            int sum = array[left] + array[right];
            if(sum == targetSum) return new int[]{array[left], array[right]};
            if(sum < targetSum) left++;
            if(sum > targetSum) right--;
        }
        return new int[0];
    }
}
