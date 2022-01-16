package com.algorithms.arrays;

import java.util.*;

public class TwoNumberSum {

    public static int[] twoNumberSumUsingHashMapTwoLoops(int[] array, int targetSum) {

        final Map<Integer, Integer> numberOfArray = new HashMap<>();
        for (int i=0; i< array.length; i++){
            numberOfArray.put(array[i], i);
        }

        for (int i=0; i< array.length; i++){
            final int x = array[i];
            final int y = targetSum - x;

            if(!numberOfArray.containsKey(y) || i == numberOfArray.get(y)){
                continue;
            }
            return new int[]{x, y};
        }

        return new int[0];
    }

    public static int[] twoNumberSumUsingHashMapOneLoop(int[] array, int targetSum) {

        final Map<Integer, Integer> numberOfArray = new HashMap<>();
        for (int i=0; i< array.length; i++){
            final int x = array[i];
            final int y = targetSum - x;
            if(!numberOfArray.containsKey(y)){
                numberOfArray.put(array[i], i);
                continue;
            }
            return new int[]{x, y};
        }

        return new int[0];
    }

    public static int[] twoNumberSumUsingHashSetOneLoop(int[] array, int targetSum) {
        final Set<Integer> numberOfArray = new HashSet<>();
        for (final int x : array) {
            final int y = targetSum - x;
            if (numberOfArray.contains(y)) {
                return new int[]{x, y};
            }
            numberOfArray.add(x);
        }
        return new int[0];
    }

    public static int[] twoNumberSumUsingTwoArrays(int[] array, int targetSum) {

        for (int i=0; i< array.length; i++){
            for (int j=array.length-1; j>=0; j--){
                final int x = array[i];
                final int y = array[j];
                final int currentSum = x + y;
                if(x != y && currentSum == targetSum){
                    return new int[]{x, y};
                }
            }
        }
        return new int[0];
    }

    public static int[] twoNumberSumUsingWhileLoop(int[] array, int targetSum) {

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
