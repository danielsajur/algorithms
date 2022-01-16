package com.algorithms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {

        final List<Integer[]> allThreeNums = new ArrayList<>();

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++){
            int left = i + 1;
            int right = array.length - 1;

            while (left < right){

                if(i == left){ continue; }

                int x = array[i];
                int y = array[left];
                int z = array[right];
                final int currentSum = x + y + z;
                if(currentSum == targetSum){
                    allThreeNums.add(new Integer[]{x, y, z});
                    left++;
                    right--;
                }
                if(currentSum < targetSum){ left++; }
                if(currentSum > targetSum){ right--; }
            }
        }

        return allThreeNums;
    }

}
